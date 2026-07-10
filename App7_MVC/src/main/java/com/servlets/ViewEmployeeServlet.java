package com.servlets;

import com.bean.EmployeeBean;
import com.DAO.ViewEmpDAO;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewEmployeeServlet extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException ,IOException{
	  ArrayList<EmployeeBean> al=new ViewEmpDAO().retrieve_empdata();
	  req.setAttribute("list", al);
	  req.getRequestDispatcher("ViewEmployee.jsp").forward(req, res);
  }
}
