// 초기화 블록 - 클래스 블록 = 스태틱 블럭
package step08;

public class Exam06_5 {
    public static class A {
        static float pi;
        static float area(int r) {
            return 2*pi*r;
        }
        
        // 스태틱 블록은 클래스가 로딩된 후에 자동으로 순서대로 실행된다.
        static {
            pi = 3.141592f;
        }
        
    }
      
    public static void main(String[] args) throws Exception {
        System.out.println(A.area(25));
    }
}
