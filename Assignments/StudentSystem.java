import java.util.*;

public class StudentSystem {
	
	private String studUserName,studPass;
	private static int studId;
	
	
	static {
		System.out.println("Welcome to the Students Record System");
		studId=1500;
	}
	
	
	public StudentSystem(String studUserName,String studPass){
		this.studUserName=studUserName;
		this.studPass=studPass;
		studId++;
		System.out.println("Welcome to the Students Record System: Your Student ID is :- "+studId);
	}
	

	public static void main(String[] args) {
		
		String studUserName,studPass,choice;
		int i=0;
		
		StudentSystem[] studIdRecord = new StudentSystem[999];
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Do you want to add more students (yes/no)");
			choice=sc.nextLine();
			if(choice.equals("yes")) {
				
				System.out.println("Enter your Username");
				studUserName=sc.nextLine();
				System.out.println("Enter your Password");
				studPass=sc.nextLine();
				
				if(studUserName.equals(studPass)) {
					studIdRecord[i]= new StudentSystem(studUserName,studPass);
					i=i+1;
				}
				else {
					System.out.println("Invalid username or password");
				}
			}
			else if(choice.equals("no")) {
				System.out.println("Exited. Thank You!");
			}
			else {
				System.out.println("Invaid Choice");
			}
			
		}while(choice.equals("yes"));

	}

}
