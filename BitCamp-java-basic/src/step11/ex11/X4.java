package step11.ex11;

public class X4 extends X3 {
    @Override
    void m1() {
        System.out.println("X4의 m1()");
    }
    void test() {
        this.m1(); // X4의 m1()
        super.m1(); // X2의 m1() -> X3를 찾아 갓으나 없기에 그 전인 X2로 감
        //super.super.m1(); //컴파일 오류
        
        this.m2(); // X3의 m2
        super.m2(); //X3의 m2
    }
}
