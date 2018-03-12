package bitcamp.java106.pms;


import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

// ver 0.1 - 명령 입력 프롬프트를 출력한다. 
// ver 0.2 - 사용자로부터 입력을 받아 출력한다.
// ver 0.3 - 사용자로부터 입력 받는 것을 무한 반복한다.
// ver 0.4 - quit 명령어 입력 시 반복문을 종료한다.
// ver 0.5 - help 명령을 구현한다.

public class App_v05 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in); //scanner을 쓰겠다는 명령문
        while(true){

            System.out.print("명령> ");
            String input = keyScan.nextLine();

            if (input.equals("quit")) {
                System.out.println("잘가라 닝겐");
                break;
            }else if (input.equals("help")){
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                
                continue; //continue 함수 아래에 문장이 있으면 아래에 있는 문장을 반복하고 조건문의 맨위로 올라간다.
                //break; 브레이크를 걸면 quit를 입력하지 않아도 바로 콘솔이 종료된다.
            }
        }
    }
}