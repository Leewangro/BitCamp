// 형변환 - 정수 변수와 부동소수점 변수
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam08_3{
    public static void main(String[] args) {
      byte b=100;
      short s=100;
      int i=98765678;
      long l=12345678;
      char c=100;
      
      float f;
      double d;
      //정수 변수의 값을 부동소수점 변수에 저장할 떄
      //값이 짤릴 수 있다.
      //f=b; //byte(1) => float(4) 값을 그대로 저장
      //f=s; //short(2)=>float(4) 값을 그대로 저장
      //f=c; //char(2)=>float(4) 값을 그대로 저장
      f=i;
      System.out.println(f); //int(4)=>float(4) 가수부 크기를 넘는 정수는 잘린다.
      //f=l; //lont(8)=>float(4)
     // d=i; //int(4)=>double(8)
      //d=l; //long(8)=>double(8)
      //주의 컴파일 오류가 발생하지 않는다.
      //double의 가수부는 32비트 크기를 갖는다
      //따라서 int(32비트) 값을 그대로 저장할 수 있다.
      //long(64비트) 값을 double 메모리에 저장할때
      //53비트 가수부를 넘어간다면 값이 잘린다. 
      //주의! 컴파일 오류가 발생하지 않는다.
      i=18_2345_3456_4567_5678L;
      
      //정수 메모리 값을 부동소수점 메모리에 저장할 때 주의해서 사용해라.
      //큰 정수 값이 부동소수점 메모리에 저장될 때 잘릴 수 있다. 
      //(컴파일 오류는 발생하지 않기 때문에 개발자들이 많이 놓친다)

    }
}

