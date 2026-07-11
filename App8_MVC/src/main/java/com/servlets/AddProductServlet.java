package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.AddProductDAO;
import com.bean.ProductBean;

@SuppressWarnings("serial")
@WebServlet("/aps")
public class AddProductServlet extends HttpServlet{
   protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException,IOException{
	   ProductBean bean=new ProductBean();
	   bean.setP_CODE(req.getParameter("pcode"));
	   bean.setP_NAME(req.getParameter("pname"));
	   bean.setP_COMPANY(req.getParameter("pcompany"));
	   bean.setP_PRICE(req.getParameter("pprice"));
	   bean.setP_QTY(req.getParameter("pqty"));
	   
	   int rowCount=new AddProductDAO().insert_productdata(bean);
	   if(rowCount>0) {
		   req.setAttribute("msg","Record Insertion Successfull!");
			req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
			}
		else {
			req.setAttribute("msg","Record Insertion Failed!");
			req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
	   }
   }
}
