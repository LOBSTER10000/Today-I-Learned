<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Request ��û ����� ����</title>
</head>
<body>
 
 <%
  out.println("���� :" + request.getServerName());
  out.println("��Ʈ ��ȣ : " + request.getServerPort());
  out.println("��û ��� : " + request.getMethod());
  out.println("�������� : " + request.getProtocol());
  out.println("URL : " + request.getRequestURL());
  out.println("URI : " + request.getRequestURI());
 %>
</body>
</html>