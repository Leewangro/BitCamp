// Byte Stream - 바이트 배열 특정 부분 출력하기.
package step22.ex2;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Exam03_1 {

    public static void main(String[] args)throws Exception {
        FileWriter out = new FileWriter("temp/test2.txt");
        
        char[] chars = new char[] {'가','각','간','똘','똠','똣'};
        
        out.write(chars,2,3); // 2번 데이터부터 3 문자를 출력한다.
        
        out.close();
        
        System.out.println("데이터 출력 완료!");
        
    }

}
