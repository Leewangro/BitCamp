// 변수 초기화 - 초기화 문장과 생성자의 실행 순서
package step08;

public class Exam05_3 {

    static class A {
        int a = 200;
        // 생성자는 초기화 문장을 실행한 후에 호출된다
        A() {
            a = 300;
        } // int a = 200으로 먼저 a에 200이 채워진 다음에 생성자인 A에 있는 a에 300을 채우는 순서로 진행됨
    }
    public static void main(String[] args) {
        A obj1 =new A();
        System.out.println(obj1.a);
    }

}
    