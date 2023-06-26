<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page errorPage="/WEB-INF/error/500.jsp" %>
<% response.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
</head>
<body>
 	<jsp:include page="../main/header.jsp"></jsp:include>
 	
 	<div class="container" style="width: 700px;">
 		<div style="border: 1px solid black;">
 		 	<p style="text-align:center; font-size:35px; font-weight: 700; font-family:gothic;"> 로그인 </p>
 		</div>
 		<div style="margin-top: 5%; text-align:center;">
 			<form action="#" method="post">
 				<input type="text" name="userId" value="아이디"><br>
 				<input type="password" name="userPass" value="비밀번호"><br>
 				<input type="submit" value="클릭" style="border: none; color: white; background: dodgerblue;">
 			</form>
 		</div>
 		
 		<div style="margin-top:2%;">
 			<div style="text-align: center;">
 				<p>만일 가입된 아이디가 없다면?</p>
 				<a href="join" style="text-decoration:none; width:100px; height: 50px; font-size:30px; color: white; background: dodgerblue; border-radius: 10%; border: 2px solid dodgerblue; font-weight: 700;">
 				회원가입</a>
 			</div>
 		</div>
 	
 		
 	</div>
 	
 	
 	<jsp:include page="../main/footer.jsp"></jsp:include>
</body>
</html>