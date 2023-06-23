<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<%
 response.setStatus(200);
 response.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>오류메세지</title>
</head>
<body>
  <h3>오류 페이지입니다</h3>
  <h3>오류가 났어요</h3>
</body>
</html>