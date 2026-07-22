package com.Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.ViewCustomerProductDAO;
import com.bean.ProductBean;


@WebServlet("/view2")
public class ViewCustomerProductServlet extends HttpServlet {
    @Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
		HttpSession session=req.getSession(false);
		if(session==null) {
			req.setAttribute("msg", "Session Expired!");
			req.getRequestDispatcher("CustomerLogin.html").forward(req, res);
		}
		else {
			ArrayList<ProductBean> al=new ViewCustomerProductDAO().viewdata();
			 session.setAttribute("products", al);
			  req.getRequestDispatcher("ViewProduct2.jsp").forward(req, res);
		}
	}
}
