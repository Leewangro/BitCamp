// 변수의 사용 범위 - 변수의 중복
package step02;

public class Exam11_3 {
    int a; //인스턴스 변수
    static int b; //클래스 변수
    public static void main(String[] args/*로컬변수=파라미터*/) {
       int a; //로컬변수
       //클래스 블록 안에 선언된 변수는 종료유 상관없이 중복 선언 불가 

       public static void main(String[] args/*로컬변수=파라미터*/) {
            //그러나 메서드 블록에서는 클래스에 선언된 변수의 이름과
            // 같은 변수를 선언할 수 있다.
            //왜? 영역이 다르니까!
            int a;
            int b;

        // 마찬가지로 이 블록 안에서는 같은 이름의 변수를 만들 수 없다.
        String a; //데이터 타입에 상관없이 이름 중복 불가

    }
    public static void m2() {
        int a;
        int b;
        }
    }
}
