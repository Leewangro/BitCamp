// 던지는 예외 받기 - 다형적 변수의 특징을 이용하여 여러 예외를 한 catch에서 받을 수 있다.
package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam05_2 {

    // 메서드에서 발생되는 모든 예외를 나열하기
    static void m(int i) 
            throws Exception, RuntimeException, SQLException, IOException {
        if (i == 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2) 
            throw new SQLException();
        else 
            throw new IOException();
    }

    // 공통 분모를 사용하여 퉁치는 방법
    // => 메서드에서 발생하는 예외의 공통 수퍼 클래스를 지정하면 된다.
    // => 호출자에게 어떤 오류가 발생하는지 정확하게 알려주는 것이 유지보수에 도움이 된다.
    //    따라서 가능한 그 메서드에서 발생하는 예외를 모두 나열하라!
    static void m2(int i) throws Exception {
        if (i < 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2) 
            throw new SQLException();
        else 
            throw new IOException();
    }
    static void test1()throws Exception {
        try {
        m(-1);
        } finally {
            //try 블록을 나가기 전에 무조건 실행해야 할 작업이 있다면
            // catch 블록이 없어도 finally 블록을 사용할 수 있다.
            System.out.println("정상적인 실행일 때");
        }
    }
    static void test2()throws Exception {
        try {
        m(0);
        } finally {
            System.out.println("에러 발생 시");
        }
    }

    public static void main(String[] args) {
        
        try { test1();} catch(Exception e) {}
        try { test2();} catch(Exception e) {}
            
    }

}