package JDBC;


import java.util.*;
import java.sql.*;

public class JDBCEmployee {

	static String mysqlURL = "jdbc:mysql://localhost/Employee?useSSL=false";
	static Connection con;
	static Scanner sc = new Scanner(System.in);
	
	public static void createConnection() {
		
		try {
			Connection con = DriverManager.getConnection(mysqlURL,"root","mysql8");
			System.out.println("Connection Established");
		}
		catch(SQLException e) {
			e.printStackTrace();
		
		}
	
	}
 	public static void showData() {
		Connection con;
		try {
			con=DriverManager.getConnection(mysqlURL,"root","mysql8");
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

 	
	public static void insertData() {
		
		System.out.println("Enter Data...");
		System.out.println("Enter Employee ID");
		int ecode=sc.nextInt();
		System.out.println("Enter Employee Name");
		String empName=sc.next();
		System.out.println("Enter Employee Gender (M/F)");
		char empGender=sc.next().charAt(0);
		System.out.println("Enter Employee Grade ");
		char empGrade=sc.next().charAt(0);
		System.out.println("Enter Employee Salary");
		int empSalary=sc.nextInt();
		
		Connection con;
		int n=0;
		try {
			con=DriverManager.getConnection(mysqlURL,"root","mysql8");
			System.out.println("Connection Esatblished");
			
			Statement smt = con.createStatement();
			String query="Insert into employee values("+ecode+",'"+empName+"','"+empGender+"','"+empGrade+"',"+empSalary+");";
			n= smt.executeUpdate(query);
			if(n>0) {
				System.out.println("Inserted Successfully......");
				showData();
			}
			else {
				System.out.println("Insertion Failed");
			}

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void updateData() {
		int choice=0,n=0,empId,empSalary;
		String empName;
		String empGender = null;
		char empGrade='0';
		Connection con;
		do {
			System.out.println("--------Update------");
			System.out.println("What do you want to update");
			System.out.println("1)Employee Name");
			System.out.println("2)Gender");
			System.out.println("3)Grade");
			System.out.println("4)Salary");
			System.out.println("5)Exit");
			choice=sc.nextInt();
			switch(choice) {
						case 1:System.out.println("Enter Employee ID to Update Name");
						 		empId=sc.nextInt();
						 		System.out.println("Enter Name to Update");
						 		empName=sc.nextLine();
						 		try {
									con=DriverManager.getConnection(mysqlURL,"root","mysql8");
									System.out.println("Connection Esatblished");
									
									Statement smt = con.createStatement();
									String query="update employee set ENAME='"+empName+"' where ECODE="+empId+";";
									n= smt.executeUpdate(query);
									if(n>0) {
										System.out.println("Name Updated Successfully......");
										showData();
									}
									else {
										System.out.println("Updation Failed");
									}
									
								}
								catch(SQLException e) {
									e.printStackTrace();
								}
						 		break;
						 		
						 		
						case 2:try {
								System.out.println("Enter Employee ID to Update Gender");
						 		empId=sc.nextInt();
						 		System.out.println("Enter Gender to Update");
						 		empGender=sc.next();
						 		
									con=DriverManager.getConnection(mysqlURL,"root","mysql8");
									System.out.println("Connection Esatblished");
									
									Statement smt = con.createStatement();
									String query="update employee set GENDER='"+empGender+"' where ECODE="+empId+";";
									n= smt.executeUpdate(query);
									if(n>0) {
										System.out.println("Gender Updated Successfully......");
										showData();
									}
									else {
										System.out.println("Updation Failed");
									}
									
								}
								catch(SQLException e) {
									e.printStackTrace();
								}
						 		break;
						case 3:System.out.println("Enter Employee ID to Update Grade");
						 		empId=sc.nextInt();
						 		System.out.println("Enter Grade to Update");
						 		empGrade=sc.next().charAt(0);
						 		try {
									con=DriverManager.getConnection(mysqlURL,"root","mysql8");
									System.out.println("Connection Esatblished");
									
									Statement smt = con.createStatement();
									String query="update employee set GRADE='"+empGrade+"' where ECODE="+empId+";";
									n= smt.executeUpdate(query);
									if(n>0) {
										System.out.println("Updated Successfully......");
										showData();
									}
									else {
										System.out.println("Updation Failed");
									}
									
								}
								catch(SQLException e) {
									e.printStackTrace();
								}
						 		break;
						case 4:System.out.println("Enter Employee ID to Update Salary");
						 		empId=sc.nextInt();
						 		System.out.println("Enter Salary to Update");
						 		empSalary=sc.nextInt();
						 		try {
									con=DriverManager.getConnection(mysqlURL,"root","mysql8");
									System.out.println("Connection Esatblished");
									
									Statement smt = con.createStatement();
									String query="update employee set GROSS='"+empSalary+"' where ECODE="+empId+";";
									n= smt.executeUpdate(query);
									if(n>0) {
										System.out.println("Updated Successfully......");
										showData();
									}
									else {
										System.out.println("Updation Failed");
									}
									
								}
								catch(SQLException e) {
									e.printStackTrace();
								}
						 		break;
						 
						default:System.out.println("Invalid Input or Return to Main Menu");
			}
		}while(choice!=5);
	}
		
	
	public static void deleteRecord() {
		Connection con;
		System.out.println("Enter Employee Id to Delete Record");
		int empId=sc.nextInt();
		int n=0;
		try {
			con=DriverManager.getConnection(mysqlURL,"root","mysql8");
			System.out.println("Connection Esatblished");
			
			Statement smt = con.createStatement();
			String query="delete from employee where ECODE="+empId+";";
			n= smt.executeUpdate(query);
			if(n>0) {
				System.out.println("Record Deleted Successfully......");
				showData();
			}
			else {
				System.out.println("Deletion Failed");
			}

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do 
		{
			System.out.println("---------------Menu-------------");
			System.out.println("1)Connect to Server");
			System.out.println("2)Show Data");
			System.out.println("3)Insert Data");
			System.out.println("4)Update Data");
			System.out.println("5)Delete");
			System.out.println("6)Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
						case 1:createConnection();
								break;
								
						case 2:showData();
								break;
								
						case 3:insertData();
								break;
								
						case 4:updateData();
								break;
						
						case 5:deleteRecord();
								break;
								
						default:System.out.println("Invalid Input or May select Exit");
			}
		}while(choice!=6);	
	}
}
