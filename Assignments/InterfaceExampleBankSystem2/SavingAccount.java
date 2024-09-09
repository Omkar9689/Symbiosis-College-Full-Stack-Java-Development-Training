package InterfaceExamplePerson;

public class SavingAccount extends Person implements Bank {
	
	//private String perName,city;
	private double accBalance=0;
	
	public SavingAccount(String perName,String city,double accBlance) {
		super(perName,city);
		this.accBalance= accBlance;
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
		
		return super.toString()+"Updated Balance : "+accBalance+" rs";
	}
	
	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		if(accBalance+amount>maxBalance) {
			System.out.println("Maximum Balance Exceeds.......Try with amount less than or equal to "+(maxBalance-accBalance));
		}
		else {
			accBalance=accBalance+amount;
			System.out.println("Successfully Depoisted : "+amount+ " rs");
			System.out.println(toString());
		}
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>maxWithdraw) {
			System.out.println("Withdrawing limit exceeds.....Try with amount less than or equal to "+maxWithdraw);
		}
		else {
			accBalance=accBalance-amount;
			System.out.println("Successfully Withdrawn : "+amount+" rs");
			System.out.println(toString());

		}
	}
}
