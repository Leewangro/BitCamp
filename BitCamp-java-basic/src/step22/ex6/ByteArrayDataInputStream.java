package step22.ex6;

import java.io.ByteArrayInputStream;

public class ByteArrayDataInputStream extends ByteArrayInputStream{

    public ByteArrayDataInputStream(byte[] buf) {
        super(buf);
    }
    
    
    public String readUTF() throws Exception{
        byte[] buf = new byte[100];
        int size = this.read();
        this.read(buf, 0, size);
        
        return new String(buf,0,size,"UTF-8");
    }
    
    
    public int readInt() throws Exception{

        int member = 0;

        member = this.read() << 24;
        member += this.read() << 16;
        member += this.read() << 8;
        member += this.read();

        return member;
    }

    public boolean readBoolean() throws Exception{
        if(this.read() ==1)
            return true;
        else
            return false;
    }
}
