<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
 response.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


  이름 : ${memberVo.name} <br/>
  나이 : ${memberVo.age} <br/>
  번호 : ${memberVo.studentNum} <br/>
</body>
</html>