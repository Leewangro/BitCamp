//클래스 사용 - public 클래스와 기본 클래스
package step03;
//패키지 멤버 클래스
//=>패키지에 직접 소속된 클래스이다
//=>다른 클래스들도 A클래스를 사용할 수 있다.


public class Exam04_3 {
    public static void main(String[] args) {
        //다른 패키지의 클래스 사용

        //A클래스는 퍼블릭이 아니라 컴파일 오류가 발생한다
       // step03.test v1=new A();
        //따라서 A클래스를 이용할 수 없다

        //B클래스는 퍼블릭이다.
        //=>그래서 다른 패키지에 소속된 클래스도 B를 사용할 수 있다.
        step03.test.B v2;
    }
}

