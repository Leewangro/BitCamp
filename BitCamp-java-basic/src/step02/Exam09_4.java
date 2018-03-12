// 배열 - 배열 레퍼런스와 배열 인스턴스(배열의 비밀)
//가비지와 가비지 컬렉터.
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam09_4{
    public static void main(String[] args) {
      int[] arr1;
      arr1 = new int[]{100,200,300};

      System.out.println(arr1[0]);
      System.out.println(arr1[1]);
      System.out.println(arr1[2]);

      //arr1 변수에는 새로운 변수가 저장된다
      //그러면 이전 배열의 주소는 잃어버린다.
      //주소를 잃어버린 배열은 사용할 수 없다. ->garbage라 부른다
      //garbge는 개발자가 임의로 제거 불가 (c는가능 java는 불가능)

      arr1 = new int[]{10,20,30,40,50};//새로운 배열을 선언했기 때문에 처음에 선언한 arr1은 주소를 잃어버렷기 때문에 더 이상 사용못하고 새로운 선언만 이용이 가능하다.
      System.out.println(arr1[0]);     //처음 arr1은 사용 불가 새로 선언한 arr1만 사용가능
      System.out.println(arr1[1]);
      System.out.println(arr1[2]);
      System.out.println(arr1[3]);
      System.out.println(arr1[4]);

      
    }
}

//가비지
//주소를 잃어버려 사용할 수 없는 메모리(인스턴스);
//개발자가 임의로 해제 불가
//jvm을 해제하면 어차피 운영체제에게 사용한 메모리를 반납해야 하기 때문에 자동으로 해제된다.
//그러나 jvm이 실행하는 중에 개발자가 임의로 해제할 수 없다.
//오직 garbage collector만이 메모리를 garbge를 해제할 수 있다.

//garbge collector
//-인스턴스의 주소를 알고 있는 변수가 없을 경우
//그 인스턴스는 가비지로 간주된다.
//그러면 garbage 메모리를 재사용 할 수 있도록 해제시키는 방법
//=>개발자가 임의로 해제 불가능하다
// 다음의 경우에 garbage collector들이 실행되어 garbge가 해제된다

//garbage collector가 실행되는 경우
//1) 메모리가 부족할경우
//-os에게 메모리를 요청하기 전에 먼저 가비지를 청소한 다음 요청할 지 말지 결정한다.
//2) cpu가 한가할 때
//   -24시간 365일 내내 멈춤없이 jbm이 실행될 경우 cpu가 한가한 시간에 garbage를 청소할 수 있다.
// 단) 정확한 시간을 지정하거나 예측할 수는 없다.
//3) 개발자가 garbage collector를 실행해달라고 요청할 경우
//   -명령을 내린다고 즉시 실행되는 것은 아니다
//   -일종의 빠른 시일내에 가비지를 실행하라고 JVM에 예약하는 것이다.

//결론
//가비지는 가비지 컬렉터가 자기 나름의 조건에 따라 실행할 테니까 개발자는 신경쓰지 말라
//만약 메모리를 개발자가 마음대로 조작하고 싶으면 c,c++로 프로그래밍하라.