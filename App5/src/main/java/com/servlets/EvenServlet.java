package com.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
@SuppressWarnings("serial")
@WebServlet("/es")
public class EvenServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException , IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		int number=Integer.parseInt(req.getParameter("num"));
		if(number%2==0) {
			pw.print("<center><h1>");
			pw.print(number+"is"+"Even number");
			pw.print("</h1></center>");
		}
		else
		{
			pw.print("<center><h1>");
			pw.print(number+"is"+"Odd number");
			pw.print("</h1></center>");
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req,res);
				
		
		
	}
}
