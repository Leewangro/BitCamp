// 오버라이딩 - 오버라이딩 문법 검사!
package step11.ex11;

public class Exam04 {

    public static void main(String[] args) {
        
        B2 obj = new B2();
        
        // B2에서 B의 m() 메서드를 오버라이딩(재정의) 했다고 착각하고
        // 메서드를 사영할 수 있다.
        // => 그런데 B2 클래스를 가보면 m()의 파라밈터가 float이다
        //  즉 오버라이딩을 한 게 아니라 오버로딩을 한 것이 된다.
        
        obj.m(100);
        
        //해결책?
        // => 개발자들의 이런 실수가 많이 발생해서 자바에서는
        //    오버라이딩 여부를 검사하는 특별한 문법을 추가하였다.
    }

}

// 오버라이딩?
// => 부모로부터 상속 받은 메서드 중에서 자신(서브클래스)의 역할에 맞지 않는 메서드가 있다면,
//    자신(서브클래스)의 역할에 맞춰 상속받은 메서드를 재정의하여
//    프로그래밍의 일관성을 확보하는 문법이다.
