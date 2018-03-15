// 메서드 : 사용 전
package step06;

import java.util.Scanner;

public class Exam01_1{
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("밑변의 길이? ");
       
        int len = keyScan.nextInt();

        int starLen = 1;  // starLen이 1인 이유 - > 입력받는 len보다 작아야 while 문 안에 들어갈 수 있기때문

        while (starLen/* 별의 길이 */ <= len/*사용자가 입력한 밑변의 길이*/) {
            int spaceCnt/*공백의 시작점*/ = 0;
            int spaceLen/*공백의 길이*/ = (len - starLen)/2 ;

            // for(int spaceCnt = 1; spaceCnt < spaceLen; spaceCnt++)
            // {
            //     System.out.print(" ");
            // }

            while (spaceCnt/*공백의 시작점*/ < spaceLen/*공백의 길이*/) {
                System.out.print(" ");
                spaceCnt++/*공백의 시작점*/;
            }

            int starCnt = 1;           
            while (starCnt/*공백의 시작점*/ <= starLen/*공백의 시작점*/){
                System.out.print("*");
                starCnt++/*공백의 시작점*/;
            }
            System.out.println();
            starLen/*공백의 시작점*/ += 2;
            
        }
       
    }
}