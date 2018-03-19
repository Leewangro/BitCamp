// 매서드 분류 - 인스턴스 변수와 인스턴스 메서드
package step07;

public class ExamY_5 {
        
    public static void main(String[] args) {
        // 계산 결과를 개별적으로 관리하고 싶은가?
        // 그렇다면 개별적으로 관리할 변수를 인스턴스 변수로 선언하라.
        
        // 다음 두 개의 식을 분리하여 계산해 보자!
        // 식1) 2+3-1*7/3 = ?
        // 식2) 3*2+7/4-5 = ?
        //=>연산자 우선 순위를 고려하지않고 순서대로 계산하라
       
        // 두 개의 식의 계산 결과를 따로 관리하기 위해서는
        // result 변수를 개별적으로 생성해야 한다.
        Calculator4 c1 = new Calculator4(); //식1의 계산 결과를 보관할 메모리
        Calculator4 c2 = new Calculator4(); //식2의 계산 결과를 보관할 메모리
        
        // 계산을 수행할 때 계산 결과를 보관할 메모리를 전달하라
        // => 인스턴스 메서드를 사용하면 파라미터로 메모리 주소를 전달할 필요가 없다
        c1.plus(2);
        c2.plus(3);
        
        c1.plus(3);
        c2.multiple(2);
        
        c1.minus(1);
        c2.plus(7);
        
        c1.multiple(7);
        c2.divide(4);
        
        c1.divide(3);
        c2.minus(5);
        
        //Calculator2의 result 변수는 한 개이기 때문에
        // 결과를 출력하면 식1과 식2가 모두 계산된 결과가 출력될 것이다.
        System.out.printf("c1.result = %d\n", c1.result);
        System.out.printf("c2.result = %d\n", c2.result);
    }
}
