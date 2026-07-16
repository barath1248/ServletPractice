package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.UserBean;

public class UpdateProfileDAO {
 public int Update_data(UserBean ub) {
	 int rowCount=0;
	try {
		Connection con=DBConnect.get_connection();
		PreparedStatement pstmt=con.prepareStatement("update registration set FIRSTNAME=?,LASTNAME=?, MAILID=?,PHONE=? where USERNAME=?");
		pstmt.setString(1,ub.getUb_firstname());
		pstmt.setString(2, ub.getUb_lastname());
		pstmt.setString(3, ub.getUb_mailid());
		pstmt.setString(4, ub.getUb_phone());
		pstmt.setString(5, ub.getUb_username());
		rowCount=pstmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 return rowCount;
 }
}
