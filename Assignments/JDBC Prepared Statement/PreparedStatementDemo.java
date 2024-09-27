package JDBCProject2;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import JDBCAdvance.DBUtil;

public class PreparedStatementDemo {

	//static Statement st;
	static Connection cn;
	static Scanner sc = new Scanner(System.in);
	static PreparedStatement pst;
	
	static {
			cn=DBUtil2.getConnection();
			if(cn!=null) {
				System.out.println("JDBC:Connection is Established");
			}
	}
	
	public static int validateId(int v_id) {
		int n=0;
		try {
			String query="Select * from visitor where v_id="+v_id;
			pst=cn.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
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
			pst=cn.prepareStatement("Select * from visitor;");
			ResultSet rs = pst.executeQuery();
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
	
	
	public static void insertRecord(int vId,String v_Name,String v_Gender,String v_ComeFrom,int amt_Paid) {		
		int n=0;
		try {
			//String query="Insert into employee values("+v_Id+",'"+v_Name+"','"+v_Gender+"','"+v_comeFrom+"',"+amt_paid+");";
			pst=cn.prepareStatement("insert into visitor values(?,?,?,?,?)");
			pst.setInt(1, vId);
			pst.setString(2, v_Name);
			pst.setString(3, v_Gender);
			pst.setString(4, v_ComeFrom);
			pst.setInt(5, amt_Paid);
			n=pst.executeUpdate();
			if(n>0) {
				System.out.println("Inserted Successfully......");
				showRecords();
			}
			else {
				System.out.println("Insertion Failed");
			}

		}
		catch(SQLException e) {
			System.out.println("Error....."+e.getMessage());;
		}		
	}
	
	public static void updateRecord(int v_Id) {
		int choice=0,n=0,amt_paid;
		String v_Name;
		String v_Gender = null;
		String v_comeFrom;
		
		if(validateId(v_Id)==1) {
			do {
				try {
				System.out.println("--------Update------");
				System.out.println("What do you want to update");
				System.out.println("1)Visitor Name");
				System.out.println("2)Gender");
				System.out.println("3)Visitor Comming From");
				System.out.println("4)Amount Paid");
				System.out.println("5)Exit");
				choice=sc.nextInt();
				switch(choice) {
							case 1:
							 		System.out.println("Enter Name to Update");
							 		v_Name=sc.nextLine();
							 		try {									
											String query="update visitor set v_name='"+v_Name+"' where v_id="+v_Id+";";
											pst=cn.prepareStatement(query);
											n= pst.executeUpdate(query);
											if(n>0) {
												System.out.println("Name Updated Successfully......");
												showRecords();
											}
											else {
												System.out.println("Updation Failed or Visiotor Not Found");
											}
										
									}
									catch(SQLException e) {
										e.printStackTrace();
									}
							 		break;
							 		
							 		
							case 2:try {
										
								 		System.out.println("Enter Gender to Update");
								 		v_Gender=sc.next();
										String query="update visitor set v_GENDER='"+v_Gender+"' where v_id="+v_Id+";";
										pst=cn.prepareStatement(query);
										n= pst.executeUpdate(query);
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
							case 3:System.out.println("Enter Place from where Visitor is Comming From to Update");
							 		v_comeFrom=sc.next();
							 		try {									
											String query="update visitor set GRADE='"+v_comeFrom+"' where v_id="+v_Id+";";
											pst=cn.prepareStatement(query);
											n= pst.executeUpdate(query);
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
							case 4:System.out.println("Enter Amount paid to Update");
							 		amt_paid=sc.nextInt();
							 		try {
										String query="update employee set GROSS='"+amt_paid+"' where v_id="+v_Id+";";
										pst=cn.prepareStatement(query);
										n= pst.executeUpdate(query);
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
		
	public static void deleteRecord(int v_Id) {
		
		if(validateId(v_Id)==1) {
			int n=0;
			try {		
				String query="delete from visitor where v_id="+v_Id+";";
				pst=cn.prepareStatement(query);
				n= pst.executeUpdate(query);
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
			System.out.println("Visitor Does not Exists");	
		}
	}
	
	public static void closeConnection() {
		try {
			cn.close();
			pst.close();
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
								System.out.println("Enter Visitor ID");
								int v_Id=sc.nextInt();
								System.out.println("Enter Visitor Name");
								String v_Name=sc.next();
								System.out.println("Enter Visitor Gender (M/F)");
								String v_Gender=sc.next();
								System.out.println("Enter Visitor Grade ");
								String v_comeFrom=sc.next();
								System.out.println("Enter Visitor Salary");
								int amt_paid=sc.nextInt();								
								insertRecord(v_Id, v_Name, v_Gender, v_comeFrom, amt_paid);								
								break;
								
						case 3:System.out.println("Enter Employee Id to Update Data");
								int vId=sc.nextInt();
								updateRecord(vId);
								break;
						
						case 4:System.out.println("Enter Employee Id to Delete Record");
								int vid=sc.nextInt();
								deleteRecord(vid);
								
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
		sc.close();
	}
}

