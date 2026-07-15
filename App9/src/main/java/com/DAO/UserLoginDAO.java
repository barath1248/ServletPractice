package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.UserBean;

public class UserLoginDAO {
 public UserBean checkLogin(String uname , String upwd) {
	UserBean ub=null;
  try {
	Connection con=DBConnect.get_connection();
	PreparedStatement pstmt=con.prepareStatement("select * from registration where USERNAME=? and PASSWORD=?");
	pstmt.setString(1,uname);
	pstmt.setString(2, upwd);
	 ResultSet rs=pstmt.executeQuery();
	 if(rs.next()) {
		 ub=new UserBean();
		 ub.setUb_username(rs.getString(1));
		 ub.setUb_password(rs.getString(2));
		 ub.setUb_firstname(rs.getString(3));
		 ub.setUb_lastname(rs.getString(4));
		 ub.setUb_mailid(rs.getString(5));
		 ub.setUb_phone(rs.getString(6));
	 }
} catch (Exception e) {
	e.printStackTrace();
}
	 return ub;
 }

}
