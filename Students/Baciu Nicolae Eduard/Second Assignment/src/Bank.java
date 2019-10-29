
public class Bank {
	public Account[] accounts;
	public int nrAccounts;
	
	public Bank(int nrAccounts, String typeOfAccount[], int numberOfAccount[]) {
		this.nrAccounts = 0;
		
		accounts = new Account[nrAccounts];
		
		for(int i = 0; i < nrAccounts; i++) {
			createNewAccount(typeOfAccount[i], numberOfAccount[i]);
		}
	}
	
	public void createNewAccount(String typeOfAccount, int numberOfAccount) {
		
		nrAccounts++;
		
		System.out.println(nrAccounts);
		
		Account[] newAccounts = new Account[nrAccounts];
		
		newAccounts = accounts;
		
		for(int i = 0; i < nrAccounts - 1; i++)
			newAccounts[i].print();
		
		if(typeOfAccount == "Current") {
			newAccounts[nrAccounts - 1] = new CurrentAccount(numberOfAccount);
		}
		else if(typeOfAccount == "Savings") {
			newAccounts[nrAccounts - 1] = new SavingsAccount(numberOfAccount);
		}
		else if(typeOfAccount == "Account") {
			newAccounts[nrAccounts - 1] = new Account(numberOfAccount);
		}
		
		accounts = new Account[nrAccounts];
		accounts = newAccounts;
	}
	
	public void closeAccount(int number) {
		int indexToRemove = -1;
		
		for(int i = 0; i < nrAccounts; i++) {
			if(accounts[i].getAccountNumber() == number) {
				indexToRemove = i;
				break;
			}
		}
		
		if(indexToRemove == -1) {
			System.err.println("Account number not found");
		}
		else {
			nrAccounts--;
			Account[] newAccounts = new Account[nrAccounts];
			
			System.arraycopy(accounts, 0, newAccounts, 0, indexToRemove); 
			  
		    System.arraycopy(accounts, indexToRemove + 1, newAccounts, indexToRemove, 
		    		accounts.length - indexToRemove - 1); 
		    
		    accounts = newAccounts;
		}
	}
	
	public void update() {
		for(int i = 0; i < nrAccounts; i++) {
			if(accounts[i] instanceof CurrentAccount) {
				
				CurrentAccount x = (CurrentAccount)accounts[i];
				
				if(x.getOverdraftFlag()) {
					System.out.println("The account " + x.toString() + " is in overdraft");
				}
			}
			if(accounts[i] instanceof SavingsAccount) {
				SavingsAccount x = (SavingsAccount)accounts[i];
				
				x.addInterest();
			}
		}
	}
	
	public void payDivident(double sum) {
		for(int i = 0; i < nrAccounts; i++) {
			accounts[i].deposit(sum);
		}
	}
	
	public void printAccounts() {
		for(int i = 0; i < nrAccounts; i++) {
			accounts[i].print();
		}
	}
}
