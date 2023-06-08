package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Subject11th")
public class Subject11th extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		System.out.println();
		
		try {			
			  Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","Atulyadav123@");
			Statement st=con.createStatement();			
			ResultSet res=st.executeQuery("select * from teacher where class like '11th%';");
			while(res.next()) {
				out.print(res.getString(3));
				out.print("<br>");				
			}
		      out.print("Click hear to go to <a href='Homepage.html'>Home page </a>");			
			st.close();
			con.close();
		}catch(Exception e) {
			System.err.println(e);
		}
	     
	}

}
