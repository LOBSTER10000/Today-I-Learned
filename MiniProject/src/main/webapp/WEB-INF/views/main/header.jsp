<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page errorPage="/WEB-INF/views/error/500.jsp"%>
<%
	response.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="<c:url value="/resources/css/header.css" />" type="text/css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header</title>
</head>
<body>
	<div class="container-fruid" id="header">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
				<p id="header-left">
					<a href=#>재활 공장장</a>
				</p>
				</div>
				<div class="col-md-8" style="display:flex; justify-content:flex-end;">
					<div class="header-right" style="padding-right: 5%;"><span>
					<a href="list" style="text-decoration:none; color:black;">리스트</a></span></div>
					
					<div class="header-right" style="padding-right: 5%;"><span>
					<a href="#" style="text-decoration:none; color:black;">게시판 관리</a></span></div>
					
					<div class="header-right" style="padding-right: 5%;"><span>
					<a href="login" style="text-decoration:none; color:black;">로그인</a></span></div>
				
				</div>
			</div>


		</div>
	</div>
</body>
</html>