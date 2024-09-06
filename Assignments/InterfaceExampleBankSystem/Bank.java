package InterfaceExampleBankSystem;

public interface Bank {
	
	double minBalance = 2000;
	double rateOfInterest = 7.5;
	double depositeLimit = 25000;

	void deposite(Account account, double amount);
	void withdrawl(Account account, double amount);
}


