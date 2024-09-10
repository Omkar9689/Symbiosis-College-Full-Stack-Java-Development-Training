package ExceptionHandling;

import java.util.Scanner;

class invalidCountryException extends Exception{
	public invalidCountryException(String a) {
		// TODO Auto-generated constructor stub
		super(a);
	}
}

public class UserDefinedException2 {
	
	public void registerUser(String countryName) throws invalidCountry{
		if(!countryName.toLowerCase().equals("india")) {
			throw new invalidCountry("NRI's not Allowed");
		}
		else{
			System.out.println("Successfull!!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String countryName;
		Scanner sc = new Scanner(System.in);
		UserDefinedException2 e = new UserDefinedException2();
		
		System.out.println("Enter name of Country");
		
		try {
			countryName = sc.nextLine();
			e.registerUser(countryName);
		}
		catch(invalidCountry e1){
			System.out.println(e1.getMessage());
		}
	}
}
