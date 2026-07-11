package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.ProductBean;

public class AddProductDAO {
  public int insert_productdata(ProductBean pb){
	  int rowCount=0;
	  try {
		  Connection con=DBConnect.get_connection();
		  PreparedStatement pstmt=con.prepareStatement("insert into product values(?,?,?,?,?)");
		  pstmt.setString(1,pb.getP_CODE());
		  pstmt.setString(2,pb.getP_NAME());
		  pstmt.setString(3,pb.getP_COMPANY());
		  pstmt.setString(4,pb.getP_PRICE());
		  pstmt.setString(5,pb.getP_QTY());
		  rowCount=pstmt.executeUpdate();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return rowCount;
  }
}
