/*Java program to find factorial of number */

import java.util.Scanner;

public class factorialOfNumber {
	
	
	static int factOfNum(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num*factOfNum(num-1); 				//Using Recursion;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,fact1 = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to find Factorial");
		num=sc.nextInt();
		
		for(int i = 2;i <= num;i++) {
			fact1 = fact1 * i;
		}
		
		int fact2=factOfNum(num);							//method called
		
		System.out.println("Factorial of "+num+" is "+fact1);			//using for-loop
		System.out.println("----------------------------------------------------");
		System.out.println("Factorial of "+num+" is "+fact2); 			//using method;
	}

}
