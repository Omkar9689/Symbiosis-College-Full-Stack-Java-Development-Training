package InterfaceExamplePerson;

public class BankImplementation implements Bank {

	@Override
	public void deposite(SavingAccount account, double amount) {
		// TODO Auto-generated method stub
		if(account.getAccBalance()+amount>maxBalance) {
			System.out.println("Maximum Balance Exceeds.......Try with less amount");
		}
		else {
			account.setAccBalance(account.getAccBalance()+amount);
			System.out.println("Deposited : "+amount);
			System.out.println(account);
		}
		
	}

	@Override
	public void withdraw(SavingAccount account, double amount) {
		// TODO Auto-generated method stub
		if(amount>maxWithdraw) {
			System.out.println("Withdrawing limit exceeds.....Try with less amount");
		}
		else {
			account.setAccBalance(account.getAccBalance()-amount);
			System.out.println("Withdrawn : "+amount);
			System.out.println(account);

		}
		
	}

}
