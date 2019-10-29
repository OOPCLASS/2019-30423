import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	@Test
	void test() {
		Bank bank = new Bank();
		int i;
		for (i = 0; i <= bank.noOfAccounts; i++) {
			bank.accounts[i] = new Account(i);
			bank.accounts[i].deposit(i * 300 + 1);

			bank.savingsAccounts[i] = new SavingsAccount(i);
			bank.savingsAccounts[i].deposit(i * 400 + 1);

			bank.currentAccounts[i] = new CurrentAccount(i);
			bank.currentAccounts[i].deposit(i * 250 + 1);
			bank.currentAccounts[i].setOverdraft(i * 15 + 1);
		}
		assertEquals(301.0, bank.accounts[1].getBalance());
		assertEquals(46.0, bank.currentAccounts[3].getOverdraftLimit());
		bank.openAccount(bank.accounts);
		assertEquals(3301.0, bank.accounts[bank.noOfAccounts].getBalance());
		bank.closeAccount(bank.accounts, bank.noOfAccounts);
		assertEquals(3001.0, bank.accounts[bank.noOfAccounts].getBalance());
		bank.update(13);
		assertEquals(13.0, bank.savingsAccounts[2].getInterest());
	}

}
