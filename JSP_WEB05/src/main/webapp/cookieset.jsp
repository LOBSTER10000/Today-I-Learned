<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��Ű ����</title>
</head>
<body>


  	<%
  	Cookie cookie = new Cookie("cookieN", "cookieV");
  	cookie.setMaxAge(60*60);
  	response.addCookie(cookie);
  	%>
  	<!-- �տ� ���°� ��Ű�� name��, �ڿ� �ִ°� ��Ű�� value�� -->
  	<a href="cookieget.jsp">cookie get</a>
</body>
</html>