<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page errorPage="/WEB-INF/error/500.jsp" %>
<% response.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	<jsp:include page="../main/header.jsp"></jsp:include>
		
		<div class="container" style="width: 700px; border: 2px solid black;">
			<div style="text-align: center;">
			  <p style="font-size: 35px; font-weight: 700;">회원가입</p>
			</div>
			
			<div style="text-align:center;">
				<form action="#" method="post">
					<input type="text" name="userId" value="유저 아이디"><br>
					<input type="password" name="password" value="패스워드"><br>
					
					<label><input type="radio" name="gender" value="male">male</label>
					<label><input type="radio" name="gender" value="female">female</label><br>
					<input type="submit" value="회원가입"><br>
				</form>
			</div>
		</div>
		
	<jsp:include page="../main/footer.jsp"></jsp:include>
</body>
</html>