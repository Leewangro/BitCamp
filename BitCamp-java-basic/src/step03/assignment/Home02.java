package step03.assignment;

public class Home02 {
    public static void main(String[] args) {
        java.util.Scanner keyscan = new java.util.Scanner(System.in);

        step03.assignment.Bitcamp[] arr = new step03.assignment.Bitcamp[3];
        String comp;
        int count=0;
        for(int i = 0 ; i < 3; i++) {

            arr[i] = new step03.assignment.Bitcamp();

            count++;
            System.out.println("팀명?");
            arr[i].tname = keyscan.nextLine();
            System.out.println("설명?");
            arr[i].exp = keyscan.nextLine();
            System.out.println("맥스인원?");
            arr[i].maxp = keyscan.nextLine();
            System.out.println("스타또데이?");
            arr[i].startd = keyscan.nextLine();
            System.out.println("엔도데이?");
            arr[i].endd = keyscan.nextLine();

            System.out.println("그만 두시겠습니까?(Y/N)");
            comp =keyscan.nextLine(); 
            if(comp.equals("N") || comp.equals("n")) {
                continue;
            }else if(comp.equals("Y") || comp.equals("y")) {
                break;
            }
        }
            for(int i = 0 ;i < count; i++ ){
                System.out.printf("%s %s %s ~ %s\n",arr[i].tname, arr[i].maxp, arr[i].startd, arr[i].endd);
            }
        }

    
}