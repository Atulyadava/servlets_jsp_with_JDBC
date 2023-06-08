<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
		<h1 style="color:black">hi welcome to jsp Demo</h1>
		<h2 style="color:red">just to check</h2>
		<%! int a=10;
		   int b=20;
		   int res;
		%>
		
		<% res=a+b; %>
		sum of a+b= <%= res %>

</body>
</html>