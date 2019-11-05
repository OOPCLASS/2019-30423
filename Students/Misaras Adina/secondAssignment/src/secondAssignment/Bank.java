package secondAssignment;

public class Bank {

	private Account[] bank= new Account[1000];
	private int accountIndex;

	public Bank() {
		accountIndex = 0;
	}

	public void openAccount(Account account) {
		bank[accountIndex]=account;
		accountIndex++;
		
	}

	public void deleteAccount(Account account) {
		int position = accountIndex + 1;
		for (int i = 0; i < accountIndex; i++) {
			if (bank[i].equals(account))
				position = i;
		}
		if (accountIndex + 1 != position) {
			for (int i = position; i < accountIndex - 1; i++)
				bank[i] = bank[i + 1];
			accountIndex--;
		} else
			System.out.println("No such account");
	}

	public void update() {
		for (int i = 0; i < accountIndex; i++) {
			if (bank[i] instanceof SavingsAccount)
				((SavingsAccount) bank[i]).addInterest();
			if (bank[i] instanceof CurrentAccount)
				if (((CurrentAccount) bank[i]).getBalance() < ((CurrentAccount) bank[i]).getOverdraftLimit())
					System.out.println("Account " + bank[i].getAccountNumber() + " is in overdraft");
		}
	}

	public void payDividend(double sum) {
		sum = sum / accountIndex;
		for (int i = 0; i < accountIndex; i++)
			bank[i].deposit(sum);
	}

	public void print() {
		for (int i = 0; i < accountIndex; i++) {
			if (bank[i] instanceof SavingsAccount)
				System.out.println(((SavingsAccount) bank[i]).toString());
			else
			if (bank[i] instanceof CurrentAccount)
				System.out.println(((CurrentAccount) bank[i]).toString());
			else
				System.out.println(bank[i].toString());
		}
	}
}
