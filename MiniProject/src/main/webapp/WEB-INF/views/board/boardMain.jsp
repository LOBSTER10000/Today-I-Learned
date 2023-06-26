<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page errorPage="/WEB-INF/views/error/500.jsp"%>
<% response.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 메인</title>
</head>
<body>
	<jsp:include page="../main/header.jsp" />
		<div class="container" style="border: 1px solid black;">
			
			<div style="text-align:center;">
			 <p style="font-size: 35px; font-weight: 700;">게시판</p>
			</div>
			
			<div>
				<table>
					<thead>
						<tr>
							<td>제목</td>
							<td>내용</td>
							<td>시간</td>
							<td>글쓴이</td>
						</tr>
					</thead>
					<tbody>
						<tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	<jsp:include page="../main/footer.jsp" />
</body>
</html>