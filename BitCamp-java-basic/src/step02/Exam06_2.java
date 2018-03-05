// 문자 변수 - 문자 UTF-16(unicode 2)코드 값 저장
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam06_2{
    public static void main(String[] args) {
      
      char c1,c2;
      c1=0x41;//A문자의 utf-16 code 값임.
      c2=65;
      //println()은 변수의 종류에 따라 출력을 달리한다
      // - 변수의 종류가 char이면, 출력할 때 10진수로 출력하는대신
      //해당 코드의 문자를 찾아 출력한다.
      System.out.println(c1);
      System.out.println(c2);

      //다음 변수에 갈 문자를 저장하여 출력하라
      char c3;
      //변수에 문자 코드를 저장하려면 문자 코드를 암기해야하는데 너무 힘들다
      //해결책
      //자바에서는 문자의 코드표를 알아내는 명령어가 있다.
      //명령어를 사용하면 손쉽게 문자 코드를 얻을 수 있다.
      c3='갈';//작은 따옴표를 사용하라
      //메모리에는 문자를 저장할 수 없다. 해당하는 문자를 utf-16에 정의된 값으로 변환해서 2진수로 저장한다.
      System.out.println(c3);
    }
}

