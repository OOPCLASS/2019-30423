package bankAccount;

public class Main {
	public static void main(String[] args) {

		
		final int savingsAccount = 2;
		final int currentAccounts = 3;
		Bank StudBank = new Bank();
		StudBank.print();

		for (int i = 0; i < 10; i++) { // generate a set of accounts
			if (i < 5) {
				StudBank.openAccount(savingsAccount);
			} 
			else {
				StudBank.openAccount(currentAccounts);
			}
		}
		StudBank.print();

		System.out.println("\n");

		for (int i = 0; i < 10; i++) {
			Bank.accounts[i].deposit(16 * (i + 3) + 21);
		}
		

		for (int i = 4; i < 10; i++) {
			StudBank.setOverdraft(i * 12, Bank.accounts[i]);
		}

		for (int i = 0; i < 6; i++) {
			StudBank.setInterest((i + 1) * 12, Bank.accounts[i]);
		}

		StudBank.print();
		System.out.println("\nAfter the specifications of each account were made\n");

		for (int i = 5; i < 10; i++) { // here i needed to change the overdraft to 10 to test
			Bank.accounts[i].withdraw(210); // the update function
			StudBank.setOverdraft(10, Bank.accounts[i]);
		}

		System.out.println("\nAfter update\n");
		StudBank.update();

		StudBank.print();

		StudBank.payDividend();

		for (int i = 5; i < 10; i++) {
			StudBank.closeAccount(i);
		}
		System.out.println("\n after closing half the account \n");
		StudBank.print();

	}
}

