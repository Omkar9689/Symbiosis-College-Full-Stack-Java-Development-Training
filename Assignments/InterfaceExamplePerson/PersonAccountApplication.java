package InterfaceExamplePerson;

//import java.util.*;

public class PersonAccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new BankImplementation();
		Person per;
		per = new Person("Omkar", "Nashik", bank, 25000);
		
		System.out.println(per);
		System.out.println("----------------------------------");

		
		per.deposite(500);
		System.out.println(per);
		System.out.println("----------------------------------");
		
		per.withdraw(1000);
		System.out.println(per);

	}

}
