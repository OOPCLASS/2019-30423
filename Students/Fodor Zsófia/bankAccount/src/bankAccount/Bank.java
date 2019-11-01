package bankAccount;

public class Bank {
	
	static int nrOfAccounts = 10;
	static Account accounts[] = new Account[20];
	
	private final double dividend = 27.0;
	static int accountIndex = 0;
	
	public void openAccount(int accountType) {
		switch(accountType){
		case 1: 
			accounts[accountIndex++] = new Account(accountIndex - 1);
			break;
		
		case 2:
			accounts[accountIndex++] = new SavingsAccount(accountIndex - 1, 13);
			break;
			
		case 3: 
			accounts[accountIndex++] = new CurrentAccount(accountIndex - 1, 600);
			break;
		}
	}
	
	
	public void closeAccount(int accountNumber) {
		int j = nrOfAccounts;
		for(int i = 0; i < accountIndex; i++) {
			if(accounts[i].getAccountNumber() == accountNumber) {
				j = i;
				break;
			}	
		}
		
		for(int i = j; i < accountIndex; i++) {
			if(accounts[i+1] != null) {
				accounts[i] = accounts[i+1];
			}
		}
		
		if(j != nrOfAccounts) {
			nrOfAccounts--;
		}
		else 
			System.err.println("Account does not exist");
		
	}
	
	public void update() {
		for(int i = 0; i < nrOfAccounts; i++) {
			if(accounts[i] instanceof SavingsAccount) {
				((SavingsAccount) accounts[i]).addInterest();
			}
			else if(accounts[i] instanceof CurrentAccount) {
				if(((CurrentAccount) accounts[i]).checkOverdraft()) {
					System.out.println("Account passed Overdarft limit, email was sent");
				}
				
			}
		}
	}
	
	public void payDividend() {
		for(int i = 0; i < nrOfAccounts; i++)
			accounts[i].deposit(dividend);
		
		System.out.println("Successfully payed dividend for all acounts");
	}
	
	public void print() {
		if (accountIndex == 0)
			System.out.println("No accounts in the bank");
		for (int i = 0; i < accountIndex; i++) {
			accounts[i].print();
		}

	}
	

	public void setOverdraft(int overdraftLimit, Account testedAccount) {
		if (testedAccount instanceof CurrentAccount) {
			((CurrentAccount) testedAccount).setOverdraftLimit(overdraftLimit);
		} 
		else {
			System.out.println("Requested account with number " + (int) testedAccount.getAccountNumber()
					+ " is not a Current account");
		}

	}


	public void setInterest(int interest, Account wantedAccount) {
		if (wantedAccount instanceof SavingsAccount) {
			((SavingsAccount) wantedAccount).setInterest(interest);
		} 
		else {
			System.out.println("Requested account with number " + (int) wantedAccount.getAccountNumber()
					+ " is not a Savings account");
		}
		
	}

	}

