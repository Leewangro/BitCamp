// 문자 변수 - 유효한 값 범위
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam06_1{
    public static void main(String[] args) {
      //0에서 65535까지의 utf-16코드 값을 저장하는 2바이트 메모리
      char c;
      c=0;
      c=65535;
      //비록 정수 리터럴의 크기가 4바이트 일 지라도 
      //그 리터럴 값이 메모리에 저장될 수 있다면 허락한다.
    /*  c= -1;  범위초과하는 컴파일 오류 발생
      c= 65536;
    */
    }
}

