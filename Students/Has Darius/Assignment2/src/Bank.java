
public class Bank {
	public Account[] account;
	private int index;

	public Bank(int maxNrOfArrays) {
		this.account = new Account[maxNrOfArrays];
		index = 0;
	}
	public int getNrOfAccounts() {
		return index;
	}
	public void updateBank(Integer interest) {
		for (int i = 0; i < 5; i++) {
			if (account[i] instanceof SavingsAccount) {
				((SavingsAccount) account[i]).setInterest(interest);
			}
			if (account[i] instanceof CurrentAccount) {
				if (((CurrentAccount) account[i]).getBalance() == 0) {
					System.out.println("You are in overdraft.");
				}
			}

		}
	}

	public void openAccount(Account account) {
		for (int i = 0; i < index; i++) {
			if (this.account[i].getAccountNumber() == account.getAccountNumber()) {
				System.out.println("This Account already exists");
				return;
			}
		}
		this.account[index++] = account;
	}

	public double closeAccount(int number) {
		int getAccount;
		double newBalance = 0;
		for (int i = 0; i < index; i++) {
			if (account[i].getAccountNumber() == number) {
				newBalance = account[i].getBalance();
				if(newBalance>0) {
					account[i].withdraw(newBalance);
				}
				getAccount = i;
				for (int j = getAccount; j < index - 1; j++) {
					account[j] = account[j + 1];
				}
				index--;
			}

		}
		return newBalance;
	}
	
	public void payDivident(double divident,Account account1,Account account2) {
		account2.deposit(divident);
		account1.withdraw(divident);
	}
	
}