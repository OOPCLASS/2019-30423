import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class InverterTest {

	@Test
	void testInverter() {
		
		String expectedOut = "Teodorescu, Alexandru Phd. Eng." ;
		String actualOut = ass2.Inverter("   Phd. Eng. Alexandru Teodorescu   ");
		
		Assert.assertEquals(expectedOut, actualOut);
		//I tested the cases by rewriting the expected in and out, not by duplincating it
	}

}
