<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Request 요청 방법을 적음</title>
</head>
<body>
 
 <%
  out.println("서버 :" + request.getServerName());
  out.println("포트 번호 : " + request.getServerPort());
  out.println("요청 방식 : " + request.getMethod());
  out.println("프로토콜 : " + request.getProtocol());
  out.println("URL : " + request.getRequestURL());
  out.println("URI : " + request.getRequestURI());
 %>
</body>
</html>