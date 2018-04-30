// Reflection API : 클래스 로딩과
package step18.ex1;

public class Exam05 {
    static class A{
        void m() {
            System.out.println("hello");
        }
    
    }
    
    static {
        System.out.println("A클래스 로딩");
    }
    
    public static void main(String[] args)throws Exception{
        Class clazz = Class.forName("step18.ex1.Exam05$A");
        //타입(클래스)정보만 있다면 인스턴스를 생성할 수 있다.
        A obj = (A)clazz.newInstance();
        obj.m();
        
    }

}
