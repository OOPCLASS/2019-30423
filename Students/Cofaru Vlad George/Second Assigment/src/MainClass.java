
public class MainClass {

	public static void main(String[] args) {

		/// I would like to ask a question , if i have an array account int the bank
		/// class
		// how can i typecast that array to use the fuctions that are not in the
		/// superclass
		// eg : how can i use the setOerdraft function on an member of Bank.account[i]
		final int ACCOUNT = 1;
		final int SAVING = 2;
		final int CURRENT = 3;

	

		Bank StudBank = new Bank();
		StudBank.print();

		for (int i = 0; i < 10; i++) { // generate a set of accounts
			if (i < 5) {
				StudBank.openAccount(SAVING);
			} else {
				StudBank.openAccount(CURRENT);
			}
		}
		StudBank.print();

		System.out.println("\n");

		for (int i = 0; i < 10; i++) {
			StudBank.accounts[i].deposit(16 * (i + 3) + 21);

		}

		for (int i = 4; i < 10; i++) {
			StudBank.setOverdraft(i * 12, StudBank.accounts[i]);
		}

		for (int i = 0; i < 6; i++) {
			StudBank.setInteres((i + 1) * 12, StudBank.accounts[i]);
		}

		StudBank.print();
		System.out.println("\nAfter the specifications of each account were made\n");

		for (int i = 5; i < 10; i++) { // here i needed to change the overdraft to 10 to test
			StudBank.accounts[i].withdraw(210); // the update function
			StudBank.setOverdraft(10, StudBank.accounts[i]);
		}

		System.out.println("\nAfter update\n");
		StudBank.update();

		StudBank.print();

		StudBank.payDividends();

		for (int i = 5; i < 10; i++) {
			StudBank.closeAccount(i);
		}
		System.out.println("\n after closing half the account \n");
		StudBank.print();

	}

}
