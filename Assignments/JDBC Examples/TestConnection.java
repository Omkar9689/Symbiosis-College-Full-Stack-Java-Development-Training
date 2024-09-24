
import java.sql.*;

import com.mysql.cj.Query;

public class TestConnection {
	
	static String myURl = "jdbc:mysql://localhost/Employee?useSSL=false";
	
	public static void testConnection() {
		Connection con;
		try {
			con=DriverManager.getConnection(myURl,"root","mysql8");
			System.out.println("Connection Esatblished");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectData() {
		Connection con;
		try {
			con=DriverManager.getConnection(myURl,"root","mysql8");
			System.out.println("Connection Esatblished");
			
			Statement smt = con.createStatement();
			
			ResultSet rs = smt.executeQuery("Select * from employee;");
			System.out.println("---------------------------------------------------------------------------------");
			while(rs.next()) {
				System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"\t|\t"+rs.getString(4)+"\t|\t"+rs.getInt(5)+"\t|");
				System.out.println("---------------------------------------------------------------------------------");
			}

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testConnection();
		selectData();
	}

}
