// Byte Stream - 읽은 데이터를 바이트 배열의 특정 위치에 저장하기
package step22.ex1;

import java.io.FileInputStream;

public class Exam03_2 {

    public static void main(String[] args)throws Exception {
        FileInputStream in = new FileInputStream("temp/test1.data");
        
        byte[] buf = new byte[100];
        
        // read(버퍼의주소, 저장할 위치, 읽을 바이트 개수)
        
        int count = in.read(buf,10,4);// 4바이트를 읽어 10번 방부터 저장하라
                                      // 10번 방부터 4개의 데이터를 읽어라
        in.close();
        
        System.out.printf("%d\n",count);
        for(int i = 10 ; i < count + 10; i++) {
            System.out.printf("%x\n",buf[i]);
        }
        System.out.println();
    }

}
