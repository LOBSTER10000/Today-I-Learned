<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page errorPage="/WEB-INF/error/500.jsp" %>
<% response.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트</title>
</head>
<body>
  <jsp:include page="../main/header.jsp" />
  	<div class="container" style="border: 1px solid black;">
  		<div style="text-align:center;"><h1>목록</h1></div>
  		
  		<div>
  			<table>
  				<thead>
  					<tr>
  					<td></td>
  					<td>아이디</td>
  					<td>성별</td>
  					</tr>
  				</thead>
  				<tbody>
  					<tr>
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