<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page errorPage="/WEB-INF/views/error/500.jsp" %>
<%
 response.setCharacterEncoding("UTF-8");
%>

<html>
<head>
	<title>재활운동 시작</title>
</head>
<body>
<jsp:include page="main/header.jsp" />
 <div class="container">
  <div class="row">
  	<div class="col-md-6">
  		<table>
  			<thead></thead>
  			<tbody>
  				<tr>
  					<td>이</td>
  					<td>동</td>
  					<td>규</td>
  					<td>4</td>
  				</tr>
  				<tr>
  					<td>다</td>
  					<td>시</td>
  					<td>파</td>
  					<td>이</td>
  				</tr>
  				<tr>
  					<td>팅</td>
  					<td>해</td>
  					<td>서</td>
  					<td>열</td>
  				</tr>
  				<tr>
  					<td>공</td>
  					<td>합</td>
  					<td>시</td>
  					<td>다</td>
  				</tr>
  			</tbody>
  		</table>
  	</div>
  	<div class="col-md-6">
  		<div class="container">
  			<img src="/ex/resources/img/main/project.png" style="width: 100%;">
  		</div>
  	</div>
  </div>
 </div>
 <jsp:include page="main/footer.jsp" />
</body>
</html>
