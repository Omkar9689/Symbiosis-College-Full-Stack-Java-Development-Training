package JDBCProject2;

import java.sql.*;

public class DBUtil2 {
	
	private static Connection con;
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "mysql8";
	private static final String DB_URL="jdbc:mysql://localhost/VisitorsDB?useSSL=false";
	
	public static Connection getConnection(){
		
		try {
				Class.forName(DB_DRIVER_CLASS);
				System.out.println("Driver Loaded Successfuly");
				
				con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
				System.out.println("Connection Established");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Error....."+e.getMessage());
		}
		catch (SQLException e) {
			System.out.println("Error....."+e.getMessage());
		}
		return con;		
	}
}
