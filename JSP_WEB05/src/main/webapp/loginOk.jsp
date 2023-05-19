<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>쿠키 로그인 하는 중</title>
</head>
<body>
  
   <%
    String id =request.getParameter("id");
    String pw = request.getParameter("password");
    
    if(id.equals("abcd") && pw.equals("1234")){
    	Cookie cookie = new Cookie("id", id);
    	cookie.setMaxAge(60);
    	response.addCookie(cookie);
    	response.sendRedirect("welcome.jsp");
    } else {
    	response.sendRedirect("login.html");
    }
   %>
</body>
</html>