//메서드 : 리팩토링
package step06;

import java.util.Scanner;

public class Exam01_3{
   
    public static void printSpaces(int len){
        for (int i = 0; i < len; i++) {
            System.out.print(" ");
        }

    }
    public static void printStars(int len){
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }
    }
    //코드를 유지보수하기 쉽도록 가능한 기능 별로 묶어둔다.
    //그래서 Exam01_2 에 있던 코드 중에서 공백을 계산하는 코드를 
    //별도의 블록으로 분리하여 이름을 부여한다.
    public static int  getSpaceLength(int totalStar, int displayStar){
        return (totalStar - displayStar) / 2;
    }
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println("밑변의 길이? ");
        int len = keyScan.nextInt();

        for (int starLen = 1; starLen <= len; starLen += 2) {
            //출력할 스페이스의 개수를 계산하는 코드를
            //블록에 묶어 놓고 이름을 부여해두고 사용하면
            //코드를 읽기가 쉬워진다.
            printSpaces(getSpaceLength(len, starLen));
            printStars(starLen);
            System.out.println();
    
        }
    }
}

//공백구하는법 전체 별갯구에서 디스플레이 갯수를 뺀다
//주어진 길이만큼 공백출력-프린트스페이스