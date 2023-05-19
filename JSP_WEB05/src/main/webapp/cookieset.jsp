<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>쿠키 설정</title>
</head>
<body>


  	<%
  	Cookie cookie = new Cookie("cookieN", "cookieV");
  	cookie.setMaxAge(60*60);
  	response.addCookie(cookie);
  	%>
  	<!-- 앞에 오는게 쿠키의 name값, 뒤에 있는게 쿠키의 value값 -->
  	<a href="cookieget.jsp">cookie get</a>
</body>
</html>