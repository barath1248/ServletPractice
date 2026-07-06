package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends GenericServlet {
 public void service(ServletRequest req , ServletResponse res) throws ServletException , IOException
 {
	 PrintWriter pw=res.getWriter();
	  res.setContentType("text/html");
	  
	  String username=req.getParameter("uname");
	  String pwd=req.getParameter("pwd");
	  
	  if(username.equals("Your Name") && pwd.equals("java is awesome"))
	  {
		  pw.print("<h2>Welcome"+username+"</h2><br>");
		  pw.print("<h2>You did the TASK!!!!</h2>");
	  }
	  else 
	  {
		  pw.print("<h2>Welcome"+username+"</h2><br>");
		  pw.print("<h2>Invalid Credentials!!!!</h2>");
	  }
 }
}
