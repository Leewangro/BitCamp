//레퍼런스와 인스턴스 선언 - 인스턴스 생성(사용할 메모리 확보)
package step03;

import javax.swing.Scrollable;

public class Exam03_2{
    public static void main(String[] args) {

        class Score{ 
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;

        }
       //Score 레퍼런스 선언
      Score s1 = new Score();
      //s2에 저장된 주소를 s2에도 저장한다.
      Score s2=s1;
      s1.name = "홍길동";
      System.out.println(s2.name);
    }
}