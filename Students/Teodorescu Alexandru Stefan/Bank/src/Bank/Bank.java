package Bank;

public class Bank {
	
	private int accountIndex = 0;
	
	Account[] accounts = new Account[100];
	SavingsAccount[] savingsAccounts = new SavingsAccount[100];
	CurrentAccount[] currentAccounts = new CurrentAccount[100];
	
	public void createAccount(int type, int number, int attribute) {
		
		if(type == 0) {
			
			Account acc = new Account(accountIndex);
			accounts[accountIndex++] = acc;
		}
		if(type == 1) {
			
			SavingsAccount acc = new SavingsAccount(100 + accountIndex, attribute);
			savingsAccounts[accountIndex++] = acc;
		}
		if(type == 2) {
			
			CurrentAccount acc = new CurrentAccount(200 + accountIndex, attribute);
			currentAccounts[accountIndex++] = acc;
		}
	}
	
	public void update() {
		
		for(int i = 0; i < savingsAccounts.length ; i++) {
			if(savingsAccounts[i] != null) {
				
				savingsAccounts[i].addInterest();
			}	
		}
		for(int i = 0; i < currentAccounts.length; i++) {
			if(currentAccounts[i] != null) {
				
				currentAccounts[i].overDraft();
			}	
		}
	}
	
	public void payDividend(int number, int sum) {
		
		if(number >= 200) {
			
			currentAccounts[number - 200].deposit(sum);
		}
		if(number >= 100 && number < 200) {
			
			currentAccounts[number - 100].deposit(sum);
		}
		if(number < 100) {
			
			currentAccounts[number].deposit(sum);
		}
	}
	
}
