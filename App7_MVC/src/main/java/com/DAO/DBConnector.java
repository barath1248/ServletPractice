package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
 private static Connection con=null;
 private DBConnector() {}
  
 static {
	 try {
		 Class.forName(DBInfo.driver);
		 con=DriverManager.getConnection(DBInfo.dburl,DBInfo.username,DBInfo.password);
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 }
 public static Connection getConnection() {
	 return con;
 }
}
