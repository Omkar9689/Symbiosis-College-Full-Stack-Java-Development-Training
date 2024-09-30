package JDBCProject3;

import java.sql.*;

public class UtilClass{
	
	private static Connection con;
	private static final String url="jdbc:mysql://localhost/Account?useSSL=false";
	private static final String DB_uname="root";
	private static final String DB_upass="mysql8";
	
	public static Connection getConnection() {
		try {
			con=DriverManager.getConnection(url,DB_uname,DB_upass);
			System.out.println("Connecting......");
		}
		catch(SQLException e) {
			System.out.println("Error......"+e.getMessage());
		}
		return con;
	}
}

