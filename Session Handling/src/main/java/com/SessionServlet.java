package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("name");
		
		HttpSession session=request.getSession();
		
		out.print("<h2>Name ="+name+"</h2>");
		
		if(name!=null && name.length()>0)
		session.setAttribute("Name", name);
		
		out.print("session Id ="+ session.getId());
		out.print("<h2>Session's Name ="+session.getAttribute("Name")+"</h2>");
		
	
	}

}
