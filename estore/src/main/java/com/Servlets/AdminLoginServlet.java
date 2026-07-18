package com.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.AdminLoginDAO;
import com.bean.AdminBean;

@SuppressWarnings("serial")
@WebServlet("/als")
public class AdminLoginServlet extends HttpServlet{
  @Override
  protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
	  AdminBean abean=new AdminLoginDAO().CheckAdminLogin(req.getParameter("uname"), req.getParameter("password"));
	  if(abean==null) {
		  req.getRequestDispatcher("AdminLogin.html").forward(req, res);
	  }
	  else {
		  HttpSession session= req.getSession();
		  session.setAttribute("adminbean", abean);
		  req.getRequestDispatcher("AdminHome.jsp").forward(req, res);
	  }
  }
}
