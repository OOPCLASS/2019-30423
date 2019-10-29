import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BankTest {

	Bank bank = new Bank();

	@Test
	void testOpenAccount() {
		bank.openAccount(2);
		Assert.assertTrue(bank.accounts[0] instanceof SavingsAccount);
		Assert.assertFalse(bank.accounts[0] instanceof CurrentAccount);
		Assert.assertTrue(bank.lastAccount == 1);
		bank.openAccount(3);
		Assert.assertTrue(bank.accounts[1] instanceof CurrentAccount);

	}

	@Test
	void testCloseAccount() {
		bank.openAccount(3);
		Assert.assertTrue(bank.lastAccount == 1);
		bank.closeAccount(0);
		Assert.assertTrue(bank.lastAccount == 0);
	}

}
