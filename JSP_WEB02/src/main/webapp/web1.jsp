<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>기본 스크립트릿</title>
</head>
<body>

		<h1>안녕하세요!</h1>
		
		<% 
		 for(int i = 0; i < 10; i++){
			 %>
			 ======<br>
			 <%
			 out.println(i + " + 2  =" + (i+2));
		 }
		%>
		
		
		
</body>
</html>