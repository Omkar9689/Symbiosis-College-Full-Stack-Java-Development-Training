/*Java program to demonstrate call by value method */

public class callByValue {

	
	public static void callByValueMethod(int n)
	{
		n = n+10;												//copy of variable is created and that copy is updated with  a local scope */ 
		
		//displaying the updated variable(copied)
		System.out.println("Method is called by value , therefore Variable is updated inside the method(temporily) i.e Var = "+n);
	}
	
	public static void main(String[] args) {
		
		int demoVariable = 20;
		
		System.out.println("Valriable initialized in main method i.e Var = "+demoVariable);	//displaying initialized value
		
		System.out.println("-----------------Method called by vaule------------");
		
		callByValueMethod(demoVariable);							///method called by value 
		
		System.out.println("--------------------------------------");
		
		System.out.println("Variable in main method remains same i.e Var = "+demoVariable); // displaying variable after calling method
		
		

	}

}
