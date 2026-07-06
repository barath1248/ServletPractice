package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/product")
public class ProductServlet extends GenericServlet{
	public void service(ServletRequest req , ServletResponse res) throws ServletException , IOException
	{
		  PrintWriter pw=res.getWriter();
		  res.setContentType("text/html");
		  
		  String p_name=req.getParameter("pname");
		  String p_id=req.getParameter("pid");
		  int p_qunt=Integer.parseInt(req.getParameter("qty"));
		  int p_price=Integer.parseInt(req.getParameter("price"));
		  

		  if(p_qunt<=5) {
			  p_price=p_price+(p_price*10/100);
			  
			  pw.print("<h2>Product Details</h2>");
			  pw.print("Product Name: " +p_name+"<br>");
			  pw.print("Product ID: " +p_id+"<br>");
			  pw.print("Product Quantity: " +p_qunt+"<br>");
			  pw.print("Product price: " +p_price+"<br>");
		  }
		  else 
		  {
			  pw.print("<h2>Product Details</h2>");
			  pw.print("Product Name: " +p_name+"<br>");
			  pw.print("Product ID: " +p_id+"<br>");
			  pw.print("Product Quantity: " +p_qunt+"<br>");
			  pw.print("Product price: " +p_price+"<br>");
			  
		  }
	}

}
