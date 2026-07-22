package com.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.CustomerLoginDAO;
import com.bean.CustomerBean;

@WebServlet("/login")
public class CustomerLoginServlet extends HttpServlet {
  @Override	
  protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
	   CustomerBean cb=new CustomerLoginDAO().login(req.getParameter("lcname"), req.getParameter("lcpassword"));
	   if(cb==null) {
		   req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
	   }
	   else {
		      HttpSession session= req.getSession();
			  session.setAttribute("customerbean", cb);
			  req.getRequestDispatcher("CustomerHome.jsp").forward(req, res);
	   }
  }
}
