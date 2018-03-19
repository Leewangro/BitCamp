// 클래스 용도 - 사용자 정의 데이터 타입을 만들 때 사용
package step07;




public class ExamX_1 {
        
    public static void main(String[] args) {
        
        Score score = new Score();
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        score.sum = score.kor + score.eng + score.math;
        score.average = (float)score.sum  / (float)3;
        

        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", score.name, score.kor, score.eng,
                            score.math, score.sum, score.average);
    }
}
//byte 와  byte를 연산해도 결과는 int 메모리에 담긴다 -> 자바는 기본 연산 단위가 int 이기 때문에
// int 와 long 도 연산이 안 된다. ->4바이트인 int와 8바이트인 long이기 떄문에 8바이트인 long으로 변환해서 계산