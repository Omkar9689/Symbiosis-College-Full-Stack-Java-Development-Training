package InterfaceExamplePerson;

public class SavingAccount extends Person implements Bank {
	
	
	private long accNo;
	private double accBalance=0;
	
	public SavingAccount(String perName,String city,long accNo,double accBlance) {
		super(perName,city);
		this.accNo = accNo;
		this.accBalance= accBlance;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	@Override
	public String toString() {
		
		return super.toString()+"Account Number : "+accNo+", Updated Balance : "+accBalance+" rs";
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
			if(amount>accBalance) {
				System.out.println("Insufficient Balance");
				
			}
			else {
			accBalance=accBalance-amount;
			System.out.println("Successfully Withdrawn : "+amount+" rs");
			System.out.println(toString());
			}

		}
	}
}
