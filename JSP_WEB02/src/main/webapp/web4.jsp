<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정리</title>
</head>
<body>
   <%!
    int i = 10;
    String str = "화이팅";
   %>
   
   <%
    out.println("기본 프린트 : " + i);
    out.println("화이팅 : " + str);
   %>
   <br/>
    
   i = <%= i %><br/>
   str = <%= str %>
</body>
</html>