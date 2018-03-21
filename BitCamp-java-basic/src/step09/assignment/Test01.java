package step09.assignment;

import java.util.*;


public class Test01 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        
        System.out.print("년,월,일?(예: 2018 3 21) ");    
        int year = keyScan.nextInt();
        int month = keyScan.nextInt();
        int day = keyScan.nextInt();
                
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month-1);
        c.set(Calendar.DATE,day);
        
        String[] weeks = {"","일","월","화","수","목","금","토"};
        
        int i = c.get(Calendar.DAY_OF_WEEK);
        System.out.printf("요일:%d\n",c.get(Calendar.DAY_OF_WEEK)); //요일(1~7) (일 월 화 수 목 금 토) 순서로 진행
        System.out.printf("주차:%d\n",c.get(Calendar.WEEK_OF_MONTH)); // 그 달의 몇 번째 주   
        System.out.printf("일차:%d\n",c.get(Calendar.DAY_OF_YEAR)); // 그 해의 몇 번째 일
    }

}
