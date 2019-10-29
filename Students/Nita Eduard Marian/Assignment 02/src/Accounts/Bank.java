package Accounts;

public class Bank {
	
	private Account[] accountArray = new Account[100];  // is it possible to add elements in 
	private Integer accountLength = 0;					// a dynamic and easy to implement way?
	private Integer dividendValue = 100;
	
	public void update() {
		for(int i = 0; i < accountLength; i++) {
			if(accountArray[i] instanceof SavingsAccount) {
				((SavingsAccount) accountArray[i]).addInterest(); // is there a way of avoiding casting and if/else chain?
			}else
			if(accountArray[i] instanceof CurrentAccount) {
				if(((CurrentAccount) accountArray[i]).checkOverdraft()) {
					System.out.println("Letter sent to account " + (int)accountArray[i].getAccountNumber() +", surpassed overdraft limit");
				}
			}
		}
	}
	
	public void openAccount(Account accountAdded) {
		accountArray[accountLength] = accountAdded;
		accountLength++;
	}
	
	public void closeAccount(Account accountDeleted) {
		int j = 0;
		
		for(int i = 0; i < accountLength; i++) {
			if(accountArray[i].equals(accountDeleted)) {
				j = i;
				break;
			}
		}
		
		for(int i = j; i < accountLength; i++){
			if(accountArray[i + 1] != null) {
				accountArray[i] = accountArray[i + 1];
			}
		}
		
		accountLength--;
	}
	
	public void payDividends() {
		System.out.println("Payed dividends to account in bank");
		for(int i = 0; i < accountLength; i++){
			accountArray[i].deposit(dividendValue);
		}
		
	}
	
}
