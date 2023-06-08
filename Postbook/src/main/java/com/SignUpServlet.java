package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDAOImpl;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		User user=new User(0,request.getParameter("username"),request.getParameter("password"));
		UserDAOImpl userDAOImpl=new UserDAOImpl();
		UserDAOImpl.initDatabase();
		boolean res=userDAOImpl.Signup(user);
		if(res) {
			out.print("<h2>SignUp Successfull</h2>");
		}
		else {
			out.print("<h2>THere was some error. Please Try again</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("signup.html");
			rd.include(request, response);
		}
	}

}
