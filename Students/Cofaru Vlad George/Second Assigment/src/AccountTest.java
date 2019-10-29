import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void testDeposit() {
		Account test1 = new Account(100);

		test1.deposit(200);
		Assert.assertTrue(test1.getBalance() == 200.0);

	}

	@Test
	void testGetAccountNumber() {
		Account test1 = new Account(100);
		Assert.assertTrue(test1.getAccountNumber() == 100.0);

	}

}
