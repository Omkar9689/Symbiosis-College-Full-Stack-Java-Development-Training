package InterfaceExamplePerson;

public class Person {

	private String perName,city;
	private Bank bank;
	
	SavingAccount account = new SavingAccount(bank);

	public Person() {};
	
	public Person(String perName, String city ,Bank bank,double balance) {
		//super();
		this.perName = perName;
		this.city = city;
		this.bank = bank;
		this.account.setAccBalance(balance);
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void deposite(double amount) {
		bank.deposite(account, amount);
		
	}
	
	public void withdraw(double amount) {
		bank.withdraw(account, amount);

		
	}

	@Override
	public String toString() {
		return "Person Name : " + perName + ", City : " + city+", Account Balance : "+account.getAccBalance();
	}
	
	
	
	
}
