// Data Persistence Framework 도입 - Mybatis
package step25.ex5;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam01_2 {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex5/mybatis-config.xml");
        
        SqlSessionFactory factory = 
                new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        
        // SqlSession 객체를 이용하여 SQL 맵퍼 파일에 작성한 SQL 문을 실행한다.
        // => SQL 문장 = 그룹명 + "." + SQL문장 아이디 
        List<Board> list = 
                sqlSession.selectList("BoardMapper.selectBoard");
        
        for (Board board : list) {
            System.out.printf("%d, %s, %s, %s\n", 
                    board.getNo(), 
                    board.getTitle(), 
                    board.getContent(),
                    board.getRegisteredDate());
        }
        
        sqlSession.close();
    }

}


