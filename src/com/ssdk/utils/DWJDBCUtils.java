package com.ssdk.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DWJDBCUtils {
//	private static Logger logger = LogManager.getLogger();
	
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/dw","dw_db", "test");
//		logger.debug(conn.toString());
		return conn;
	}
	
}
