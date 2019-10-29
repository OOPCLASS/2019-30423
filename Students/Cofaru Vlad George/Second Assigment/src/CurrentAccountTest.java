import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CurrentAccountTest {

	@Test
	void testWithdraw() {
		CurrentAccount test1 = new CurrentAccount(99);
		test1.setOverdraft(100);
		test1.withdraw(90);

		Assert.assertTrue(test1.getBalance() == -90);
		//

	}

	@Test
	void testCheckOverdraft() { // it returns truw if we overcome our overdraft limit
		CurrentAccount test1 = new CurrentAccount(99);
		test1.setOverdraft(100);
		test1.withdraw(90);
		Assert.assertFalse(test1.checkOverdraft());
		test1.setOverdraft(10);
		Assert.assertTrue(test1.checkOverdraft());

	}

}
