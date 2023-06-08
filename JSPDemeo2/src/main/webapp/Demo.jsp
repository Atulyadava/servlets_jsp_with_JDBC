<%@ page import="java.util.Iterator" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
		<h1 style="color:red"=>collection demo</h1>
		<% 
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("anika");
		al.add('a');
		al.add(23.4);
		al.add(false);
		al.add("arun");
		out.print(al);
		Iterator i=al.iterator();
		while(i.hasNext()){
			out.print(i.next());
			out.print("<br>");			
		}
		%>
</body>
</html>