package JDBCAdvance;

import java.sql.*;
import java.util.*;

public class StatementInterfaceDemo {
	static Statement st;
	static Connection cn;
	static Scanner sc = new Scanner(System.in);
	
	static {
		cn=DBUtil.getConnection();
		try {
			st=cn.createStatement();
		}
		catch (SQLException e) {
			System.out.println("Error....."+e.getMessage());
		}
	}
	
	
	public static int validateId(int empid) {
		int n=0;
		try {
			ResultSet rs=st.executeQuery("Select * from employee where ECODE="+empid);
			if(rs.next()) {
				if(rs.getInt(1)!=0)
				{
					n = 1;
				}
			}

		}
		catch(SQLException e) {
			System.out.println("Error......"+e.getMessage());
		}	
		return n;
	}
	public static void showRecords() {
		try {
			
			ResultSet rs = st.executeQuery("Select * from employee;");
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
	
	public static void insertRecord(int ecode,String empName,char empGender,char empGrade,int empSalary) {		
			int n=0;
			try {
				String query="Insert into employee values("+ecode+",'"+empName+"','"+empGender+"','"+empGrade+"',"+empSalary+");";
				n= st.executeUpdate(query);
				if(n>0) {
					System.out.println("Inserted Successfully......");
					showRecords();
				}
				else {
					System.out.println("Insertion Failed");
				}
	
			}
			catch(SQLException e) {
				e.printStackTrace();
			}		
		}
	
	public static void updateRecord(int empId) {
		int choice=0,n=0,empSalary;
		String empName;
		String empGender = null;
		char empGrade='0';
		
		if(validateId(empId)==1) {
			do {
				try {
				System.out.println("--------Update------");
				System.out.println("What do you want to update");
				System.out.println("1)Employee Name");
				System.out.println("2)Gender");
				System.out.println("3)Grade");
				System.out.println("4)Salary");
				System.out.println("5)Exit");
				choice=sc.nextInt();
				switch(choice) {
							case 1: System.out.println("Enter Name to Update");
								empName=sc.nextLine();
								try {									
										String query="update employee set ENAME='"+empName+"' where ECODE="+empId+";";
										n= st.executeUpdate(query);
										if(n>0) {
											System.out.println("Name Updated Successfully......");
											showRecords();
										}
										else {
											System.out.println("Updation Failed or Employee Not Found");
										}
									
								}
								catch(SQLException e) {
									e.printStackTrace();
								}
								break;
							 		
							 		
							case 2:try {
									System.out.println("Enter Gender to Update");
									empGender=sc.next();
									String query="update employee set GENDER='"+empGender+"' where ECODE="+empId+";";
									n= st.executeUpdate(query);
									if(n>0) {
										System.out.println("Gender Updated Successfully......");
										showRecords();
									}
									else {
										System.out.println("Updation Failed");
									}										
								}
								catch(SQLException e) {
									e.printStackTrace();
								}
								break;
						
							case 3:System.out.println("Enter Grade to Update");
							 		empGrade=sc.next().charAt(0);
							 		try {									
										String query="update employee set GRADE='"+empGrade+"' where ECODE="+empId+";";
										n= st.executeUpdate(query);
										if(n>0) {
											System.out.println("Updated Successfully......");
											showRecords();
										}
										else {
											System.out.println("Updation Failed");
										}								
									}
									catch(SQLException e) {
										e.printStackTrace();
									}
							 		break;
							case 4: System.out.println("Enter Salary to Update");
								empSalary=sc.nextInt();
								try {
									String query="update employee set GROSS='"+empSalary+"' where ECODE="+empId+";";
									n= st.executeUpdate(query);
									if(n>0) {
										System.out.println("Updated Successfully......");
										showRecords();
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
				}catch(InputMismatchException e) {
					System.out.println("Enter Proper Input");
					sc.next();
				}
			}while(choice!=5);
		}
		else {
			System.out.println("Employee Does not Exists");
		}
	}
		
	public static void deleteRecord(int empId) {
		
		if(validateId(empId)==1) {
			int n=0;
			try {		
				String query="delete from employee where ECODE="+empId+";";
				n= st.executeUpdate(query);
				if(n>0) {
					System.out.println("Record Deleted Successfully......");
					showRecords();
				}
				else {
					System.out.println("Deletion Failed");
				}
	
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Employee Does not Exists");	
		}
	}
	
	public static void closeConnection() {
		try {
			cn.close();
			st.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			try {
			System.out.println("---------------Menu-------------");
			System.out.println("1)Show Data");
			System.out.println("2)Insert Data");
			System.out.println("3)Update Data");
			System.out.println("4)Delete");
			System.out.println("5)Close Connection and Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
								
						case 1:showRecords();
								break;
								
						case 2:	System.out.println("Enter Data...");
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
								insertRecord(ecode, empName, empGender, empGrade, empSalary);								
								break;
								
						case 3:System.out.println("Enter Employee Id to Update Data");
								int eCode=sc.nextInt();
								updateRecord(eCode);
								break;
						
						case 4:System.out.println("Enter Employee Id to Delete Record");
								int Ecode=sc.nextInt();
								deleteRecord(Ecode);
								
								break;
								
						case 5:closeConnection();
								System.out.println("Connection Closed and Exited");
								System.exit(0);
								break;
								
						default:System.out.println("Invalid Input");
			}
			}catch(InputMismatchException e) {
				System.out.println("Enter Choice as Interger");
				sc.next();
			}
		}while(choice!=5);	
	}
}
