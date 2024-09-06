package InterfaceExampleBankSystem;


public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new BankImpIementation();
		
		Account account = new Account(52124561,"Omkar",50000,bank);
		
		account.deposite(1000);
		System.out.println(account);
		System.out.println();
		System.out.println("After Withdrawl");
		account.withdrawl(2000);
		System.out.println();
		
		System.out.println(account);
	}
}
