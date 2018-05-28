<%@page import="java.util.ArrayList"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03_5</title>
</head>
<body>
<h1>JSP 전용 태그: useBean + type + class</h1>
<pre>
type 과 클래스를 모두 지정 했을 때의 동작원리


</pre>
 

 
 <%
 
 Member obj = new Member();
 obj.setId("홍길동");
 obj.setEmail("@");
 obj.setPassword("1111");
 
 Member obj2 = new Member();
 obj2.setId("홍길동2");
 obj2.setEmail("@2");
 obj2.setPassword("1111222"); 
 ArrayList<Member> arr = new ArrayList<>();
 arr.add(obj);
 arr.add(obj2);
 
 pageContext.setAttribute("list",arr);
 %>
 
 
 
 <h2>type과 class 속성을 동시에 설정하기</h2>
 <jsp:useBean id="list" 
 type="java.util.List<Member>"
 class="java.util.ArrayList"
 scope="request"></jsp:useBean>
<%
for (Member member : list){
%>


 <%= member.getId() %>,<%= member.getEmail() %>,<%= member.getPassword() %><br>
 <%} %>
 
</body>
</html>