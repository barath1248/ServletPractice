package com.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.AddProductDAO;
import com.bean.ProductBean;
@WebServlet("/aps")
public class AddProductServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException , IOException{
	  
	  ProductBean pb=new ProductBean();
	  pb.setPCODE(req.getParameter("pcode"));
	  pb.setPNAME(req.getParameter("pname"));
	  pb.setPCOMPANY(req.getParameter("pcompany"));
	  pb.setPPRICE(req.getParameter("pprice"));
	  pb.setPQTY(req.getParameter("pqty"));
	  int rowCount= new AddProductDAO().insert_product(pb);
	  if(rowCount>0) {
		  req.setAttribute("msg","Product Added Successfully!");
		  req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
	  }
	  else {
		  req.setAttribute("msg", "Product Insertion Failed!");
		  req.getRequestDispatcher("AdminHome.jsp").forward(req, res);
	  }
	  
  }
}
