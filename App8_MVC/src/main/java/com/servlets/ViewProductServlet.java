package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.ViewProductDAO;
import com.bean.ProductBean;

@WebServlet("/view")
@SuppressWarnings("serial")
public class ViewProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
		ArrayList<ProductBean> al=new ViewProductDAO().view_productdata();
		req.setAttribute("list", al);
		req.getRequestDispatcher("ViewProduct.jsp").forward(req, res);
	}

}
