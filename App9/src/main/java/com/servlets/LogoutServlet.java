package com.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
 protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{
	 Cookie arr[]= req.getCookies();
		if(arr==null) {
			req.setAttribute("msg","Session Expired");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
		else {
			ServletContext context=req.getServletContext();
			context.getAttribute("userBean");
			arr[0].setMaxAge(0);
			res.addCookie(arr[0]);
			req.setAttribute("msg","User logged out!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
		}
 }
}
