// 논리연산자
package step04;

public class Exam03_5 {
    public static void main(String[] args) {
        int a = 0b0110_1100;
        int b = 0b0101_0101;
        // System.out.println(a && b);
        // System.out.println(a || b); // 컴파일 오류! 정수값에서는 사용불가

        System.out.println(a & b); // 각 비트단위로 값을 연산한다. 

        System.out.println(a | b); // 각 비트단위로 값을 연산한다.
        
        System.out.println(a ^ b); // 각 비트단위로 값을 연산한다. 

        System.out.println(~a); // 각 비트단위로 값을 연산한다. 

        System.out.println(a); // 각 비트단위로 값을 연산한다. 

        System.out.println(b); // 각 비트단위로 값을 연산한다. 
        
    }
}