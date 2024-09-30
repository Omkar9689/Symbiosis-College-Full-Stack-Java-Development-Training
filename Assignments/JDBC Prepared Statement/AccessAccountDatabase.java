package JDBCProject3;

import java.sql.*;
import java.util.*;

public class AccessAccountDatabase {
	
	public static Connection con;
	public static Scanner sc = new Scanner(System.in);
	public static PreparedStatement pst;
	
	static {
		con=UtilClass.getConnection();
		if(con!=null) {
			System.out.println("JDBC:Connection is Established");
		}
	}
	public static int validateAccNum(int accNo) {
		
		int n=0;
		try {
			String query="select * from transaction where acc_no="+accNo;
			pst=con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				if(rs.getInt(1)!=0)
				{
					n = 1;
				}
			}
		}
		catch(SQLException e){
			System.out.println("Error....."+e.getMessage());
		}
		if(n==1) {
			return 1;
		}
		else {
			return -1;
		}
		
		
	}
	
	public static void showSpecificRecords() {
		int choice=0;
		do {
			try {
				System.out.println("------------Menu---------");
				System.out.println("1)Display Withdrawal Transaction");
				System.out.println("2)To display transaction before Specific Month");
				System.out.println("3)To display transaction for specific acc_no");
				System.out.println("4)To display transaction less than amount");
				System.out.println("5)To display transaction from Specific location");
				System.out.println("6)Display Min and Max transaction amount");
				System.out.println("7)Display Sum of all transaction amount ");
				System.out.println("Enter choice");
				choice=sc.nextInt();
				switch(choice) {
						case 1:try {
									pst=con.prepareStatement("select * from transaction where tranc_type='Withdraw';");
									ResultSet rs = pst.executeQuery();
									System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
									while(rs.next()) {
										System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"\t|\t"+rs.getString(4)+"\t|\t"+rs.getInt(5)+"\t|\t"+rs.getString(6)+"\t|\t"+rs.getString(7)+"\t|");
										System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
									}
								}
								catch(SQLException e) {
									System.out.println("Error....."+e.getMessage());
								}
								break;
								
						 case 2:int month;
						 		System.out.println("Enter month ( 1 for Jan)");
						 		month=sc.nextInt();
							 	try {
							 		String query="select * from transaction where tranc_date<='2024/"+month+"/30';"; 
									pst=con.prepareStatement(query);
									ResultSet rs = pst.executeQuery();
									System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
									while(rs.next()) {
										System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"\t|\t"+rs.getString(4)+"\t|\t"+rs.getInt(5)+"\t|\t"+rs.getString(6)+"\t|\t"+rs.getString(7)+"\t|");
										System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
									}
								}
								catch(SQLException e) {
									System.out.println("Error....."+e.getMessage());
								}
								break;
								
						 case 3:int acc_no;
						 		System.out.println("Enter month Acc No");
						 		acc_no=sc.nextInt();
						 		if(validateAccNum(acc_no)==1) {
						 			try {
								 		String query="select * from transaction where Acc_No="+acc_no+";"; 
										pst=con.prepareStatement(query);
										ResultSet rs = pst.executeQuery();
										System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
										while(rs.next()) {
											System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"\t|\t"+rs.getString(4)+"\t|\t"+rs.getInt(5)+"\t|\t"+rs.getString(6)+"\t|\t"+rs.getString(7)+"\t|");
											System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
										}
									}
						 			catch(SQLException e) {
										System.out.println("Error....."+e.getMessage());
									}
						 		}else {
						 			System.out.println("Account not Exists");
						 		}	
						 		break;
						 
						 case 4:int tranc_amt;
						 		System.out.println("Enter amount");
						 		tranc_amt=sc.nextInt();
						 		try {
							 		String query="select * from transaction where tranc_amt<"+tranc_amt+";"; 
									pst=con.prepareStatement(query);
									ResultSet rs = pst.executeQuery();
									System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
									while(rs.next()) {
										System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"\t|\t"+rs.getString(4)+"\t|\t"+rs.getInt(5)+"\t|\t"+rs.getString(6)+"\t|\t"+rs.getString(7)+"\t|");
										System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
									}
								}
								catch(SQLException e) {
									System.out.println("Error....."+e.getMessage());
								}
						 		break;
						 		
						 case 5:String holder_addr;
						 		System.out.println("Enter location");
						 		holder_addr=sc.next();
						 		try {
							 		String query="select * from transaction where holders_addrs in ('"+holder_addr+"');"; 
									pst=con.prepareStatement(query);
									ResultSet rs = pst.executeQuery();
									System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
									while(rs.next()) {
										System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getString(2)+"\t|\t"+rs.getString(3)+"\t|\t"+rs.getString(4)+"\t|\t"+rs.getInt(5)+"\t|\t"+rs.getString(6)+"\t|\t"+rs.getString(7)+"\t|");
										System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
									}
								}
								catch(SQLException e) {
									System.out.println("Error....."+e.getMessage());
								}
						 		break;
						 		
						 case 6:try {
							 		String query="select MIN(tranc_amt),MAX(tranc_amt) from transaction ;"; 
									pst=con.prepareStatement(query);
									ResultSet rs = pst.executeQuery();
									System.out.println("--------------------------------------");
									System.out.println("|\t Min \t|\t Max \t|");
									System.out.println("--------------------------------------");
									while(rs.next()) {
										System.out.println("|\t"+rs.getInt(1)+"\t|\t"+rs.getInt(2)+"\t|");
										System.out.println("-------------------------------------------");
									}
								}
								catch(SQLException e) {
									System.out.println("Error....."+e.getMessage());
								}
						 		break;
						 		
						 case 7:try {
							 		String query="select SUM(tranc_amt) from transaction ;"; 
									pst=con.prepareStatement(query);
									ResultSet rs = pst.executeQuery();
									System.out.println("----------------");
									System.out.println("|\tTotal\t|");
									System.out.println("----------------");

									while(rs.next()) {
										System.out.println("|\t"+rs.getInt(1)+"\t|");
										System.out.println("----------------");
									}
								}
								catch(SQLException e) {
									System.out.println("Error....."+e.getMessage());
								}
						 		break;
					 	default:System.out.println("Invalid Input or May Exited");
					 			break;
					}
				
			}catch(InputMismatchException e) {
				System.out.println("Enter number as Input");
				sc.next();
				
			}
		}while(choice!=8);
	}

	public static void main(String args[]) {
		showSpecificRecords();
	}
}


	