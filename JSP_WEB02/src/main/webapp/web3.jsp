<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ǥ����</title>
</head>
<body>
  
  
  <%! 
   int i = 10;
  String str = "ǥ���� �׽�Ʈ ��";
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