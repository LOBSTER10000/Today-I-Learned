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
   
   ���̵� �� : <%= id %> <br/>
   ��й�ȣ �� : <%= pw %> <br/>
   
  
   <a href="logout.jsp">�α׾ƿ�</a>
</body>
</html>