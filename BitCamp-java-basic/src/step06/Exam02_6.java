// 메서드 : 가변 파라미터 vs 배열 파라미터
package step06;

import java.util.Scanner;

public class Exam02_6 {
       
      
    static void hello(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반값습니다.\n", names[i]);
           }
       }
    static void hello2(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반값습니다.\n", names[i]);
           }
       }

        public static void main(String[] args) {
            // 가변 파라미터의 메서드를 호출할 때는
            // => 가변 파라미터와 달리 낱개의 값을 여러 개 줄 수도 있고
            hello("홍길동", "임꺽정", "유관순");
            // 또는 배열에 담아서 전달할 수도 있다.
            String[] arr = {"김구", "안중근", "유관순", "윤봉길"};
            hello(arr);

            System.out.println("-----------------");

            //배열 파라미터의 메서드를 호출할 때는
            // => 가변 파라미터와 달리 낱개의 값을 여러 개 줄 수도 있고
            hello2("홍길동", "임꺽정", "유관순");
            //오직 배열에 담아서 전달해야한다.
            String[] arr2 = {"김구", "안중근", "유관순", "윤봉길"};
            hello2(arr2);
            

        
    }
}


