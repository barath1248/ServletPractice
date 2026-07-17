package com.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.UpdateProfileDAO;
import com.bean.UserBean;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie arr[] = req.getCookies();
		String fname = null;
		if (arr == null) {
			req.setAttribute("msg", "Session Expired");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		} 
		else {
            ServletContext context=req.getServletContext();
            UserBean ub=(UserBean)context.getAttribute("userBean");
            ub.setUb_firstname(req.getParameter("ufname"));
            ub.setUb_lastname(req.getParameter("ulname"));
            ub.setUb_mailid(req.getParameter("umailid"));
            ub.setUb_phone(req.getParameter("uphone"));
             int rowCount=new UpdateProfileDAO().Update_data(ub);
             if(rowCount>0) {
            	 for(Cookie c:arr) {
            		 if("ck1".equals(c.getName())) {
            			 fname=c.getValue();
            			 req.setAttribute("fname", fname);
            			 req.setAttribute("data", "Record updated!");
            			 req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
            		 }
            	 }
             }
             else {
            	 throw new RuntimeException("Updation failed!");
             }
            }
	}
}
