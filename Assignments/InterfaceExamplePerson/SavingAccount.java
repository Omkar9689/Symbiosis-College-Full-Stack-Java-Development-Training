package InterfaceExamplePerson;

public class SavingAccount {
	
	Bank bank;
	private double accBalance=0;
	
	public SavingAccount(Bank bank) {
		this.bank=bank;
	}
	
	public SavingAccount(double balance) {
		this.accBalance = balance;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Updtaed Balance : "+accBalance;
	}
}
