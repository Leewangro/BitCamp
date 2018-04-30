// 인터페이스 다중 상속 불가
package step14.ex4;

// 인터페이스는 다중 상속이 가능하다.
// 왜? 아직 구현하기 전의 메서드이기 때문에
//  어떤 인터페이스의 메서드를 상속 받더라도 똑같다.

// 상위 인터페이스에 있는 메서드 중에서
// 메서드명과 파라미터 형식은 같지만
// 리턴 타입이 다른 그런 메서드가 있다면
// 둘 중 어떤 것을 상속 받느냐에 따라 규칙이 달라지기 때문에
// 이런 경우에는 다중상속을 지원하지 않는다.
public interface C2 extends A,B2{
    void m3();
}