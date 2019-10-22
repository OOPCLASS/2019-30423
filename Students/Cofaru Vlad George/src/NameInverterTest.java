import  org.junit.Assert;

import org.junit.jupiter.api.Test;

class NameInverterTest {

	@Test
	void testInvert() {
		Assert.assertEquals(null,NameInverter.invert(null));
		Assert.assertEquals("",NameInverter.invert(""));
		Assert.assertEquals("Single",NameInverter.invert("    Single   "));
		Assert.assertEquals("Doe , John ",NameInverter.invert("  John Doe   "));
		Assert.assertEquals("LastName , FirstName ",NameInverter.invert("   FirstName LastName"));
		Assert.assertEquals("DOE , JOHN ms. mrs. phd. master. ",NameInverter.invert("ms. mrs. phd. master. JOHN DOE"));
	}

}
