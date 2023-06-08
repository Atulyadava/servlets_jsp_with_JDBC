<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
	<%!
	int Id;
	%>
	<% try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
	PreparedStatement pst=con.prepareStatement("delete from emp where id=?");
	Id=Integer.parseInt(request.getParameter("uId"));
	pst.setInt(1,Id);
	pst.execute();
	con.close();
	pst.close();
	out.print("<h3> Successfully deleted...</h3>");
	}catch(Exception e){
		System.err.println(e);
	}
	 out.print("click here to go to <a href='Homepage.html'> home page</a>");
	%>

</body>
</html>