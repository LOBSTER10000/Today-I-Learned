<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="student" class="com.javalec.ex.Student" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body> 
   <%
    String name = request.getParameter("name");
    String age1 = request.getParameter("age");
    Integer age = Integer.parseInt(age1);
    String grade1 = request.getParameter("grade");
    Integer grade = Integer.parseInt(grade1);
    String studentNum1 = request.getParameter("studentNum");
    Integer studentNum = Integer.parseInt(studentNum1);
   %>
 
 
   <jsp:setProperty name="student" property="name" value="<%=name %>"/>
   <jsp:setProperty name="student" property="age" value="<%=age %>" />
   <jsp:setProperty name="student" property="grade" value="<%=grade %>" />
   <jsp:setProperty name="student" property="studentNum" value="<%=studentNum %>" />
   
   �̸� : <jsp:getProperty name="student" property="name"/> <br/>
   ���� : <jsp:getProperty name="student" property="age"/> <br/>
   �г� : <jsp:getProperty name="student" property="grade"/> <br/>
   ��ȣ : <jsp:getProperty name="student" property="studentNum"/> <br/>
   
   
   �̸� : ${student.name} <br/>
   ���� : ${student.age} <br/>
   �г� : ${student.grade} <br/>
   ��ȣ : ${student.studentNum} <br/>
   

</body>
</html>