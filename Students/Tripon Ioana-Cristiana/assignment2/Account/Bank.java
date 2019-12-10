package Account;

public class Bank {
	
	public Account[] bankAccounts = new Account[10];
	
	public int getMaximumAccountNumberUsed (Account[] bankAccounts, int size) {
		
		int max = 0;
		for (int i = 0; i < size; i++) {
			if (bankAccounts[i].getAccountNumber() > max) {
				max = bankAccounts[i].getAccountNumber();
			}
		}
		return max;
	}
	
	public Account openAccount(int size, String accountType) {
		
		int newAccountNumber = getMaximumAccountNumberUsed(bankAccounts, size) + 1;
		//size++;
		switch(accountType) {
		  case "Savings": 
			bankAccounts[size] = new SavingsAccount(newAccountNumber);
		    break;
		  case "Current":
			bankAccounts[size] = new CurrentAccount(newAccountNumber);
		    break;
		  case "Regular":
			bankAccounts[size] = new Account(newAccountNumber);
			break;
		  default:
			  System.err.println("Account.openAccount(...): invalid account type.");
		}
		return bankAccounts[size];
	}
	
	public void closeAccount(int accountNumber) {
		
		for (int i = 0; i < bankAccounts.length-1; i++) {
			if (bankAccounts[i].number == accountNumber) {			// since some accounts may have already been deleted,
				for (int j = i; j < bankAccounts.length-1; j++) {	// it's possible that the index will no longer correspond
					bankAccounts[j] = bankAccounts[j+1];			// to the number set when the account was opened
				}
				break;
			}
		}
	}

	public void payDividend( int size, double dividend) {
		
		for (int i = 0; i < size; i++) {
				bankAccounts[i].deposit(dividend);
		}
	}
	
	public void updateAccount (int accountNumber, int size, double sumToBeAdded) {
		
		for (int i = 0; i < size; i++) {
			if (bankAccounts[i].getAccountNumber() == accountNumber) {	
				if (bankAccounts[i] instanceof SavingsAccount)
				{
					((SavingsAccount) bankAccounts[i]).addInterest(sumToBeAdded);
				}
				else {
					if (bankAccounts[i] instanceof CurrentAccount)
					{
						if (-bankAccounts[i].getBalance() > ((CurrentAccount) bankAccounts[i]).getOverdraftLimit())
						{
							System.out.println("The account " + bankAccounts[i].getAccountNumber() + " is in overdraft.\n");
						}
						else
						{
							System.out.println("The account " + bankAccounts[i].getAccountNumber() + " is not in overdraft.\n");
						}
					}
				}
			}
		}
	}
	
	public void printAllAccounts(int size)
	{
		for (int i = 0; i < size; i++)
		{
			bankAccounts[i].print();
		}
	}

	
}
