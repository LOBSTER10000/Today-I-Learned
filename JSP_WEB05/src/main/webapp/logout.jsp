<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α׾ƿ�</title>
</head>
<body>

 <%
   Cookie[] cookies = request.getCookies();
  for(int i = 0; i< cookies.length; i++){
	  String str = cookies[i].getValue();
	  if(str.equals("abcd")){
		  out.println("value : " + cookies[i].getValue() + "<br />");
		  cookies[i].setMaxAge(0);
		  response.addCookie(cookies[i]);
	  }
  }
  %>
  
  <h1> ��Ű�� ���� �Ǿ����ϴ�.</h1>
  <% response.sendRedirect("login.html"); %>
</body>
</html>