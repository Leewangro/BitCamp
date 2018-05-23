// 쿠키 : 유효 기간이 설정된 쿠키 값 꺼내기
package step10.ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex2/exam02")
public class Exam02 extends HttpServlet{
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        Cookie[] cookies = request.getCookies();

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("클라이언트가 보낸 쿠키들:");

        for(Cookie cookie : cookies) {
            out.printf("%s=%s\n",cookie.getName(),cookie.getValue());
            // 쿠키에 유효기간이 있든 없든 웹 브라우저가 웹 서버에서 보내는 데이터 형식은 같다.
          
        }
    }
}
