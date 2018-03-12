//형변환
package step04;

public class Exam02_1 {
public static void main(String[] args) {
        //비교의 결과는 true 또는 false이다.
        //즉 boolean 값이다.
        int a = 10;
        int b = 20;
        //boolean r1 = a < b;
       // int r2 = a < b;

        System.out.println( a < b);
        System.out.println( a <= b);
        System.out.println( a > b);
        System.out.println( a >= b);
        System.out.println( a = b);
        System.out.println( a != b);

        double f1 = 978.6543;
        double f2 = 1.111111;
        System.out.println((f1 + f2) == 988.7645);
    }
}
