//정수 literal 1-진수
package step01;
public class Exam05_1{
    public static void main(String[] args){
        //숫자
        //정수 값은 4byte 또는 8byte 크기로 밖에 표현할 수 없다.
        //정수 - 4byte 크기의 정수
        System.out.println(100); //10진수
 
        System.out.println(0144); //8진수

        System.out.println(0b1100100);//2진수

        System.out.println(0x64);//16진수

        //16진수
        //값을 알려주고 싶을 때 사용
        
        //8진수
        //코드에서 거의 사용하지 않는다.

        //2진수
        //메모리 상태를 알려주고 싶을 때 사용한다.

        //16진수
        //2진수로 표기하면 너무 길어지기 때문에 사용한다.

        //결론
        //코드를 작성할 때 주로 10진수로 표기한다.
        //간혹 메모리 상태에 집중하라고 경고하고 싶을 때 16진수를 사용한다.
       
    }
}
