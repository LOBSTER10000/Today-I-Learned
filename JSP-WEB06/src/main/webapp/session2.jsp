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
   
   아이디 : <%= id%>
   비밀번호 : <%= pw %>
   
   <a href="session3.jsp">세션 삭제</a>
</body>
</html>