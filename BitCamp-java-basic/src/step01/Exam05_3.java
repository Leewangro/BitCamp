//정수 literal 3-메모리의 크기
package step01;
public class Exam05_3{
    public static void main(String[] args){
        // 정수를 표기할 때 
        //크기에 따라 표기 방법이 다르다.
        //그냥 작성하면 4byte 크기의 정수를 의미한다.

        //메모리 최대크기 구하는 방법 알아놀것.
        
        System.out.println(2147483647); //4byte 양의정수 최댓값 (0을 포함함)
 
        System.out.println(-2147483648); //4byte 음의 정수 최댓값 (0 미포함)

       //4byte 초과하면 컴파일 오류가 난다 
       //숫자가 1 증가하면 4바이트 메모리가 넘치기 때문이다
 //      System.out.println(2147483648); //4byte에서 1만 초과해도 컴파일 오류
 
        //System.out.println(-2147483649);//4byte에서 1만 초과해도 컴파일 오류
  

        //해결방법
        //4바이트 메모리보다 큰 메모리의 크기를 저장하라고 명령을 내려라
        System.out.println(2147483647l);
        System.out.println(-2147483647l);

        //8바이트 정수 최대값 및 최솟값
        //->자바에서는 각 데이터 유형에 따라 최대/최소 값을 알아볼 수 있도록
        //특별한 명령을 제공한다
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


        //다음은 크기가 다른 정수이다.
        System.out.println(2147483647);//4바이트 크기
        System.out.println(2147483647l);//8바이트 크기
    }
}
