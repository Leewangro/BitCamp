// 메서드 : 기본문법
package step06;

import java.util.Scanner;

public class Exam02_2{
       
       // 2) 함수1 : 리턴값(x), 파라미터(o)
       // => 메서드 블록을 실행할 때 값이 필요하다면 파라미터 변수를 선언하라!
       // => "여기 돈 줄테니 밥먹고와"
        static void hello(String name , int age) {
           //파라미터?
           // - 메서드를 실행할 때 사용할 값을 외부로부터 값을 받기 위해 선언한 로컬 변수.
           // - 메서드를 실행할 때 생성되고 메서드 실행이 끝나면 제거된다.
           System.out.printf("%d살 %s님 반갑습니다\n", age, name);
           
       }

        public static void main(String[] args) {
        
            System.out.println("main()11111");
            // hello 메서드 호출하기
            hello("홍길동", 20);
            // hello 메서드 실행이 완료되면 다시 이리로 되돌아 와서
            // 다음 명령을 실행한다

            System.out.println("main()22222");

            // 메서드는 언제든 필요할 때 마다 반복하여 실행할 수 있다.
            hello("임꺽정", 30);

            System.out.println("main()33333");

            // 또 메서드 호출
            hello("유관순", 16);

            System.out.println("main()44444");

            // 파라미터의 타입, 개수, 순서가 일치해야 한다.
            // hello("윤봉길"); 컴파일오류 - string값만 줬음 , int값도 줘야함
            // hello( 16, "유관순"); 순서값이 다름

            // String r = hello("안중", 30);
            
    }
}


// 아규먼트(argument)
//  => 메서드를 호출할 때 넘겨주는 값
//  => 예) hello("홍길동",20);
//  =>  "홍길동" ,20 이 아규먼트이다
// 파라미터(parameter)
//  => 아규먼트를 받는 변수
//  => 예) void hello(String name, int age){...}
//          name과 age변수가 파라미터이다.

//현장에서는 "아규먼트"와 "파라미터"를 구분하지 않고 사용한다.