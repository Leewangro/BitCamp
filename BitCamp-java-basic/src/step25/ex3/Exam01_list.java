// 데이터를 처리하는 코드를 별도의 클래스로 캡슐화시킨다.
// => Data 영속성을 관리하는 클래스를 DAO(Data Access Object)라 부른다,
// => Data 영속성
//      - 데이터를 저장하고 유지하는 것.
//      - "퍼시스턴스(persistence)"라 부른다.
package step25.ex3;

import java.util.List;

public class Exam01_list {

    public static void main(String[] args) throws Exception {
        BoardDao boardDao = new BoardDao();

        List<Board> list = boardDao.list();
        try {
            for (Board board : list) {
                System.out.printf("%d,%s,%s\n", 
                        board.getNo(),
                        board.getTitle(),
                        board.getRegisterDate()); 
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
