package step11.ex11;

public class C2 extends C {
    // 다음은 C의 메서드를 오버라이딩 한 게 아니다!
    // 왜? C의 m1()은 private이기 때문에 오직 C에서만 사용할 수 있다.
    //  C2에서 접근할 수 없다. 접근할 수 없으니, 오버라이딩은 불가능하다.
    
    //@Override
    //private void m1() {}
    
            //@Override 빼니까 m1() 정의가 되는데요?
            //이건 오버라이딩이 아니라 c2에 새로 메서드가 추가된 것이다.
            //오버라이딩이라면 @Override 애노테이션을 붙였을 때 오류가 나지 말아야 한다./
    
    //결론
    // 접근 권한이 없는 메서드는 오버라이딩 불가!
    
    
    
    /* 다음은 전형적인 오버라이딩 예이다 
    @Override
    protected void m2() {}
    void m3() {}
    public void m4() {}
    */
    
    
    // 오버라이딩 할 때(메서드를 재정의 할 때)
    // 원본 보다 접근 범위를 확대할 순 있지만 좁힐 수는 없다.
    //@Override private void m2() {} // 컴파일 오류 - protected => private
    //@Override void m2() {} // 접근 범위를 protected에서 (default)로 좁혔기 때문에 컴파일 오류
    
    
    //접근 범위를 확대하는 것은 괜찮다.
    @Override public void m2() {} // protected 보다 접근 범위를 확대 했기 때문에 ok
    
    @Override void m3() {}
}

// 멤버의 접근 범위
// private : 같은 클래스
// (default) : 같은 클래스 + 같은 패키지
// protected : 같은 클래스 + 같은 패키지 + 서브클래스
//public : 모두

//결론
// 수퍼 클래스의 메서드를 자식 클래스가 재정의할 때
// 접근 범위를 확대할 순 있지만 좁힐 수는 없다.