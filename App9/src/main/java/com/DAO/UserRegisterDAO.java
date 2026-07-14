package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.UserBean;

public class UserRegisterDAO {
	public int insert_userdata(UserBean ub) {
		int rowCount = 0;
		try {

			Connection con = DBConnect.get_connection();
			PreparedStatement pstmt = con.prepareStatement("insert into registration values(?,?,?,?,?)");
			pstmt.setString(1, ub.getUb_username());
			pstmt.setString(2, ub.getUb_password());
			pstmt.setString(3, ub.getUb_firstname());
			pstmt.setString(4, ub.getUb_lastname());
			pstmt.setString(5, ub.getUb_mailid());
			pstmt.setString(6, ub.getUb_phone());
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
