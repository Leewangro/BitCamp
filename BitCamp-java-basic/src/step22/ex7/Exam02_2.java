// 버퍼 사용 전 - 파일 복사 및 시간 측정
package step22.ex7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam02_2 {

    public static void main(String[] args) throws Exception {
        
        FileInputStream fileIn = new FileInputStream("temp/jls8.pdf");
        BufferedInputStream in = new BufferedInputStream(fileIn);
        
        FileOutputStream fileOut = new FileOutputStream("temp/jls8_5.pdf");
        BufferedOutputStream out = new BufferedOutputStream(fileOut);

        
        
        int b;
        
        long startTime = System.currentTimeMillis(); // 밀리초
        
        while ((b = in.read()) != -1) ; // 파일을 끝까지 읽는다.
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        
        in.close();
    }

}