import  org.junit.Assert;

import org.junit.jupiter.api.Test;

class InverterTest {

	@Test
	void testInvert() {
		Assert.assertEquals(null, Inverter.invertName(null));
		Assert.assertEquals("", Inverter.invertName(""));
		Assert.assertEquals("SingleWord", Inverter.invertName("  SingleWord  "));
		Assert.assertEquals("LastName, FirstName", Inverter.invertName("  FirstName   LastName  "));
		Assert.assertEquals("LastName, FirstName Mr.", Inverter.invertName("  Mr.   FirstName LastName"));
		Assert.assertEquals("LastName, FirstName Mr. Phd.", Inverter.invertName("Mr. Phd. FirstName LastName"));
	}

}
