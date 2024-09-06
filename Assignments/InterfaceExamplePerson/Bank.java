package InterfaceExamplePerson;

public interface Bank {
	
	double maxBalance = 150000;
	double maxWithdraw = 25000;
	
	void deposite(SavingAccount account, double amount);
	void withdraw(SavingAccount account, double amount);


}
