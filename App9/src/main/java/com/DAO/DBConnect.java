package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection con = null;

	private DBConnect() {}

	static {
		try {
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.dburl, DBInfo.username, DBInfo.password);
			System.out.println("Database Connected!");
		} catch (Exception e) {
			System.out.println("Database not Connected!");
			e.printStackTrace();
		}
	}

	public static Connection get_connection() {
		return con;
	}
}
