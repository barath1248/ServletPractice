package com.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.CustomerRegisterDAO;
import com.bean.CustomerBean;

@SuppressWarnings("serial")
@WebServlet("/crs")
public class CustomerRegisterServlet extends HttpServlet {
 @Override
 protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
	 CustomerBean cb=new CustomerBean();
	 cb.setCNAME(req.getParameter("cname"));
	 cb.setCPASSWORD(req.getParameter("password"));
	 cb.setCFNAME(req.getParameter("cfname"));
	 cb.setCLNAME(req.getParameter("clname"));
	 cb.setCADDRESS(req.getParameter("caddress"));
	 cb.setCMAILID(req.getParameter("cmail"));
	 cb.setCMOBILE(req.getParameter("cmobile"));
	 
	 int rowCount=new CustomerRegisterDAO().insert_data(cb);
	 if(rowCount>0) {
		 req.setAttribute("msg", "Registration Successfull!");
		 req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
	 }
	 else {
		 req.setAttribute("msg", "Registration Failed!");
		 req.getRequestDispatcher("CustomerLogin.jsp").forward(req, res);
	 }
 }
}
