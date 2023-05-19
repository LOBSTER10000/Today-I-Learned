<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>표현식</title>
</head>
<body>
  
  
  <%! 
   int i = 10;
  String str = "표현식 테스트 중";
  %>
  
  <%!
   public int sum(int a, int b){
	  return a+b;
  }
  %>
  <%=
    i
  %>
  <br/>
  <%=
    str
  %>
  <br/>
  <%=
   sum(6,7)
  %>
</body>
</html>