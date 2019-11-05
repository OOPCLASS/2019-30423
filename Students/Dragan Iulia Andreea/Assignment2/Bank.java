package assignment2;

public class Bank {
	
	Account[] accounts = new Account[100]; 
	int numberAccounts = 0;
	private double dividend = 50.0;
	
	public void update() {
		for(int i=0; i < numberAccounts; i++) {
			if(accounts[i] instanceof SavingsAccount) {
				((SavingsAccount) accounts[i]).addInterest();
			}
			else if(accounts[i] instanceof CurrentAccount) {
				if(((CurrentAccount) accounts[i]).checkOverdraft() == true) {
					System.out.println("Account " + i + " is currently in overdraft");
				}
			}
		}
	}
	
	public void openAccount(String accountType) {
		switch (accountType) {
		case "Normal":
			System.out.println("Opened account " + numberAccounts);
			accounts[numberAccounts] = new Account(numberAccounts++);
			break;
		case "Savings":
			System.out.println("Opened savings account " + numberAccounts);
			accounts[numberAccounts] = new SavingsAccount(numberAccounts++);
			break;
		case "Current":
			System.out.println("Opened current account " + numberAccounts);
			accounts[numberAccounts] = new CurrentAccount(numberAccounts++);
			break;
		default:
			System.out.println("Account type not valid");
		}
	}

	public void closeAccount(double number) {
		for(int i = (int)number; i < numberAccounts; i++) {
			accounts[i] = accounts[i+1];
		}
		numberAccounts--;
	}
	
	public void payDividend() {
		for(int i = 0; i < numberAccounts; i++) {
			accounts[i].deposit(dividend);
		}
	}
	
}
