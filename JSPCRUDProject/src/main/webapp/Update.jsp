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
		int Salary;
		%>

		<% 
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
				PreparedStatement pst=con.prepareStatement("update emp set salary=? where id=?");
				
				Id=Integer.parseInt(request.getParameter("uId"));
				Salary=Integer.parseInt(request.getParameter("uSalary"));
				
				pst.setInt(1,Salary);
				pst.setInt(2, Id);
				pst.execute();
				con.close();
				pst.close();
				out.print("<h3>Update successfully</h3>");
			}
		catch(Exception e){
			System.err.println(e);
		}
		 out.print("click here to go to <a href='Homepage.html'> home page</a>");
		%>

</body>
</html>