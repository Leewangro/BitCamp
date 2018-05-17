// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.servlet.teammember;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.dao.TeamMemberDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.servlet.InitServlet;

@SuppressWarnings("serial")
@WebServlet("/team/member/add")
public class TeamMemberAddServlet extends HttpServlet {
    
    TeamDao teamDao;
    MemberDao memberDao;
    TeamMemberDao teamMemberDao;
    
    @Override
    public void init() throws ServletException {
        this.teamDao = InitServlet.getApplicationContext().getBean(TeamDao.class);
        this.memberDao = InitServlet.getApplicationContext().getBean(MemberDao.class);
        this.teamMemberDao = InitServlet.getApplicationContext().getBean(TeamMemberDao.class);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        String teamName = request.getParameter("teamName");
        String memberId = request.getParameter("memberId");
        
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.printf("<meta http-equiv='Refresh' content='1;url=../view?name=%s'>", teamName);
        
        out.println("<title>팀 등록</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>팀 회원 등록 결과</h1>");
                    
        try {
            Team team = teamDao.selectOne(teamName);
            if (team == null)
                throw new Exception("<p>" + teamName + " 팀은 존재하지 않습니다.</p>");
            
            Member member = memberDao.selectOne(memberId);
            if (member == null)
                throw new Exception("<p>" + memberId + " 회원은 없습니다.<p>");
            
            if (teamMemberDao.isExist(teamName, memberId))
                throw new Exception("<p>이미 등록된 회원입니다.<p>");
            
        } catch(Exception e) {
            out.println("<p>검색실패<p>");
            e.printStackTrace(out);
        }
            
        try {
            teamMemberDao.insert(teamName, memberId);
            out.println("<p>팀에 회원을 추가하였습니다.</p>");
        } catch(Exception e) {
            out.printf("<p>%s<p>", e.getMessage());
            e.printStackTrace(out);
        }
        out.println("</body>");
        out.println("</html>");
    }
}