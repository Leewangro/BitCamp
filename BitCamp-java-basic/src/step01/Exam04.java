//리터럴(literal)
package step01;
public class Exam04{
    public static void main(String[] args){
        //숫자
        //정수 값은 4byte 또는 8byte 크기로 밖에 표현할 수 없다.
        //정수 - 4byte 크기의 정수
        System.out.println(10);
        System.out.println(+10);
        System.out.println(-10);

        //정수 - 8byte 크기의 정수
        System.out.println(10l);
        System.out.println(+10l);
        System.out.println(-10l);
        
        //부동소수점 - 8byte 크기의 정수
        System.out.println(3.14);
        System.out.println(31.4e-1);

        
        //부동소수점 - 4byte 크기의 정수
        System.out.println(3.14f);
        System.out.println(31.4e-1f);


        //문자열
        System.out.println("오호");
        System.out.println('꺽');
        System.out.println(true);
        System.out.println(false);
    }
}

//자바 코드로 값을 표현(Literal)하는 방법