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
    String id = (String) ob1;
    Object ob2 = (Object) session.getAttribute("pw");
    Integer pw = (Integer) ob2;
    
    out.println(session.getMaxInactiveInterval() + "<br/>");
    out.println(session.getId() + "<br />");
   %>
   
   ���̵� : <%= id%>
   ��й�ȣ : <%= pw %>
   
   <a href="session3.jsp">���� ����</a>
</body>
</html>