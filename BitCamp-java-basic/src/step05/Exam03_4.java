//흐름 제어문 - do ~ while 반복문
package step05;

import java.util.Scanner;
//상수를 좀 더 조직적으로 관리하는 방법.
//enum을 사용하여 상수를 정의한다.
   
public class Exam03_4 {
    
    public static void main(String[] args) {
       int i = 0;

       // 1부터 10까지 출력하기
        do
        System.out.println(++i);
        while (i < 10);
        System.out.println("--------------------------------");
        // 여러 개의 문장을 반복할 대는 블록으로 묶어라!
        
        i = 0;
        do {
            i+= 1;
            System.out.println(i);
        } while (i < 10);
        
    }
}
  


