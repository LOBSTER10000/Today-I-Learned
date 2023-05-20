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
    session.setAttribute("id", "abcd");
    session.setAttribute("pw", 1234);
  %>
  
  <a href="session2.jsp">세션 확인</a>
</body>
</html>