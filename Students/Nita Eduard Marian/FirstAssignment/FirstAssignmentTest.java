import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FirstAssignmentTest {

	@Test
	void test() {
		Assert.assertTrue(!(FirstAssignment.nameInverter("Mr. FirstName   LastName").equals("invalid input")));
		Assert.assertTrue(!(FirstAssignment.nameInverter("  singleWord   ").equals("invalid input")));
		Assert.assertTrue(!(FirstAssignment.nameInverter("Mr. Phd. FirstName   LastName").equals("invalid input")));
		Assert.assertTrue(!(FirstAssignment.nameInverter("").equals("invalid input")));
		// why is the null test invalid?
		Assert.assertTrue(!(FirstAssignment.nameInverter(null).equals("invalid input")));
	}

}
