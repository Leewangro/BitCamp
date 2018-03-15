//흐름 제어문 - switch 문법
package step05;

import java.util.Scanner;
public class Exam02_3 {
    public static void main(String[] args) {
        //switch (값){}
        // -> 값으로 가능한 데이터 타입은?
        // -> int 정수(byte, short, int, character), 문자열, Enum 타입
        // = > case 값으로 변수를 사용할 수 없다. 상수 리터럴만 가능하다.
        byte b = 2;
        short s = 2;
        int i = 2;
        long l = 2;
         // A문자의 유니코드 값(UTF-16) 0x46(65)을 c에 저장한다


        switch (b){
        case 1:
        case 2:
        default:
        }
        switch (s){
        case 1:
        case 2:
        default:
        }
        switch (i){
        case 1:
        case 2:
        default:
        }
      /*  switch (l){
        case 1:
        case 2:
        default:
            }*/           //long은 안됨 컴파일오류
        char c= 'A';
        switch (c){
            //case의 값도 int 값이면 무엇이든 된다.
        case 0x43:
        case 'A':
        case 66:
        
        default:
        }
        //String 값을 switch와  case의 값으로 사용할 수 있다.
        String str = "hello";
        switch (str){
        case "hello":
        case "ogora":
        case "hul":
        default:
            }
     /*   boolean bool = true;   //boolean 값을 switch와 case에 사용할 수 없다.
        switch(bool){
            case true:
            case false:
        }
       */      
      //case에는 리터럴만 올 수 있다.
      //즉 변수를 사용할 수 없다.
      int x = 1, y = 300;
        switch (x){
        case 1 * 300:
        case 1 * y://컴파일오류
      }   
    }
  
}
