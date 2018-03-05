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
      
      
      
    }
}

