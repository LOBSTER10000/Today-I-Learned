<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>include param test</title>
</head>
<body>
  <%!
  int a;
  String b;
  %>

  <%
  request.setCharacterEncoding("UTF-8");
  a = 12345;
  b = "Ȳ��";
  %>
  <h1>����� include_param.jsp�Դϴ�.</h1>
  
  �̰��� include�� ���Դϴ�.
  
  <jsp:include page="forward_param.jsp">
    <jsp:param name="id" value="<%=b%>" />
    <jsp:param value="<%=a%>" name="pw"/>
  </jsp:include>
</body>
</html>