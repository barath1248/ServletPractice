package com.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.EmployeeBean;
public class ViewEmpDAO {
	ArrayList<EmployeeBean> al=new ArrayList<>();
  public ArrayList<EmployeeBean> retrieve_empdata(){
	  try {
		  Connection con=DBConnector.getConnection();
		  PreparedStatement pstmt=con.prepareStatement("select * from employee");
		  ResultSet rs=pstmt.executeQuery();
		  while(rs.next()) {
			  EmployeeBean bean=new EmployeeBean();
			  bean.setE_id(rs.getString(1));
			  bean.setE_fname(rs.getString(2));
			  bean.setE_lname(rs.getString(3));
			  bean.setE_sal(rs.getInt(4));
			  bean.setE_address(rs.getString(5));
			  al.add(bean);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return al;
  }
}
