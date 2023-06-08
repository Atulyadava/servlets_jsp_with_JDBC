<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<%!
		int id; 
		String name;
		int age;
		int salary;
		String desig;
		String pan;
		PreparedStatement pstmt;
		Connection con;
	%>
	<%
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Atulyadav123@");
			pstmt=con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
			
			id=Integer.parseInt(request.getParameter("uid"));
			name= request.getParameter("uname");
			age=Integer.parseInt(request.getParameter("uage"));
			salary= Integer.parseInt(request.getParameter("usalary"));
			desig= request.getParameter("udesig");
			pan= request.getParameter("upan");
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setInt(4, salary);
			pstmt.setString(5, desig);
			pstmt.setString(6, pan);
			
			pstmt.execute();
			pstmt.close();
			con.close();
			System.out.print("Data inserted Successsfully");
			
			
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	%>
	<h4>Data Inserted Successfully....!</h4>
Clik hear to<a href="Register.html">Register</a>
	

</body>
</html>
