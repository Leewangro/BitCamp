package bitcamp.java106.pms;


import bitcamp.java106.pms.util.Console;
import bitcamp.java106.pms.board.BoardController;
import bitcamp.java106.pms.board.Board;

import java.util.Scanner;

// ver 0.2 - member 메뉴를 처리하는 코드를 관련 클래스인
public class BoardApp {
   static Scanner keyScan = new Scanner(System.in);

   public static String option = null; // 문자열 없음!

   static void onQuit() {
       System.out.println("안녕히 가세요!");
   }

   

   public static void main(String[] args) {
       BoardController.keyScan = keyScan;
       Console.keyScan = keyScan;
         

       while (true) {
           String[] arr = Console.prompt();
           String menu = arr[0];

           if (arr.length == 2)
               option = arr[1];
               if (menu.equals("quit")) {
                   onQuit();
                   break;
               } else if(menu.startsWith("board/"))
                BoardController.service(menu,option);
                              
              
               else
                   System.out.println("명령어가 올바르지 않습니다.");
           

           System.out.println();
       }
   }
}


