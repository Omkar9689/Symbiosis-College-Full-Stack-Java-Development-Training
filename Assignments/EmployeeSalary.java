

import java.util.*;


public class EmployeeSalary {
	
	float basic;
	
	public EmployeeSalary() {
	}

	public EmployeeSalary(float basic) {
		super();
		this.basic = basic;
	}


	public void calculateSalary(float basic) {
		System.out.println("Basic Salary is "+basic);
	};
	
	public void calculateSalary(float basic,float da) {
		System.out.println("Total Salary With Basic + DA = "+(basic+da));
	}
	
	public void calculateSalary(float basic,float da, float ha) {
		System.out.println("Total Salary With Basic + DA + HA = "+(basic+da+ha));
	}
	
	public void calculateSalary(float basic,String awardTitle, float bonus) {
		System.out.println("You got Award :- "+awardTitle);
		System.out.println("Basic :- "+basic);
		System.out.println("Your bonus is :- "+bonus);
		System.out.println("Total Salary :- "+(basic+bonus));
		
	}

	
	
	
	
	public static void main(String args[]) {
	
		float basic;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		EmployeeSalary emp;
		System.out.println("Enter Basic Salary");
		basic = sc.nextFloat();
		
		emp = new EmployeeSalary(basic);
		
		
		do {
			System.out.println("How you want to calculate your salary");
			System.out.println("1)Only Basic");
			System.out.println("2)Basic with DA");
			System.out.println("3)Basic, DA and HA");
			System.out.println("4)Basic,Award and Bonus");
			System.out.println("5)Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:emp.calculateSalary(basic); break;
			
			case 2:emp.calculateSalary(basic,2000); break;
			
			case 3:emp.calculateSalary(basic,2000,4000); break;
			
			case 4:emp.calculateSalary(basic,"Best Empoyee",5000); break;
			
			case 5:System.out.println("Exited, Thank Your!");System.exit(0);
			}
			
		}while(choice<6);
		sc.close();
	
	}
}
