package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.ProductBean;

public class ViewCustomerProductDAO {
	ArrayList<ProductBean> al=new ArrayList<>();
	public ArrayList<ProductBean> viewdata() {
		try {
			 Connection con=DBConnect.get_connection();
			   PreparedStatement pstmt=con.prepareStatement("select * from product");
			   ResultSet rs=pstmt.executeQuery();
			   while(rs.next()) {
				   ProductBean pb=new ProductBean();
				   pb.setPCODE(rs.getString(1));
				   pb.setPNAME(rs.getString(2));
				   pb.setPCOMPANY(rs.getString(3));
				   pb.setPPRICE(rs.getString(4));
				   pb.setPQTY(rs.getString(5));
				   al.add(pb);
			   }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
