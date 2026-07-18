package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.AdminBean;

public class AdminLoginDAO {
	public AdminBean CheckAdminLogin(String username, String Password) {
		AdminBean ab = null;
		try {
			Connection con = DBConnect.get_connection();
			PreparedStatement pstmt = con.prepareStatement("select * from Admin where USERNAME=? and PASSWORD=?");
			pstmt.setString(1, username);
			pstmt.setString(2, Password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				ab = new AdminBean();
				ab.setUsername(rs.getString(1));
				ab.setPassword(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setAddress(rs.getString(5));
				ab.setMid(rs.getString(6));
				ab.setPhone(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ab;
	}
}
