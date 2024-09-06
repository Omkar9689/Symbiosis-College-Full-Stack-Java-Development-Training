package InterfaceExampleBankSystem;

public class BankImpIementation implements Bank {
	
	@Override
	public void deposite(Account account, double amount) {
		// TODO Auto-generated method stub
		if(amount>depositeLimit) {
			System.out.println("Deposite Limit Exceeds");
		}
		else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("Deposited : "+amount+" rs In Account "+account.getAccno()+", Updated Balance :- "+account.getBalance());
		}
		
	}

	@Override
	public void withdrawl(Account account, double amount) {
		// TODO Auto-generated method stub
		if(account.getBalance()-amount>=minBalance) {
			account.setBalance(account.getBalance()-amount);
			System.out.println("Withdrawl : "+amount+" , From Account No. :- "+account.getAccno()+" Updated Balance :- "+account.getBalance());
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}

}
