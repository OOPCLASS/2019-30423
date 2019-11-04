package assignment2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;


class BankTest {

	Bank testBank = new Bank();
	
	@Test
	void test() {
		
		/*open account*/
		testBank.openAccount("Savings");
		testBank.openAccount("Current");
		testBank.openAccount("Normal");
		
		/*check accounts*/
		Assert.assertEquals(testBank.numberAccounts, 3);
		Assert.assertTrue(testBank.accounts[0] instanceof SavingsAccount);
		Assert.assertTrue(testBank.accounts[1] instanceof CurrentAccount);
		Assert.assertTrue(testBank.accounts[2] instanceof Account);
		
		/*close account*/
		testBank.closeAccount(1);
		Assert.assertEquals(testBank.numberAccounts, 2);
		Assert.assertTrue(testBank.accounts[0] instanceof SavingsAccount);
		Assert.assertTrue(testBank.accounts[1] instanceof Account);
		
		/*dividend & deposit*/
		testBank.payDividend();
		Assert.assertTrue(testBank.accounts[1].getBalance() == 50);
		
		testBank.accounts[1].deposit(400);
		Assert.assertTrue(testBank.accounts[1].getBalance() == 450);
		
		/*withdraw*/
		testBank.accounts[0].withdraw(200);
		Assert.assertTrue(testBank.accounts[0].getBalance() == -150);
	}

}
