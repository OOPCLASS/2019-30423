import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

package bankAccount;

{
public class BankTest {
	
	Bank bank = new Bank();
	
	
	@Test
	void testOpenAccount() {
		bank.openAccount(2);
		Assert.assertTrue(Bank.accounts[0] instanceof SavingsAccount);
		Assert.assertFalse(Bank.accounts[0] instanceof CurrentAccount);
		Assert.assertTrue(Bank.nrOfAccounts == 1);
		bank.openAccount(3);
		Assert.assertTrue(Bank.accounts[1] instanceof CurrentAccount);

	}

	@Test
	void testCloseAccount() {
		bank.openAccount(3);
		Assert.assertTrue(Bank.nrOfAccounts == 1);
		bank.closeAccount(0);
		Assert.assertTrue(Bank.nrOfAccounts == 0);
	}
}


