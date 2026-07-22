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

import com.DAO.DeleteProductDAO;
import com.bean.ProductBean;
@WebServlet("/delete")
public class DeleteProductServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException{
	  HttpSession session=req.getSession(false);
	  if(session==null) {
		  req.setAttribute("msg", "Session Expired!");
		  req.getRequestDispatcher("AdminLogin.html").forward(req, res);
	  }
	  else {
		  String pcode=req.getParameter("pcode");
		  ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productlist");
		  ProductBean pb=null;
		  Iterator<ProductBean> i=al.iterator();
		  while(i.hasNext()) {
			  pb=i.next();
			  if(pcode.equals(pb.getPCODE())) {
				  break;
			  }
		  }
		  pb.setPCODE(pcode);
		  int rowCount=new DeleteProductDAO().delete_data(pb);
		  if(rowCount>0) {
			  req.setAttribute("data", "Product details are Deleted!");
			  req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
		  }
		  else {
			  req.setAttribute("data", "Deletion failed , Please try again!");
			  req.getRequestDispatcher("DeleteProduct.jsp").forward(req, res);
		  }
	  }
  }
}
