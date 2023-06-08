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

@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String uid=request.getParameter("sId");
		String uname=request.getParameter("sName");
		String uclass=request.getParameter("sclass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("insert into student values(?,?,? )"); 
			pst.setString(1,uid);
			pst.setString(2,uname);
			pst.setString(3,uclass);
			pst.execute();
			pst.close();
			con.close();
			System.out.println("data inserted successfully...!");
		}catch(Exception e) {
			System.out.println(e);
		}
		 PrintWriter out=response.getWriter();
		 out.print("data insert successfully");
	     out.print("click here to go to <a href='Homepage.html'> home page</a>");
	}

}
