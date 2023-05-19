<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>parameter로 받기</title>
</head>
<body>
  
  <form action="requestparam.jsp">
  <input type="checkbox" name="hobby" value="read">독서
  <input type="checkbox" name="hobby" value="cook">요리
  <input type="checkbox" name="hobby" value="run">조깅
  <input type="checkbox" name="hobby" value="swim">수영
  <input type="checkbox" name="hobby" value="sleep">취침 <br/>
  <input type="submit" value="전송">
  </form>
</body>
</html>