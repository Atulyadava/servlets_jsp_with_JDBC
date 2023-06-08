<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
		
		
		<% try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("Jdbc:mysql://localhost/project","root","Atulyadav123@");
		Statement st=con.createStatement();			
		ResultSet res=st.executeQuery("select * from emp;");
		out.print("<h3>This is the data in database</h3>");
		while(res.next()){
			out.print(res.getInt(1)+" : "+res.getString(2)+" : "+res.getInt(3)+" : "+res.getInt(4)+" : "+res.getString(5)+" : "+res.getString(6));
			out.print("<br>");
		}
		con.close();
		st.close();
		
		}catch(Exception e){
			System.err.println(e);
		}
		 out.print("click here to go to <a href='Homepage.html'> home page</a>");
		%>


</body>
</html>