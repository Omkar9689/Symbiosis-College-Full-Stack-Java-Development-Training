package InterfaceExamplePerson;

public class PersonAccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SavingAccount sc;
		sc = new SavingAccount("Omkar", "Nashik",542458794, 5000);
		
		System.out.println(sc);
		System.out.println("----------------------------------");

		
		sc.deposite(1000);
		System.out.println("----------------------------------");
		
		sc.withdraw(600);
	}

}
