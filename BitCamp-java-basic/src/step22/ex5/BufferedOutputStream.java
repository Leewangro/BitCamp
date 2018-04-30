package step22.ex5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream{
    byte[] buf = new byte[8196];
    int cursor;

    public BufferedOutputStream(String filename) throws FileNotFoundException {
        super(filename);
    }

    @Override
    public void write(int b) throws IOException{

        if(cursor == buf.length) { // 버퍼가 다 차면 버퍼에 있는 바이트를 한번에 출력할 것이다.
            this.write(buf);// 버퍼에 들어있는 데이터를 한 번에 출력한다.
            cursor = 0; // 다시 커서를 초기화
        }

        // 1바이트를 출력하라고 하면 일단 버퍼에 저장할 것이다.
        buf[cursor++] = (byte)b;
    }

    @Override
    public void close() throws IOException{
        if(cursor>0) {
            this.write(buf, 0, cursor);
        }
        super.close();
    }
    @Override
    public  void flush() throws IOException {
        if(cursor>0) {
            this.write(buf, 0, cursor);
            cursor = 0;
        }
    }
}
