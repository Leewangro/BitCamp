// 플러그인으로 전환한 버퍼드인풋스트림 사용하기 - 읽기 시간 측정
package step22.ex7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam02_1 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/jls8.pdf");
        BufferedInputStream in = new BufferedInputStream(fileIn);

        
        
        int b;
        
        long startTime = System.currentTimeMillis(); // 밀리초
        
        int callCount = 0;
        while ((b = in.read()) != -1) ; // 파일을 끝까지 읽는다.
        
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
        System.out.println(callCount);
        
        in.close();
    }

}