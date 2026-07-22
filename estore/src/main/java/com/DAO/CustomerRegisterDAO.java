package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.CustomerBean;

public class CustomerRegisterDAO {
  public int insert_data(CustomerBean cb) {
	  int rowCount=0;
	  try {
		Connection con=DBConnect.get_connection();
		PreparedStatement pstmt=con.prepareStatement("insert into Customer values(?,?,?,?,?,?,?)");
		pstmt.setString(1, cb.getCNAME());
		pstmt.setString(2, cb.getCPASSWORD());
		pstmt.setString(3, cb.getCFNAME());
		pstmt.setString(4, cb.getCLNAME());
		pstmt.setString(5, cb.getCADDRESS());
		pstmt.setString(6, cb.getCMAILID());
		pstmt.setString(7, cb.getCMOBILE());
		rowCount=pstmt.executeUpdate();	
	} 
	 catch (Exception e) {
		e.printStackTrace();
	}
	  return rowCount;
  }
}
