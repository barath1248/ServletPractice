package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
@WebServlet("/VoterServlet")
public class Servlet2 extends GenericServlet {
  public void service(ServletRequest req , ServletResponse res) throws IOException , ServletException{
	  PrintWriter pw=res.getWriter();
	  res.setContentType("text/html");
	  
	  String voter_name=req.getParameter("vname");
	  String voter_dob=req.getParameter("vdob");
      String voter_city=req.getParameter("vcity");
	  
	  int year=Integer.parseInt(voter_dob.substring(6,10));
	  int age=2026-year;
	  if(age>=18) {
		  pw.print(voter_name+" you are Eligible to vote from "+voter_city);
	  }
	  else {
		  pw.print(voter_name+" not Eligible to vote");
	  }
  }
}
