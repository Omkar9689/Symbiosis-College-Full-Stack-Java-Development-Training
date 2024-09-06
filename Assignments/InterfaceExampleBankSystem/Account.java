package InterfaceExampleBankSystem;

public class Account{
	
	private int accno;
	private String custName;
	private double balance;
	
	private Bank bank;					//has a relationship with bank i.e bank has accounts
	
	public Account() {};

	public Account(int accno, String custName, double balance, Bank bank) {
		super();
		this.accno = accno;
		this.custName = custName;
		this.balance = balance;
		this.bank = bank;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	
	@Override
	public String toString() {
		return "Account No : " + accno + ", Account Holder : " + custName + ", Balance : " + balance;
	}
	
	public void deposite(double amount) {
		bank.deposite(this, amount);
		
	}

	public void withdrawl(double amount) {
		bank.withdrawl(this, amount);
	}
}
