import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Assignment1HasDariusTest {

	@Test
	public void testReturnName() {
		Assert.assertEquals(null,Assignment1HasDarius.returnName(null));
		Assert.assertEquals("",Assignment1HasDarius.returnName(""));
		Assert.assertEquals("Has, Darius Mr.",Assignment1HasDarius.returnName("Mr. Darius   Has"));
		Assert.assertEquals("Has, Darius Mr. Phd.",Assignment1HasDarius.returnName("Mr. Phd. Darius Has"));
		Assert.assertEquals("Has, Raluca Mrs. Conf. Phd.",Assignment1HasDarius.returnName("Mrs. Conf.   Phd. Raluca Has"));

	}
}
