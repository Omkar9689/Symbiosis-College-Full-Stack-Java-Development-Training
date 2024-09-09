package InterfaceExample;

import java.util.*;

public class PersonAccountApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		Scanner sc = new Scanner(System.in);
		Bank bank = new SavingAccount();
		SavingAccount savingAccount = new SavingAccount();
		
		System.out.println("Welcome to our Banking System");
		System.out.println("Enter Your Name");
		String name =sc.nextLine();
		
		System.out.println("Enter your city ");
		String city = sc.nextLine();
		
		System.out.println("Enter your account Number");
		int accNumber= sc.nextInt();
		
		savingAccount = new SavingAccount(name, city, bank, accNumber);
		
		System.out.println("Congratulations!!!, Account Created Successfully");
		do
		{
			System.out.println("---------Main Menu----------");
			System.out.println("1)Check Account Number ");
			System.out.println("2)Check Balance");
			System.out.println("3)Deposite");
			System.out.println("4)Withdraw");
			System.out.println("5)Get all information");
			System.out.println("6)Update Information");
			System.out.println("7)Exit");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:System.out.println("Account Number : "+savingAccount.getAccNumber());
				break;
				
			case 2:System.out.println("Acccount Balance : "+savingAccount.getAccBalance());
				break;
				
			case 3:System.out.println("Enter amount to Deposite");
				int amount = sc.nextInt();
				savingAccount.deposit(amount);
				break;
			
			case 4:System.out.println("Enter amount to Withdraw");
				int amount1 = sc.nextInt();
				savingAccount.withdraw(amount1);
				break;
					
			case 5:System.out.println(savingAccount);
					break;	
			
			case 6:do {
					System.out.println("\nWhat information you want to update");
					System.out.println("1)Name");
					System.out.println("2)City");
					System.out.println("3)Account Number ");
					System.out.println("4)Back to Main Menu");
					System.out.println("Enter your choice");
					choice = sc.nextInt();
					switch(choice) {
					case 1:System.out.println("Enter Name to Update");
							sc.nextLine();
						String updateName = sc.nextLine();
						savingAccount.setName(updateName);
						System.out.println("Updated SuccessFully");
						System.out.println(savingAccount);
						break;
						
					case 2:System.out.println("Enter City to Update");
						sc.nextLine();
						String updateCity = sc.nextLine();
						savingAccount.setCity(updateCity);
						System.out.println("Updated SuccessFully");
						System.out.println(savingAccount);
						break;
					
					case 3:System.out.println("Enter Account Number to Update");
						int updateAccountNumber = sc.nextInt();
						savingAccount.setAccNumber(accNumber);
						System.out.println("Updated SuccessFully");
						System.out.println(savingAccount);
						break;
	
					default:System.out.println("Invalid Choice or Retruned to Main Menu");
						break;					
					}
				}while(choice!=4);
				break;
				
				
			default:System.out.println("Invalid choice or May Select Exit");
					System.exit(0);
			
			}
		}while(choice<8);
		sc.close();
	}
}
