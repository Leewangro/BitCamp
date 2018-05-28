<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03_2</title>
</head>
<body>
<h1>JSP 전용 태그: useBean</h1>
<pre>
jsp:useBean
- 태그를 이용하여 저장소에서 객체를 꺼낼 때 사용한다.
- 만약 객체가 없다면 해당 객체를 생성할 수도 있다.

[문법]
jsp:setProperty name="객체명" property="프로퍼티명" value="값"
</pre>
 
 <h2>Member 객체를 만들어 PageContext에 보관하기+프로퍼티 값 설정하기</h2>
 <jsp:useBean id="member" class="jsp.Member"></jsp:useBean>
 <jsp:setProperty property="id" name="member" value="홍길동"/>
 <jsp:setProperty property="email" name="member" value="hong@test.com"/>
 <jsp:setProperty property="password" name="member" value="1111"/>
 <%-- 자바 코드:
 jsp.Member member = (jsp.Member)pageContext.getAttribute("member");
 if(member == null){
 member = new jsp.Member();
 pageContext.setAttribute("member",member);
 }
  --%>
아이디: <%= member.getId() %><br>
이메일: <%= member.getEmail() %><br>
암호: <%= member.getPassword() %><br>
 
 
 
 
</body>
</html>