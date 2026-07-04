package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/es")
public class Servlet3 extends GenericServlet{

	public void service(ServletRequest req , ServletResponse res) throws ServletException , IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String E_NAME=req.getParameter("ename");
		String E_ID=req.getParameter("eid");
		String E_SAL=req.getParameter("esal");
		String E_EXP=req.getParameter("eexp");
		
		int exp=Integer.parseInt(E_EXP);
		int sal=Integer.parseInt(E_SAL);
		if(exp>=5) {
			sal=sal+(sal*10/100);
			pw.print("<center><h1>");
			pw.print("Employee Name: "+ E_NAME+"<br><br>");
			pw.print("Employee ID: "+ E_ID+"<br><br>");
			pw.print("Employee salary: "+ sal+"<br><br>");
			pw.print("Employee Experience: "+ E_EXP+"<br><br>");
			pw.print("</h1><center>");
		}
		else {
			pw.print("<center><h1>");
			pw.print("Employee Name: "+ E_NAME+"<br><br>");
			pw.print("Employee ID: "+ E_ID+"<br><br>");
			pw.print("Employee salary: "+ sal+"<br><br>");
			pw.print("Employee Experience: "+ E_EXP+"<br><br>");
			pw.print("</h1><center>");
		}
		
	}
}
