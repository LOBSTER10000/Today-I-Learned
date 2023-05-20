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
    session.invalidate();
   
    if(request.isRequestedSessionIdValid()){
    	out.println("session is alive<br/>");
    }else {
    	out.print("session invalid");
    }
   %>
   
   
   <a href="session1.jsp">다시 처음으로</a>
</body>
</html>