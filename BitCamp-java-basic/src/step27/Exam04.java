// 람다(lambda) - 아규먼트로 람다 표현식 바로 사용하기
package step27;

public class Exam04 {

    static interface Calculator {
        int compute(int a, int b);
    }
    
    static void test(Calculator c) {
        System.out.println(c.compute(100, 200));
        
    }
    
    public static void main(String[] args) {
        
        test((a,b) -> a+b);
        
        test(new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a+b;
            }
        });
        // 여러 문장을 실행하는 경우 블록 {}으로 감싸라!
        test((a,b) -> {
            int sum = 0;
            for(int i = a; i <= b; i++) {
                sum +=i;
            }
            return sum;
        });
    }
}



