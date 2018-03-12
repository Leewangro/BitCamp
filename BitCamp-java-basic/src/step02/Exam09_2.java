// 배열 - 배열 선언과 배열 초기화
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam09_2{
    public static void main(String[] args) {
      
      //배열선언
      int[] arr1=new int[5];
      

      //배열 메모리를 0으로 초기화

      arr1[0]=0;
      arr1[1]=0;
      arr1[2]=0;
      arr1[3]=0;
      arr1[4]=0;
      
      //배열 선언과 초기화를 한 번에 하기
      //int arr[] = new int[5]{0, 0, 0, 0, 0};
      //->배열 갯수 지정해서 오류가남

      //1)배열 선언 + 초기화 명령
      int arr1[] =new int[]{30,20,10};
      //2)배열 선언 후 따로 배열 초기화 문장 실행
      //데이터타입[] 변수명;
      //변수명 = new 데이터타입[]{값,값값};
      //ex)
      int arr2[] = new int[]{0,0,0,0};
      int arr3[] = {0, 0, 0, 0};

      int[] arr4;
      arr4=new int[]{0,0,0,0,};

      int[] arr1 = new int[5];
      int arr2[] = new int[] {0, 0, 0, 0, 0};
      int[] arr3 = {0, 0, 0, 0, 0};
      int[] arr4;
      arr4 = new int[]{0, 0, 0, 0, 0};



    }
}

//배열 초기화 명령
//1) 배열 선언 + 값 초기화
//   데이터타입[] 변수명 = new 데이터타입[]{값,값,값,값,값}
//   -배열 메모리를 초기화 시킬 때는 배열 개수를 지정하지 않는다.
//   -배열을 초기화시키는 값으 개수 만큼 메모리가 만들어진다.
//ex) int[] arr = new int[]{30,30,30};
//   -다음과 같이 new 명령을 생략할 수 있다.
//   데이터타입[] 변수명 ={값,값,값};
