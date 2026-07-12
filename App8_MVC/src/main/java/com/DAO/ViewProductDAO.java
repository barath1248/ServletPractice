package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.bean.ProductBean;
import java.sql.ResultSet;
public class ViewProductDAO {
  ArrayList<ProductBean> al=new ArrayList<>();
  public ArrayList<ProductBean> view_productdata(){
	  try {
		  Connection con=DBConnect.get_connection();
		  PreparedStatement pstmt=con.prepareStatement("select * from product");
		  ResultSet rs=pstmt.executeQuery();
		  while(rs.next()) {
			  ProductBean pb=new ProductBean();
			  pb.setP_CODE(rs.getString(1));
			  pb.setP_NAME(rs.getString(2));
			  pb.setP_COMPANY(rs.getString(3));
			  pb.setP_PRICE(rs.getString(4));
			  pb.setP_QTY(rs.getString(5));
			  al.add(pb);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return al;
  }
}
