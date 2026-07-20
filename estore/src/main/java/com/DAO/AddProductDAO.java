package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.ProductBean;

public class AddProductDAO {
	public int insert_product(ProductBean pb) {
		int rowCount = 0;

		try {
			Connection con = DBConnect.get_connection();
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?,?,?)");
			pstmt.setString(1, pb.getPCODE());
			pstmt.setString(2, pb.getPNAME());
			pstmt.setString(3, pb.getPCOMPANY());
			pstmt.setString(4, pb.getPPRICE());
			pstmt.setString(5, pb.getPQTY());
			 rowCount=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
