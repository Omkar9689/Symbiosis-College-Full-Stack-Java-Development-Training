package InterfaceExamplePerson;

public interface Bank {
	
	double maxBalance = 150000;
	double maxWithdraw = 25000;
	
	void deposite(double amount);
	void withdraw(double amount);


}
