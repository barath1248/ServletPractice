package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.ProductBean;

public class UpdateProductDAO {
  
 public int update_data(ProductBean pb) {
	 int rowCount=0;
	 try {
		Connection con=DBConnect.get_connection();
		PreparedStatement pstmt=con.prepareStatement("update product set PPRICE=?,PQTY=? where PCODE=?");
		pstmt.setString(1, pb.getPPRICE());
		pstmt.setString(2,pb.getPQTY());
		pstmt.setString(3, pb.getPCODE());
		rowCount=pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 return rowCount;
 }
}
