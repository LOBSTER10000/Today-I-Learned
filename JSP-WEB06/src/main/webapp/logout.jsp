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
	   out.print("���� �� ��������");
   } else {
	   out.print("���� �� ���� �α׾ƿ�");
	   }
  %>
</body>
</html>