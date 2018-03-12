// 형변환 - 명시적 형변환
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam08_5{
    public static void main(String[] args) {
      
      float f=3.14f;
      double d=9876.56789;


      //부동소수점 메모리에 값을 정수 메모리에 저장할 수 없는데
      //값이 짤릴 수 있음을 알면서도
      //부동소수점 값을 정수 메모리에 저장하고 싶을 때
      //또는 큰 메모리의 값을 작은 메모리에 저장하고 싶을 때
      //컴파일러에게 강제로 값을 넣을 것을 명시하라
      int i=(int)f; 
      long l=(long)d; 
      
    }
}
//명시적 형변환 문법
// - 큰 메모리의 값을 작은 메모리로 변환 할 때
// - 부동소수점을 정수로 변환 할 때
// - 문법
//변수 = (바꾸고자하는 타입) 변수또는 값

