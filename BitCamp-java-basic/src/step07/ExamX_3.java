// 사용자 정의 데이터 타입 - 인스턴스 메서드
package step07;

public class ExamX_3 {
        
    public static void main(String[] args) {
        // 사용자 정의 데이터 타입의 값을 연산자를 사용하여 다뤄보자!
        Score3 score = new Score3();
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        
        //다음은 Score의 값을 다루기 위해 non-instance 메서드를 호출하는 예이다.
        // => non-instance 메서드 = static 메서드 = 클래스 메서드
        /*
        Score2.calculate(score);
        */
        
        // 클래스 메서드를 사용할 때 마다 매번 인스턴스의 주소를 파라미터로 넘겨줘야 했다.
        // 그러나 인스턴스 메서드를 사용하는 순간 파라미터가 아닌
        // 매서드 앞에 인스턴스 주소를 준다.
        // 훨씬 소스 코드의 목적을 이해하는데 직관적이다.
        score.calculate(); //변수 뒤에 연산자를 놓는i++의 예와 비슷하다.
        

        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", score.name, score.kor, score.eng,
                            score.math, score.sum, score.average);
    }
}
//byte 와  byte를 연산해도 결과는 int 메모리에 담긴다 -> 자바는 기본 연산 단위가 int 이기 때문에
// int 와 long 도 연산이 안 된다. ->4바이트인 int와 8바이트인 long이기 떄문에 8바이트인 long으로 변환해서 계산