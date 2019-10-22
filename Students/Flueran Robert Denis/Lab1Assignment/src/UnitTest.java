import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class UnitTest {

	@Test
	public void test() {
		NameInverter junit = new NameInverter();
	    String testString = junit.Invert("    Denis Flueran   ");
		assertEquals("Flueran, Denis", testString);
		testString = junit.Invert(null);
		assertEquals(null, testString);
		testString = junit.Invert("");
		assertEquals("", testString);
	    testString = junit.Invert("    Denisacke ");
		assertEquals("Denisacke", testString);
		testString = junit.Invert("Mr.   Phd.   Ing.    Denisacke    Flueran ");
		assertEquals("Flueran, Denisacke Mr. Phd. Ing.", testString);
	}

}
