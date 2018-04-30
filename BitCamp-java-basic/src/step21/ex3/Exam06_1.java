// 던지는 예외 받기 - finally 블록과 자원 해제
package step21.ex3;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam06_1 {

    static void m() throws Exception {

        // 자원해제시키는 코드를 매번 작성하기 귀찮다
        // => try-with=ewsources 라는 문법을 사용하면
        //    굳이 close()를 사용할 필요 없다.


        try(
                Scanner keyScan = new Scanner(System.in);

                // FileReader 클래스도 java.lang.AutoClaseable 구현체 이다.
                FileReader in = new FileReader("Hello.java");

                // 반드시 AutoCloseable 구현체이어야 한다.
                //String s = "Hello"; // 컴파일 오류

                //if(true) {} //변수 선언만 올 수 있다.
                ){
            System.out.println("입력");
            int value = keyScan.nextInt();
            System.out.println(value * value);

        } finally {
            // 이렇게 정상적으로 실행되든 예외가 발생하든 상관없이
            // 자원해제 같은 일은 반드시 실행해야 한다.
            System.out.println("스캐너 자원 해제");
        }
    }
    public static void main(String[] args) throws Exception{
        m();

    }

}