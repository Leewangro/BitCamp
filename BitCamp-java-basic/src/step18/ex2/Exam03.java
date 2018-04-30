// 클래스 정보 추출 - 클래스의 중첩 클래스 정보 알아내기
package step18.ex2;

public class Exam03 {
    static class A{
        static class B{} // static nested class
        class C{} // non- static nested class == inner class
        public void m() {
            class D{} // local class
        }
        public void m2() {
            Object obj = new Object(); // anamymas clss
        }
        public static class E{}
        public class F{}
    }


    public static void main(String[] args)throws Exception {
        Class clazz = Class.forName("step18.ex2.Exam03$A");

        Class[] nestedList = clazz.getClasses();

        for(Class nested : nestedList) {
            System.out.println(nested.getName());
        }
    }
}
