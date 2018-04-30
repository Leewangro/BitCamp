// 예외 처리- 예외에 대해 의미를 부여하기
package step21.ex5;

import java.sql.Date;
import java.util.Scanner;

public class Exma03 {
    // 실무에서는 개발자에게 예외의 의미를 직관적으로 알 수 있도록
    // RuntimeException 같은 평범한, 의미가 모호한 이름의 클래스를 사용하지 않고
    // 대신에 기존 예외를 상속 받아 의미있는 이름으로 서브 클래스를 정의한 다음에
    // 그 예외 클래스를 사용한다
    static Board read()throws RuntimeException {
        try(Scanner keyScan = new Scanner(System.in);){
            Board board = new Board();

            System.out.println("번호");
            board.setNo(Integer.parseInt(keyScan.nextLine()));

            System.out.println("제목");
            board.setTitle(keyScan.nextLine());

            System.out.println("내용");
            board.setContent(keyScan.nextLine());

            System.out.println("내용");
            board.setCreatedDate(Date.valueOf(keyScan.nextLine()));

            return board;
        } catch (Exception e) {
           throw new BoardException("게시물 입력 도중 오류 발생!");
        }
    }
    public static void main(String[] args) {

        try {
            Board board = read();
            System.out.printf("번호: %d\n",board.getNo());
            System.out.printf("제목: %s\n",board.getTitle());
            System.out.printf("내용: %s\n",board.getContent());
            System.out.printf("등록일: %s\n",board.getCreatedDate());
        } catch (RuntimeException e) {
            System.out.println("게시물 입력 오류 발생");
        }
        
    }
}

