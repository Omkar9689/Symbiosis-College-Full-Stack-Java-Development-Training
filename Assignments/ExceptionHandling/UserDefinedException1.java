package ExceptionHandling;

import java.util.*;

class userException extends Exception{
	public userException(String a) {
		// TODO Auto-generated constructor stub
		super(a);
	}
}

public class UserDefinedException1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age");
		
		
		try {
				age=sc.nextInt();
				if(age<0) {
					throw new userException("User Exception");
				}
		}
		
		catch(InputMismatchException e1) {
			System.out.println("Wrong Data Entered");
		}
		
		catch(userException e2) {
			System.out.println(e2.getMessage());
		}
		
		catch(Exception e3) {
			System.out.println(e3);
		}
	}
}
