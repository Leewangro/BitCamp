// Worker 구현체 사용
package step14.ex2;

public class Exam01 {
    public static void main(String[] args) {
        // 인터페이스의 인스턴스는 만들 수 없다.
        //A4 obj = new A4(); //에러
        
        //인터페이스의 모든 변수는 static변수이다.
        System.out.println(A4.v1);
        
        // 그런데 final이기 때문에 값을 바꿀 수 없다.
        //A4.v2 = 300; //에러
    }
}
