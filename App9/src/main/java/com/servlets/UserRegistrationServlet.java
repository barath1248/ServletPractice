package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.UserRegisterDAO;
import com.bean.UserBean;

@SuppressWarnings("serial")
@WebServlet("/urs")
public class UserRegistrationServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException{
	  UserBean ub=new UserBean();
	  ub.setUb_username(req.getParameter("username"));
	  ub.setUb_password(req.getParameter("password"));
	  ub.setUb_firstname(req.getParameter("fname"));
	  ub.setUb_lastname(req.getParameter("lname"));
	  ub.setUb_mailid(req.getParameter("mail"));
	  ub.setUb_phone(req.getParameter("phone"));
	  int rowCount=new UserRegisterDAO().insert_userdata(ub);
	  if(rowCount>0) {
		  req.setAttribute("msg","User Registered Successfully!");
		  req.getRequestDispatcher("Register.jsp").forward(req, res);
	  }
	  else {
		  req.setAttribute("msg","User Registration Failed!");
		  req.getRequestDispatcher("Register.jsp").forward(req, res);
	  }
  }
}
