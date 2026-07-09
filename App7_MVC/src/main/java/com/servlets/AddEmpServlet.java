package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.EmployeeBean;
import com.DAO.AddEmpDAO;
@SuppressWarnings("serial")
@WebServlet("/aes")
public class AddEmpServlet extends HttpServlet {
 
	protected void doPost(HttpServletRequest req ,HttpServletResponse res) throws ServletException , IOException{
		EmployeeBean eb=new EmployeeBean();
		eb.setE_id(req.getParameter("eid"));
		eb.setE_fname(req.getParameter("efname"));
		eb.setE_lname(req.getParameter("elname"));
		eb.setE_sal(Integer.parseInt(req.getParameter("esal")));
		eb.setE_address(req.getParameter("eaddress"));
		AddEmpDAO empdao=new AddEmpDAO();
		int rowCount=empdao.insert_empdata(eb);
		if(rowCount>0) {
			System.out.println("Record Insertion Successfull");
		}
		else {
			System.out.println("Record Insertion Failed");
		}
	}
	
}
