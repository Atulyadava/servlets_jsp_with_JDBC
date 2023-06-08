package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		response.setContentType("text/html");
		String uid=request.getParameter("uid");
		String uname=request.getParameter("uname");
		String uage=request.getParameter("usage");
		String usalary=request.getParameter("usalary");
		String udesig=request.getParameter("udesig");
      try {
    	  Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("insert into Emp values(?,?,?,?,? )"); 
							
			pst.setString(1,uid);
			pst.setString(2,uname);
			pst.setString(3,uage);
			pst.setString(4,usalary);
			pst.setString(5,udesig);				
			pst.execute();
			//st.execute("insert into Emp values(555,'jumba',22,50000,'dev')");
			pst.close();
			con.close();
			System.out.println("data inserted successfully...!");
      }
      catch(Exception e){
    	  System.err.println(e);
      }	
      PrintWriter out=response.getWriter();
      out.print("data insert successfully");
      out.print("click here to go to <a href='Homepage.html'> home page</a>");
}
}
