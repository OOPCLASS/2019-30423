package account;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BankTest {
	
	Bank B1 = new Bank();
	
	@Test
	void test() {
		//OpenAcount
		B1.createAccount(1);
		B1.createAccount(2);
		B1.createAccount(3);
		B1.createAccount(4);
		
		//Check type
		Assert.assertEquals(B1.size, 3);
		Assert.assertTrue(B1.accounts[0] instanceof Account);
		Assert.assertTrue(B1.accounts[1] instanceof SavingsAccount);
		Assert.assertTrue(B1.accounts[2] instanceof CurrentAccount);
		Assert.assertFalse(B1.accounts[0] instanceof SavingsAccount);
		
		//Close accounts
		B1.closeAccount(1);
		Assert.assertEquals(B1.size, 2);
		Assert.assertTrue(B1.accounts[0] instanceof Account);
		Assert.assertTrue(B1.accounts[1] instanceof CurrentAccount);
	}

}
