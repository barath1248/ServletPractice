package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfielServlet extends HttpServlet{
 protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
	 Cookie arr[]=req.getCookies();
	 if(arr==null) {
		 req.setAttribute("msg", "Session Expired");
		 req.getRequestDispatcher("Register.jsp").forward(req, res);
	 }
	 else {
		 
	 }
 }
}
