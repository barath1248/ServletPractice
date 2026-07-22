package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.ProductBean;

public class BuyProductDAO {
   
  public void buyproduct(ProductBean pb) {
	  try {
		Connection con=DBConnect.get_connection();
		PreparedStatement pstmt=con.prepareStatement("select * from Product where PCODE=?");
		pstmt.setString(1, pb.getPCODE());
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			pb.setPCODE(rs.getString(1));
			pb.setPNAME(rs.getString(2));
			pb.setPCOMPANY(rs.getString(3));
			pb.setPPRICE(rs.getString(4));
			pb.setPQTY(rs.getString(5));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
