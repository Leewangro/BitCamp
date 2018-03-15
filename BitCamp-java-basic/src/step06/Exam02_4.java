// 메서드 : 기본문법 IV
package step06;

import java.util.Scanner;

public class Exam02_4{
       
       // 4) 메서드 : 리턴값(o), 파라미터(o)
      //    => "이 돈 갖구 과자좀 사와!"
       static String hello(String name, int age) {
           String retVal = String.format("%d살 %s님을 환영합니다.", age, name); //순서2
           return retVal;//순서3
       }

        public static void main(String[] args) {
        
            // hello() 메서드를 실행하고, 그 리턴 값을 변수에 담는다.
            String r = hello("홍길동", 20); //순서1
            System.out.println(r);//순서4

            //리턴 값을 안 받아도 된다.
            hello("임꺽정", 30); // 리턴값은 받아진다
  
    }
}


