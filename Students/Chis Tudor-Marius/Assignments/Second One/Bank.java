package com.accounts;

public class Bank {

	static int nrOfAccounts = 15;
	static Account account[] = new Account[100];

	public Bank() {
		for (int i = 1; i <= 5; i++) {
			account[i] = new Account(i);
			account[i].deposit(500);
		}
		for (int i = 6; i <= 10; i++) {
			account[i] = new SavingsAccount(i);
			account[i].deposit(500);
		}
		for (int i = 11; i <= 15; i++) {
			account[i] = new CurrentAccount(i);
			account[i].deposit(500);
		}
	}

	public static void update(double newInterest) {

		for (int i = 1; i <= nrOfAccounts; i++) {
			if (account[i] instanceof SavingsAccount) {
				((SavingsAccount) account[i]).setInterest(newInterest);
			} else if (account[i] instanceof CurrentAccount) {
				if (account[i].getBalance() + ((CurrentAccount) account[i]).getOverdraft() < 0) {
					System.err.println("Overdraft limit excedeed for " + i + "\n");
				}
			}
		}
	}

	public static void openAccount(int select) {
		if (select == 1) {
			nrOfAccounts++;
			account[nrOfAccounts] = new Account(nrOfAccounts);
			account[nrOfAccounts].deposit(500);
		} else if (select == 2) {
			nrOfAccounts++;
			account[nrOfAccounts] = new SavingsAccount(nrOfAccounts);
			account[nrOfAccounts].deposit(500);
		} else if (select == 3) {
			nrOfAccounts++;
			account[nrOfAccounts] = new CurrentAccount(nrOfAccounts);
			account[nrOfAccounts].deposit(500);
		}

	}
	//i don't really understand how this one should work
	public static void closeAccount(int accountNumber) {

		for (int i = accountNumber; i > 1; i--) {
			account[i] = account[i - 1];
		}

	}

	public static void payDividentAccount(int divident) {

		for (int i = 1; i <= nrOfAccounts; i++) {
			account[i].deposit(divident);
		}

	}

}
