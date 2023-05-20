<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  
  
  <%
   Object ob1 = (Object) session.getAttribute("id");
   Object ob2 = (Object) session.getAttribute("pw");
   
   String id = (String) ob1;
   String pw = (String) ob2;
   %>
   
   아이디 값 : <%= id %> <br/>
   비밀번호 값 : <%= pw %> <br/>
   
  
   <a href="logout.jsp">로그아웃</a>
</body>
</html>