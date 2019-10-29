package lab1;

import org.junit.jupiter.api.Test;
import org.junit.Assert;



class InvertTest {

	@Test
	void testNameSwitch() {
		Assert.assertEquals(null, Invert.nameSwitch(null));
		Assert.assertEquals("", Invert.nameSwitch(""));
		Assert.assertEquals("Adina", Invert.nameSwitch("Adina"));
		Assert.assertEquals("Adina", Invert.nameSwitch("    Adina   "));
		Assert.assertEquals("Misaras, Adina", Invert.nameSwitch("Adina Misaras"));
		Assert.assertEquals("Misaras, Adina", Invert.nameSwitch("    Adina    Misaras      "));
		Assert.assertEquals("Misaras, Adina Mrs.", Invert.nameSwitch("Mrs. Adina Misaras"));
		Assert.assertEquals("Misaras, Adina Mrs.", Invert.nameSwitch("   Mrs.    Adina    Misaras    "));
		Assert.assertEquals("Misaras, Adina Mrs. Phd.", Invert.nameSwitch("Mrs. Phd. Adina Misaras"));
		Assert.assertEquals("Misaras, Adina Mrs. Phd.", Invert.nameSwitch("   Mrs.     Phd.   Adina    Misaras   "));
		
	}

}
