
public class Bank {

	protected int lastAccount = 0;
	private final int DIVIENT_VALUE = 73;
	private final int UNCHANGED = 200;
	Account[] accounts = new Account[100];

	public void openAccount(int accType) {
		switch (accType) {
		case 1:
			accounts[lastAccount++] = new Account(lastAccount - 1);
			break;
		case 2:
			accounts[lastAccount++] = new SavingsAccount(lastAccount - 1, 20);
			break;
		case 3:
			accounts[lastAccount++] = new CurrentAccount(lastAccount - 1);
			break;
		}
	}

	public void update() {

		for (int i = 0; i < lastAccount; i++) {
			if (accounts[i] instanceof SavingsAccount) {
				((SavingsAccount) accounts[i]).addInteres();
			} else if (accounts[i] instanceof CurrentAccount)
				if (((CurrentAccount) accounts[i]).checkOverdraft()) {
					System.out.println(
							"Letter sent to  account" + accounts[i].getAccountNumber() + ",surpassed overdraft limit");
				}

		}
	}

	public void print() {
		if (lastAccount == 0)
			System.out.println("Currently no accounts in the bank");
		for (int i = 0; i < lastAccount; i++) {
			accounts[i].print();
		}

	}

	public void payDividends() {
		System.out.println("\n The bank has payed the dividents \n");
		for (int i = 0; i < lastAccount; i++) {
			accounts[i].deposit(DIVIENT_VALUE);
		}
	}

	public void closeAccount(int AccountNumber) {
		int j = UNCHANGED;
		for (int i = 0; i < lastAccount; i++) {
			if (accounts[i].getAccountNumber() == AccountNumber) {
				j = i;
				break;
			}

		}

		for (int i = j; i < lastAccount; i++) {
			if (accounts[i + 1] != null) {
				accounts[i] = accounts[i + 1];
			}
		}

		if (j != UNCHANGED) {
			lastAccount--;
		} else {
			System.err.println("Account not it our database");
		}

	}

	public void setInteres(double interes, Account wantedAccount) {
		if (wantedAccount instanceof SavingsAccount) {
			((SavingsAccount) wantedAccount).setInteres(interes);
		} else {
			System.out.println("Requested account with number " + (int) wantedAccount.getAccountNumber()
					+ " is not a Savings account");
		}
	}

	public void setOverdraft(int overdraft, Account WantedAccount) {
		if (WantedAccount instanceof CurrentAccount) {
			((CurrentAccount) WantedAccount).setOverdraft(overdraft);
		} else {
			System.out.println("Requested account with number " + (int) WantedAccount.getAccountNumber()
					+ " is not a Current account");
		}

	}
}
