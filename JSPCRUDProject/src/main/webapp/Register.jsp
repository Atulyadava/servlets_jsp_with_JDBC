<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
<center>		
		<%!
		int Id;
		String Name;
		int Age;
		int Salary;
		String Desig;
		String PAN;
		%>
		<% try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("Jdbc:mysql://localhost/project","root","Atulyadav123@");
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
		
		Id=Integer.parseInt(request.getParameter("uId"));
		Name=request.getParameter("uName");
		Age=Integer.parseInt(request.getParameter("uAge"));
		Salary=Integer.parseInt(request.getParameter("uSalary"));
		Desig=request.getParameter("uDesig");
		PAN=request.getParameter("uPAN");
		
		pst.setInt(1,Id);
		pst.setString(2,Name);
		pst.setInt(3, Age);
		pst.setInt(4,Salary);
		pst.setString(5,Desig);
		pst.setString(6,PAN);
		pst.execute();
		con.close();
		pst.close();
		out.print("<h3>insertion successfully</h3>");
		}catch(Exception e){
			System.err.println(e);
		}
		 out.print("click here to go to <a href='Homepage.html'> home page</a>");
		%>
</center>

</body>
</html>