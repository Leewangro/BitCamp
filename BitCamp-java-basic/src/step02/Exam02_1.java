//키보드 입력받기 - 기본
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam02_1{
    public static void main(String[] args) {
        //키보드에 접속하기 위해 키보드 정보를 가져온다
        java.io.InputStream keyboard = System.in;

        //키보드에서 값을 꺼내주는 콘솔을 연결한다
        java.util.Scanner keyScan = new Scanner(keyboard);
        //pirnt()는 문자열을 출력한 후 줄 바꿈을 하지 않는다
        System.out.println("팀명?");

        //nextLine()
        // -Scanner 도구를 사용하여 키보드로부터 한 줄의 문자열을 
        //  가져올 때 사용하는 명령이다.
        //동작은?
        //사용자가 한 줄 입력 할 때 까지,
        //즉 입력 데이터에 줄바꿈을 의미하는 0d0a 2바이트가 들오올 때까지
        //대기한다.
        //사용자가 엔터키를 누르면,
        //입력밧으로 0d0a 2바이트 값이 들어오고,
        //nextLine() 비로서 사용자가 입력한 값을 리턴한다.
        // - 그 리턴값을 println()명령을 사용하여 콘솔을 출력한다.

        System.out.print("핑핑"); //print()는 문자열을 입력한 후 줄바꿈을 하지 않음
        System.out.println(keyScan.nextLine());//출력한후 줄바꿈함

    }
}