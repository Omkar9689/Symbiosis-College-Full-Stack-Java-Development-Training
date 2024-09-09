package InterfaceExamplePerson;

//import java.util.*;

public class PersonAccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SavingAccount sc;
		sc = new SavingAccount("Omkar", "Nashik", 25000);
		
		System.out.println(sc);
		System.out.println("----------------------------------");

		
		sc.deposite(25000);
		System.out.println("----------------------------------");
		
		sc.withdraw(25000);
	}

}
