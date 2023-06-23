<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
  					<td>1</td>
  					<td>2</td>
  					<td>3</td>
  					<td>4</td>
  				</tr>
  				<tr>
  					<td>1</td>
  					<td>2</td>
  					<td>3</td>
  					<td>4</td>
  				</tr>
  				<tr>
  					<td>1</td>
  					<td>2</td>
  					<td>3</td>
  					<td>4</td>
  				</tr>
  				<tr>
  					<td>1</td>
  					<td>2</td>
  					<td>3</td>
  					<td>4</td>
  				</tr>
  			</tbody>
  		</table>
  	</div>
  	<div class="col-md-6">
  	
  	</div>
  </div>
 </div>
 <jsp:include page="main/footer.jsp" />
</body>
</html>
