//부동소수점의 리터럴-2진수로 변경된 것을 확인하기
package step01;
public class Exam06_3{
    static float f=12.375f;
    public static void main(String[] args){

        System.out.println(12.375f);
    }
}

//컴파일 한 후
//Exam06_3.class 파일을
//visual studio code의 hexadump 기능을 활용하여
//16진수 코드를 확인해보라
//중간에 12.375의 2진수 값인 41 46 00 00값을 볼 수 있을 것이다.