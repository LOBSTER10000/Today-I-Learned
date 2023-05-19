<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>선언문</title>
</head>
<body>


   <%!
    int i = 10;
    String str = "ABCDE";
    %>

    <%!
    public int sum(int a, int b){
       return a + b;
    }
    %>

    <%
    out.println("i의 값은 " + i + "<br/>");
    out.println("string " + str + "<br/>");
    out.println("sum is: " + sum(1, 5));
    %>
</body>
</html>