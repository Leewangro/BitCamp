package bitcamp.java106.pms;


import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;

        
public class App_v12_2{ 
    //클래스 변수 = 스태틱 변수
    static Scanner keyScan = new Scanner(System.in); //scanner을 쓰겠다는 명령문

    static String[] prompt(){
        System.out.print("명령> ");
        return keyScan.nextLine().toLowerCase().split(" ");

    }
    public static void main(String[] args) {
       
        
        Team[] teams = new Team[1000]; 
        int teamIndex = 0; 

        Member[] members = new Member[1000];
        int memberIndex = 0;
        
        while(true){

            String[] arr = prompt();

            String menu = arr[0];
            String option = null; // 문자열 없음!
            if (arr.length == 2) {
                option = arr[1];
            }

            if (menu.equals("quit")) {
                System.out.println("잘가라 닝겐");
                break;
            } else if (menu.equals("help")){
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                
                continue; //continue 함수 아래에 문장이 있으면 아래에 있는 문장을 반복하고 조건문의 맨위로 올라간다.
                //break; 브레이크를 걸면 quit를 입력하지 않아도 바로 콘솔이 종료된다.
            } else if(menu.equals("team/add")){

                System.out.println("[팀 정보 입력]");
                Team team = new Team();

                System.out.print("팀명? ");
                team.name = keyScan.nextLine();

                System.out.print("설명? ");
                team.description = keyScan.nextLine();

                System.out.print("최대인원? ");
                team.maxQty = keyScan.nextInt();
                keyScan.nextLine(); 

                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();
                
                teams[teamIndex++] = team;
                // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
            } else if(menu.equals("team/list")){
                System.out.println("[팀 목록]");
                for (int i = 0; i < teamIndex; i++) {
                    System.out.printf("%s, %d, %s ~ %s\n", 
                        teams[i].name, teams[i].maxQty, 
                        teams[i].startDate, teams[i].endDate);
                }
            } else if (menu.equals("team/view")) {
                System.out.println("[팀 정보 조회]");
                if (option == null) {
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }
            
                Team team = null;
                for(int i = 0; i < teamIndex; i++) {
                    if (option.equals(teams[i].name.toLowerCase())) {
                        team = teams[i];
                        break;
                    }
                
                }
                    if (team == null){
                        System.out.println("팀 이름이 없습니다.");
                    } else {
                        System.out.printf("팀명: %s\n", team.name);
                        System.out.printf("설명: %s\n", team.description);
                        System.out.printf("최대인원: %d\n", team.maxQty);
                        System.out.printf("기간: %s ~ %s\n", 
                            team.startDate, team.endDate);
                    }
                }  else if (menu.equals("member/add")) {
                    System.out.println("[회원 정보 입력]");
                    Member member = new Member();
    
                    System.out.print("아이디? ");
                    member.id = keyScan.nextLine();
    
                    System.out.print("이메일? ");
                    member.email = keyScan.nextLine();
    
                    System.out.print("암호? ");
                    member.password = keyScan.nextLine();
    
                    // 회원 정보가 담겨있는 객체의 주소를 배열에 보관한다.
                    members[memberIndex++] = member;
                } else if (menu.equals("member/list")) {
                    System.out.println("[회원 목록]");
                    for (int i = 0; i < memberIndex; i++) {
                        System.out.printf("%s, %s, %s\n", 
                            members[i].id, members[i].email, members[i].password);
                    }
                    
            } else if (menu.equals("member/view")) {
                System.out.println("[회원 정보 조회]");
                if (option == null) {
                    System.out.println("아이디를 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                }
                
                Member member = null;
                for (int i = 0; i < memberIndex; i++) {
                    if (option.equals(members[i].id.toLowerCase())) {
                        member = members[i];
                        break;
                    }
                }

                if (member == null) {
                    System.out.println("해당 아이디의 회원이 없습니다.");
                } else {
                    System.out.printf("아이디: %s\n", member.id);
                    System.out.printf("이메일: %s\n", member.email);
                    System.out.printf("암호: %s\n", member.password);
                }
            } else {
                System.out.println("명령어가 올바르지 않습니다.");
            }
        } 
    }
}

    

    
