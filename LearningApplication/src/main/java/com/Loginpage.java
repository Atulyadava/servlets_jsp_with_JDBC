package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loginpage")
public class Loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upassword");
		 PrintWriter out=response.getWriter();		
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","Atulyadav123@");
		Statement stmt=con.createStatement();
	 ResultSet	rs=stmt.executeQuery("select * from login");
	 while(rs.next())
	 {		
		if(uname.equalsIgnoreCase(rs.getString(1)) && upass.equalsIgnoreCase(rs.getString(2)))
			{
				RequestDispatcher rd= request.getRequestDispatcher("Homepage.html");
				rd.forward(request, response);
			}else {
				out.print("<h5 style='color:red'>Sorry InValid Credentials....!</h5>");
				RequestDispatcher rd=request.getRequestDispatcher("Loginpage.html");
				rd.include(request, response);		
			}  }	 
		stmt.close();
		con.close();
		
		} catch (Exception e) {
			System.err.println(e);	}	}	
}
