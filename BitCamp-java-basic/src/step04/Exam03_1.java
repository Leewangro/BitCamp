//논리 연산자
package step04;

public class Exam03_1 {
public static void main(String[] args) {
        
        //and 연산자
        //두 개의 논리 값이 모두 true 일 때 결과가 true가 된다
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //or 연산자
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //not 연산자
        //-true 는 false 로 false는 true로 바꾼다
        System.out.println(!true);
        System.out.println(!false);

        //exclusive or 연산자
        // 배타적 비교 연산자라 부른다.
        // 두 개의 값이 다를 때 true이다
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        
    }
}
