import java.util.*;
public class ArithmaticOperationsMenuDriven {

	public static void main(String[] args) { 			//main method
		
		int num_1,num_2;
		char choice;							// declaring variables
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:-\t"); 	//getting first number from user
		num_1=sc.nextInt();
		
		System.out.println("Enter second number:-\t"); 	//getting second number from user
		num_2=sc.nextInt();	
		
		do												// loop started (do-while)
		{
			System.out.println("MENU");					//Menu to select 
			System.out.println("1.Addition (+)");
			System.out.println("2.Subtraction (-)");
			System.out.println("3.Multiplication (*)");
			System.out.println("4.Division (/)");
			System.out.println("5.Exit ($)");
			System.out.println("Enter your Choice");
			choice=sc.next().charAt(0);						//getting choice
			
			switch(choice)
			{
					case '+':System.out.println("Sum of "+num_1+" and "+num_2+" is "+(num_1+num_2)); //print sum
							break;
							
					case '-':System.out.println("Subtraction of "+num_1+" and "+num_2+" is "+(num_1-num_2));	//print subtraction
							break;
							
					case '*':System.out.println("Multiplication of "+num_1+" and "+num_2+" is "+(num_1*num_2)); //print multiplication
							break;
						
					case '/':System.out.println("Division of "+num_1+" and "+num_2+" is "+(num_1/num_2));		//print division
							break;
					
					default:System.out.println("Invalid Choice or May Select Exit");
							break;
				
			}
		}while(choice!='$');							//terminating loop (do-while)
		
	}

}
