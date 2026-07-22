package com.Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.UpdateProductServlletDAO;
import com.bean.ProductBean;
@WebServlet("/ups")
public class UpdateProductServlet2 extends HttpServlet {
    @Override
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
    	HttpSession session=req.getSession(false); 
		if(session==null) {
			  req.setAttribute("msg", "Session Expired!");
			  req.getRequestDispatcher("AdminLogin.html").forward(req, res);
		  }
		  else {
			  String pcode = req.getParameter("pcode");
				ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("products");
				ProductBean pb = null;
				Iterator<ProductBean> i = al.iterator();
				while (i.hasNext()) {
					pb = i.next();
					if (pcode.equals(pb.getPCODE())) {
						break;
					}
				}
				String qty=req.getParameter("reqno");
				int rowCount=new UpdateProductServlletDAO().updatedata(pb, qty);
				int price = Integer.parseInt(pb.getPPRICE());
				int buyQty = Integer.parseInt(qty);
				int amount = price * buyQty;
				if(rowCount>0) {
					req.setAttribute("amount", amount);
					req.setAttribute("data", "Your Order is placed Successfully!");
					req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
				}
				else {
					req.setAttribute("data", "Please try again!");
					req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
				}
		  }
	}
}
