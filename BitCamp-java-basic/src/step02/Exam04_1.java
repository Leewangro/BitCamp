//정수 변수-정수 리터럴과 정수 변수
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam04_1{
    public static void main(String[] args) {
      byte b;
      //정수 리터럴은 기본이 4바이트 메모리를 차지한다.
      //그런데 byte메모리에 저장할 수 있는 값이라면 허락한다.

      b= -128;
      b= 127;
      //다음과 같이 4byte 리터럴 값이 메모리에 넣을 수 없다면
      //컴파일 오류가 발생한다.
     // b= -129;//컴파일오류
      short s;
      //4바이트 정수 리터럴을 short 메모리에(2byte)에 저장할 수 있다면 허락한다.
      s= -32768;
      s= 32767;
      //다음은 메모리의 문제가 아니다.
      //정수 값을 표현할 때 4바이트 크기를 넘어가는 수를 표현했기 때문에
      //오류가 발생한 것이다.
      //4바이트 크기를 넘어가는 정수를 표현할 때는
      //반드시 숫자 뒤에 L을 표시해야 한다.
      int i;
     // i= -2147483648L; //컴파일 오류가 남 - 8바이트 수를 4바이트 변수에 저장했는데 4바이트에서는 8바이트의 수를 표현할 수 없기 때문에 저장할 수 없다
     // i= 2147483648L;   <-정상적으로 출력하려면 2147483647L가 되야함
      //다음은 4바이트가 넘어가는 수에 대해 L또는 l을 붙임으로써
      //정수 리터럴을 잘 표현했다.
      //그러나 i 메모리가 4바이트 크기를 갖기 때문에 
      //오른쪽에 값을 저장할 수 없다. 그래서 컴파일 오류가 발생한다.
      long l;
      l= -9223372036854775808L;
      l= 9223372036854775807L;

      byte b2;
     
      b2=100;
      b2=100L;//컴파일 오류
      //4바이트 정수 리터럴에 대해서만
      //byte나 short 메모리에 유효한 값을 저장할 수 있게 허락한다.
      //8바이트 정수 리터럴일 경우에는
      //비록 byte 
     
      System.out.println(b);
       
    }
}

