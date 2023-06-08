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
		
		String uid=request.getParameter("uid");try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","Atulyadav123@");
			PreparedStatement pst=con.prepareStatement("delete from emp where id=?");
						
			pst.setString(1,uid);
									
			pst.execute();
			//st.execute("insert into Emp values(333,'atul',22,50000,'dev')");
			pst.close();
			con.close();
			System.out.println("data will be deleted successfully...!");
		}catch(Exception e) {
			System.err.println(e);
		}
		PrintWriter out=response.getWriter();
	    out.print("data delete successfully");
	    out.print("click here to go to <a href='Homepage.html'> home page</a>");

	}

}
