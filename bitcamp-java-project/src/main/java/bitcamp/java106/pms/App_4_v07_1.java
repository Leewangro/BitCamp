package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

//ver 0.1 - 명령 입력 프롬프트를 출력한다
//ver 0.2 - 사용자로부터 입력을 받아 출력한다.
//ver 0.3 - 사용자로부터 입력 받는 것을 무한 반복한다.
//ver 0.4 - quit 명령어 입력 시 반복문을 종료한다.
//ver 0.5 - help 명령을 구현한다.
//ver 0.6 - team/add 명령을 구현한다.
//ver 0.7 - team/list 명령을 구현한다
//ver 0.8 - team/view 명령을 구현한다
//ver 0.9 - mem/add 명령을 구현한다.
    //회원 정보를 담을 새로운 데이터 타입을 정의한다. = > Member.java
    //여러 회원 정보를 저장할 레퍼런스 배열을 준비한다.
    
public class App_4{
    public static void main(String[] args) {
    
        Scanner keyScan = new Scanner(System.in);

        Team[] teams = new Team[1000]; //팀 배열에 주소를 담으려면?
        int teamIndex = 0;                
        
        Member[] members = new Member[1000];
        int memberIndex = 0;

            while(true){
                System.out.println("명령?");
                String[] arr = keyScan.nextLine().toLowerCase().split(" ");           
                String menu = arr[0] ;    
                String option = null;//주소 없음!(문자열 없음)
                if(arr.length ==2) {
                    option = arr[1];

                }

            
            if(menu.equals("quit")){
                System.out.println("안녕히가세요");
                break;
            } else if (menu.equals("help")) {
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                
                
            } else if (menu.equals("team/add")) {

                System.out.println("[팀 정보 입력]");
                Team team = new Team();

                System.out.println("팀명? ");
                team.teamName = keyScan.nextLine();

                System.out.println("설명? ");
                team.description = keyScan.nextLine();

                System.out.println("최대인원? ");
                team.maxQty = keyScan.nextLine();

                System.out.println("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.println("종료일? ");
                team.endDate = keyScan.nextLine();

                //팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
                teams[teamIndex++] = team; //마지막에 놓는 이유는?
                //teamIndex++;

                
                              
            } else if (menu.equals("team/list")) {
                System.out.println("[팀 목록]");
                for (int i = 0; i < teamIndex; i++) {
                  
                    System.out.printf("%s %s %s ~ %s\n",
                        teams[i].teamName, teams[i].maxQty, 
                        teams[i].startDate, teams[i].endDate);
                }
                
            } else if (menu.equals("team/view")) {
                System.out.println("[팀 정보 조회]");
                if (option == null) {
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                Team team = null;//이해 잘 안됨
                for (int i = 0 ; i < teamIndex; i++) {
                    if (option.equals((teams[i].teamName))){
                        team = teams[i];
                        break;
                    }
                
                }
                if (team == null){
                    System.out.println("해당 이름의 팀이 없습니다");
                }else {
                    System.out.printf("팀명 : %s\n",team.teamName);
                    System.out.printf("설명 : %s\n",team.description);
                    System.out.printf("최대인원 : %s\n",team.maxQty);
                    System.out.printf("기간 : %s ~ %s\n", team.startDate, team.endDate);


                }

                
            } else if (menu.equals("member/add")) {
                System.out.println("[팀 정보 입력]");
                Member member = new Member();

                System.out.println("아이디? ");
                member.id = keyScan.nextLine();

                System.out.println("이메일? ");
                member.email = keyScan.nextLine();

                System.out.println("암호? ");
                member.password = keyScan.nextLine();

            
                members[memberIndex++] = member; //마지막에 놓는 이유는?
            }
        }          
        System.out.println();
    }
}