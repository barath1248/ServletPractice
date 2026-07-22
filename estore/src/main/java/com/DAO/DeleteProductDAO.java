package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.ProductBean;

public class DeleteProductDAO {
	public int delete_data(ProductBean pb) {
		int rowCount = 0;
		try {
			Connection con = DBConnect.get_connection();
			PreparedStatement pstmt = con.prepareStatement("Delete from product where PCODE=?");
			pstmt.setString(1, pb.getPCODE());
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
