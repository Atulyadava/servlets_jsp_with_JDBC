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


@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid=request.getParameter("uid");
		String usalary=request.getParameter("usalary");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("update emp set salary=? where id=?");
			
			pst.setString(1,usalary);
			pst.setString(2,uid);
			
						
			pst.execute();
			pst.close();
			con.close();
			System.out.println("data Updated successfully...!");
		}catch(Exception e) {
			System.err.println(e);
		}
		PrintWriter out=response.getWriter();
	    out.print("data update successfully");
	    out.print("click here to go to <a href='Homepage.html'> home page</a>");
		
	}

}
