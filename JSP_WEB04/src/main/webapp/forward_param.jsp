<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>param test</title>
</head>
<body>
  <%!
   String id, pw;
  %>
  
  <% 
   request.setCharacterEncoding("UTF-8");
  
   id = request.getParameter("id");
   pw = request.getParameter("pw");
  %>
  
  <h1>forward_param.jsp �Դϴ�.</h1>
  ���̵� : <%= id %>
  ��й�ȣ : <%= pw %>
</body>
</html>