<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�⺻ ��ũ��Ʈ��</title>
</head>
<body>

		<h1>�ȳ��ϼ���!</h1>
		
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