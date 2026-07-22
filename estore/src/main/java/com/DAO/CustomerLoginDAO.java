package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.CustomerBean;

public class CustomerLoginDAO {
  
	public CustomerBean login(String username, String Password) {
		CustomerBean cb=null;
		try {
			Connection con = DBConnect.get_connection();
			PreparedStatement pstmt = con.prepareStatement("select * from Customer where USERNAME=? and PASSWORD=?");
			pstmt.setString(1, username);
			pstmt.setString(2, Password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				cb = new CustomerBean();
				cb.setCNAME(rs.getString(1));
				cb.setCPASSWORD(rs.getString(2));
				cb.setCFNAME(rs.getString(3));
				cb.setCLNAME(rs.getString(4));
				cb.setCADDRESS(rs.getString(5));
				cb.setCMAILID(rs.getString(6));
				cb.setCMOBILE(rs.getString(7));
			}	
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return cb;
	}
}
