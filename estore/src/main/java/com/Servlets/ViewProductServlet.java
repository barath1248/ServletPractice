package com.Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.ViewProductDAO;
import com.bean.ProductBean;
@SuppressWarnings("serial")
@WebServlet("/view1")
public class ViewProductServlet extends HttpServlet{
  protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
	  HttpSession session=req.getSession(false);
	  if(session==null) {
		  req.setAttribute("msg", "Session Expired!");
		  req.getRequestDispatcher("AdminLogin.html").forward(req, res);
	  }
	  else {
		  ArrayList<ProductBean> al=new ViewProductDAO().get_data();
		  session.setAttribute("productlist", al);
		  req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
	  }  
  }
}
