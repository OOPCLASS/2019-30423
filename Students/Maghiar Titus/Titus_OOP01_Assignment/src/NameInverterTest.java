import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NameInverterTest{

	@Test
	public void testReverseWords() {
		Assert.assertEquals("",NameInverter.reverseName(""));
		Assert.assertEquals("Titus",NameInverter.reverseName("Titus"));
		Assert.assertEquals("Titus, Maghiar",NameInverter.reverseName("Maghiar Titus"));
		Assert.assertEquals("Titus, Maghiar",NameInverter.reverseName("   Maghiar Titus   "));
		Assert.assertEquals("Titus, Maghiar Mr.",NameInverter.reverseName("Mr. Maghiar Titus"));
		Assert.assertEquals("Titus, Maghiar Mr. Phd.",NameInverter.reverseName("Mr. Phd. Maghiar Titus"));

	}

}
