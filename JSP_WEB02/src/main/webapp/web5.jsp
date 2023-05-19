<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시자 (page)</title>
</head>
<body>

  <%
   int[] i = {10,20,30};
  out.println(Arrays.toString(i));
  %>
</body>
</html>