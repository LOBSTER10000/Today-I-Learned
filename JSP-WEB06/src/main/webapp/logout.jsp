<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <% 
   session.removeAttribute("id");
   session.removeAttribute("pw");
   session.invalidate();
   
   if(request.isRequestedSessionIdValid()){
	   out.print("세션 값 남아있음");
   } else {
	   out.print("세션 값 삭제 로그아웃");
	   }
  %>
</body>
</html>