package bitcamp.java106.pms;
import java.util.Scanner;
import bitcamp.java106.pms.domain.Team;

public class App_3 {
    public static void main(String[] args) {
        java.io.InputStream keyboard = System.in;
        Scanner keyScan = new Scanner(keyboard);

        //팀 정보를 받을 메모리 준비
        Team[] teams = new Team[100];
        int count = 0;

        for(int i = 0; i < 3; i++) {
            count ++;
            teams[i] = new Team();
            
            System.out.print("팀명? ");
            teams[i].teamName = keyScan.nextLine();

            System.out.print("설명? ");
            teams[i].description = keyScan.nextLine();

            System.out.print("최대인원? ");
            teams[i].maxQty = keyScan.nextInt();
            keyScan.nextLine(); // 숫자 뒤에 줄바꿈 코드를 읽는다.
                                // 읽고 난 뒤에 아무것도 안하기 때문에 
                                // 일종의 줄바꿈 코드를 제거하는 효과가 있다.

            System.out.print("시작일? ");
            teams[i].startDate = keyScan.nextLine();

            System.out.print("종료일? ");
            teams[i].endDate = keyScan.nextLine();
            
            System.out.println("멈추시겠습니까(Y/N)");
            String str = keyScan.nextLine();
            if(str.equals("Y") || str.equals("y")) {
                break;
            }
        }

        System.out.println("-----------------------------");
        for ( int i = 0 ; i < count; i++) {
            System.out.printf("%s %d %s ~ %s /n",teams[i].teamName,teams[i].description,teams[i].startDate,teams[i].endDate);
        }
    }
}