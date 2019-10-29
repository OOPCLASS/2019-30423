
public class Bank {
	static int noOfAccounts = 10;
	static int noOfSavingsAccounts = 10;
	static int noOfCurrentAccounts = 10;
	static Account accounts[] = new Account[100];
	static SavingsAccount savingsAccounts[] = new SavingsAccount[100];
	static CurrentAccount currentAccounts[] = new CurrentAccount[100];

	public static void main(String[] args) {

		int i;
		for (i = 0; i <= noOfAccounts; i++) {
			accounts[i] = new Account(i);
			accounts[i].deposit(i * 300 + 1);

			savingsAccounts[i] = new SavingsAccount(i);
			savingsAccounts[i].deposit(i * 400 + 1);

			currentAccounts[i] = new CurrentAccount(i);
			currentAccounts[i].deposit(i * 250 + 1);
			currentAccounts[i].setOverdraft(i * 15 + 1);
		}
		currentAccounts[2].withdraw(200);
		currentAccounts[1].withdraw(500);
		accounts[2].withdraw(-100);
		savingsAccounts[4].deposit(0);
		System.out.println(savingsAccounts[5]);
		update(10);
		System.out.println(savingsAccounts[2].getInterest());
		openAccount(accounts);
		System.out.println(accounts[noOfAccounts].getBalance());
		System.out.println(accounts[10].getBalance());
		closeAccount(accounts, 3);
		openSavingsAccount(savingsAccounts);
		openCurrentAccount(currentAccounts);
		openCurrentAccount(currentAccounts);
		payDividendToAll(275);
	
	}

	public static void update(double interest) {
		int i;
		for (i = 0; i < 10; i++) {
			savingsAccounts[i].setInterest(interest);
			savingsAccounts[i].addInterestToBalance();
		}

		for (i = 0; i < 10; i++) {
			if (currentAccounts[i].getBalance() + currentAccounts[i].getOverdraftLimit() < 0)
				System.out.println("The Current Account with the id: " + i + " is overdraft");
		}
	}

	public static void openAccount(Account v[]) {
		
		if (noOfAccounts + 1 > 100) {
			System.err.println("Maximum number of accounts reached!");
			return;
		}
		noOfAccounts++;
		v[noOfAccounts] = new Account(noOfAccounts);
		v[noOfAccounts].deposit(noOfAccounts * 300 + 1);
	}

	public static void openSavingsAccount(SavingsAccount v[]) {
		
		if (noOfSavingsAccounts + 1 > 100) {
			System.err.println("Maximum number of accounts reached!");
			return;
		}
		noOfSavingsAccounts++;
		v[noOfSavingsAccounts] = new SavingsAccount(noOfSavingsAccounts);
		v[noOfSavingsAccounts].deposit(noOfSavingsAccounts * 300 + 1);
	}
	
	public static void openCurrentAccount(CurrentAccount v[]) {
		
		if (noOfCurrentAccounts + 1 > 100) {
			System.err.println("Maximum number of accounts reached!");
			return;
		}
		noOfCurrentAccounts++;
		v[noOfCurrentAccounts] = new CurrentAccount(noOfCurrentAccounts);
		v[noOfCurrentAccounts].deposit(noOfCurrentAccounts * 300 + 1);
	}


	public static void closeAccount(Account v[], int pos) {
		for (int i = pos; i < noOfAccounts; i++)
			v[i] = v[i + 1];
		noOfAccounts--;
		System.out.println("The Account with the id: " + pos + " has been closed..");
	}
	
	public static void closeSavingsAccount(SavingsAccount v[], int pos) {
		for (int i = pos; i < noOfSavingsAccounts; i++)
			v[i] = v[i + 1];
		noOfSavingsAccounts--;
		System.out.println("The SavingsAccount with the id: " + pos + " has been closed..");
	}
	
	public static void closeCurrentAccount(CurrentAccount v[], int pos) {
		for (int i = pos; i < noOfCurrentAccounts; i++)
			v[i] = v[i + 1];
		noOfCurrentAccounts--;
		System.out.println("The Account with the id: " + pos + " has been closed..");
	}

	public static void payDividendToAll(double dividend) {
		for(int i = 0; i < noOfAccounts; i++) {
			accounts[i].deposit(dividend);
			System.out.print(accounts[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < noOfSavingsAccounts; i++) {
			savingsAccounts[i].deposit(dividend);
			System.out.print(savingsAccounts[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < noOfCurrentAccounts; i++) {
			currentAccounts[i].deposit(dividend);
			System.out.print(currentAccounts[i] + " ");
		}
		System.out.println();
			
	}
}
