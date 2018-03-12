// 배열 - 배열 레퍼런스와 배열 인스턴스(배열의 비밀)
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam09_3{
    public static void main(String[] args) {
      //레퍼런스 변수이다.
      //-메모리에 주소를 담는 변수이다
        int[] arr;
      //new 명령은 메모리를 확보하는 명령이다.
      //-리턴 값은 확보된 메모리의 시작 주소이다.
      //-이렇게 값을 저장하기 위해 확보된 메모리를 '인스턴스'라 부른다
        
      arr1 =new int[5];
   
      arr1[0] = 100;
      //arr1에 저장된 주소로 찾아가서 0번째 항목에 값을 넣어라
      arr1[1] = 100;
      //arr1에 저장된 주소로 찾아가서 1번째 항목에 값을 넣어라

      System.out.println(arr1[0]);
      System.out.println(arr1[1]);
      //단 한 번이라도 메모리에 값을넣지 않은 상태에서
      //그 메모리의 값을 사용하려 하면 컴파일 오류가 발생한다.
      int a;
      System.out.println(a);
      //
    }
}
//레퍼런스(reference) 
// - 값이 아닌 메모리의 주소를 담는 변수
// 
//인스턴스(instanace)
// - 값을 저장하고 있는 메모리