package step02.assignment;

public class Test03{
    public static void main(String[] args) {

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("팀명:");
        String teamName = keyScan.nextLine();

        System.out.print("설명:");
        String value = keyScan.nextLine();

        System.out.print("최대인원:");
        int maxQty = keyScan.nextInt();

        keyScan.nextLine();//숫자뒤에 줄바꿈 코드를 읽어서 제거한다.
                           //읽고 난 뒤에 아무것도 안하기 때문에
                           //일종의 줄바꿈 코드를 제거하는 효과가 있다.

        System.out.print("시작일:");
        String startDay = keyScan.nextLine();

        System.out.print("마감일:");
        String endDay = keyScan.nextLine();

        System.out.println("----------------------------------");
        
        System.out.println("팀명:"+teamName);
        System.out.println("설명:"+value);
        System.out.println("최대인원:"+maxQty);
        System.out.println("일자 : " + startDay +" ~ " + endDay);
        



    }
}