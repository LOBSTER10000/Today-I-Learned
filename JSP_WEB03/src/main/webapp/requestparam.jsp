<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Request Param</title>
</head>
<body>
 <%!
  String[] hobby;
 %>
 
 <%
 request.setCharacterEncoding("EUC-KR");
 
 hobby = request.getParameterValues("hobby");
 %>
 
 
 취미 : <%=Arrays.toString(hobby)%>
</body>
</html>