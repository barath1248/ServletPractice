package com.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
@SuppressWarnings("serial")
@WebServlet("/fs")
public class FactorialServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException , IOException
	{
		int number=Integer.parseInt(req.getParameter("num"));
		int fact=1;
		for(int i=1;i<=number;i+=1) {
			fact=fact*i;
		}
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.print("<center><h1>");
		pw.print("Factorial for "+number+" is "+fact);
		pw.print("</h1></center>");
		
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req,res);
	}
}
