/* Java program to demonstrate array of objects */

import java.util.*;
public class Employee {
	int empId;
	String empName,empAddr;
	public Employee(int empId, String empName, String empAddr) {
		// TODO Auto-generated constructor stub
		this.empId=empId;
		this.empName=empName;
		this.empAddr=empAddr;
	}
	
	public void showData() {
		
		System.out.println("Employee Id :- "+empId);
		System.out.println("Employee Name :- "+empName);
		System.out.println("Employee Address :- "+empAddr);
		System.out.println("------------------||--------------------");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfEmp,empId;
		String empName,empAddr;;
		Employee empList[];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many Employees");
		numOfEmp=sc.nextInt();
		
		empList=new Employee[numOfEmp];
		
		for(int i=0;i<numOfEmp;i++) {
			
			System.out.println("|--------Employee "+(i+1)+"-------|");
			
			System.out.println("Enter Employee Id");
			empId=sc.nextInt();
			
			System.out.println("Enter Employee Name");
			sc.nextLine();
			empName=sc.nextLine();
			
			System.out.println("Enter Employee Address");
			empAddr=sc.nextLine();
			
			empList[i]=new Employee(empId, empName, empAddr);
		}
		
		System.out.println("|-----------------Stored Records-----------------------|");
		
		for(int i=0;i<numOfEmp;i++) {
			
			empList[i].showData();
		}
	}

}
