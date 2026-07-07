package com.servlets;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

@SuppressWarnings("serial")
@WebServlet("/ms")
public class MainServlet extends GenericServlet 
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException , IOException
	{
		//String choice = req.getParameter("choice");
		String choice = req.getParameter("choice");
		if(choice.equals("factorial")) {
			RequestDispatcher rd=req.getRequestDispatcher("/fs");
			rd.forward(req,res);		
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("/es");
			rd.forward(req,res);
		}
	}
}
