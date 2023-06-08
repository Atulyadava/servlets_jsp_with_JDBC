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

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uid=request.getParameter("sId");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("delete from student where id=?"); 
			pst.setString(1,uid);
			pst.execute();

			pst.close();
			con.close();
			System.out.println("data deleted successfully...!");
		}catch(Exception e) {
			System.out.println(e);
		}
		out.print("data deleted successfully");
	    out.print("click here to go to <a href='Homepage.html'> home page</a>");
	}

}
