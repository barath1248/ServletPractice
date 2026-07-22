package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.ProductBean;

public class UpdateProductServlletDAO {
	public int updatedata(ProductBean pb , String qty) {
		 int rowCount=0;
		 try {
			Connection con=DBConnect.get_connection();
			PreparedStatement pstmt=con.prepareStatement("update product set PQTY=? where PCODE=?");
		    int oldQty = Integer.parseInt(pb.getPQTY());
            int buyQty = Integer.parseInt(qty);
		    if (buyQty > oldQty) {
		        return 0;   
		    }
			pstmt.setString(1,String.valueOf(oldQty - buyQty));
			pstmt.setString(2, pb.getPCODE());
			rowCount=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return rowCount;
	 }
}
