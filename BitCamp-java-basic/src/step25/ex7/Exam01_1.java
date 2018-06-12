// 트랜잭션 - auto commit
package step25.ex7;

import java.sql.DriverManager;

public class Exam01_1 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/java106db",
                "java106", "1111");

        // DriverManager가 리턴한 커넥션은 Auto Commit의 기본 상태가 true로 설정되어 있다.
        // Auto Commit?
        // => insert, update, delete를 실행한 후 그 결과를 즉시 테이블에 적용하는 것.
        
        
        
        java.sql.PreparedStatement stmt = con.prepareStatement(
                "insert into ex_board(bno,titl,cont,rdt) values(?,?,?,now())");

        stmt.setInt(1, 101);
        stmt.setString(2,"1111");
        stmt.setString(3,"xxxx");
        stmt.executeUpdate();
        System.out.println("입력성공");
        
        stmt.setInt(1, 102);
        stmt.setString(2,"1111");
        stmt.setString(3,"xxxx");
        stmt.executeUpdate();
        System.out.println("입력성공");
        
        // 만약 게시물 번호가 중복된다면 입력 실패할 것이다.
        // 다음 실행에서 입력을 실패한다 하더라도
        // 이전에 입력한 사항은 유효하다
        stmt.setInt(1, 101);
        stmt.setString(2,"1111");
        stmt.setString(3,"xxxx");
        stmt.executeUpdate();
        
        
        stmt.close();
        con.close();
        System.out.printf("입력완료");
        
    }
}
