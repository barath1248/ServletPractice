package com.pack1;

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
			RequestDispatcher rd=req.getRequestDispatcher("Display.jsp");
			rd.forward(req,res);		
		
	}
}
