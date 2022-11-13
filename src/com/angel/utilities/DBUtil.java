package com.angel.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection provideConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/crimify";
		
		try {
			conn = DriverManager.getConnection(url,"root","root");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return conn;
	}

}
