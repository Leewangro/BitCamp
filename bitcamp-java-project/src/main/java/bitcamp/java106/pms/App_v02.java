package bitcamp.java106.pms;


import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

// ver 0.1 - 명령 입력 프롬프트를 출력한다. 
// ver 0.2 - 사용자로부터 입력을 받아 출력한다.
public class App_v02 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in); //scanner을 쓰겠다는 명령문

        System.out.print("명령> ");
        String input = keyScan.nextLine();
    }
}