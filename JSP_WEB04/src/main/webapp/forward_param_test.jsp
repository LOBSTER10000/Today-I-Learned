<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>forward_param test</title>
</head>
<body>
   
   <jsp:forward page="forward_param.jsp">
    <jsp:param name="id" value="text" />
    <jsp:param name="pw" value="1234" />
   </jsp:forward>
</body>
</html>