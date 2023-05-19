<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login 쿠키 시전 중</title>
</head>
<body>
  
  
 <%
  Cookie[] cookies = request.getCookies();
 
 for(int i =0; i< cookies.length; i++){
	 String id = cookies[i].getValue();
	 if (id.equals("abcd"))
		    out.println(id + "님 안녕하세요" + "<br />");
 }
 %>
 
 <a href="logout.jsp">로그아웃</a>
  
 
</body>
</html>