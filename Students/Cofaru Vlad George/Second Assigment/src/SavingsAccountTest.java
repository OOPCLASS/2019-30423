import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {

	@Test
	void testSetInteres() {
		SavingsAccount test1 = new SavingsAccount(99, 100);
		test1.setInteres(50);
		Assert.assertTrue(test1.interes == 50);
	}

	@Test
	void testAddInteres() {
		SavingsAccount test1 = new SavingsAccount(99, 100);
		test1.deposit(100);
		double aux = test1.getBalance();
		test1.addInteres();
		Assert.assertTrue(test1.getBalance() == 2 * aux);

	}

}
