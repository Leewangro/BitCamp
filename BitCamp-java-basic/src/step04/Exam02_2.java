//관계 연산자 : 부동소수점 비교
package step04;

public class Exam02_2 {
public static void main(String[] args) {
       
        double f1 = 978.6543;
        double f2 = 1.111111;
        System.out.println((f1 + f2) == 988.7654);
        //결과는 false이다.
        //이유?
        //-부동소수점 값을 연산할 때 IEEE 754 명세에 따라
        //작업을 수행한다 그 과정에서 값의 왜곡이 발생할 수 있다.
        //cpu나 os, jvm의 문제가 아니다.
        //IEEE 754 명세에 따라 부동소수점을 처리하는 모든 컴퓨터에서 발생하는 문제.

        System.out.println(f1+f2);

        double x = 234.765411;
        double y = 754.0;
        System.out.println(x + y);

        System.out.println((f1 + f2) == (x + y)); //부동소수점 문제로 false가 뜬다.
        //쓰레기를 무시해야한다
        double EPSILON = 0.00001;
        System.out.println(Math.abs(f1 - f2) -988.765411 < EPSILON);
    }
}
