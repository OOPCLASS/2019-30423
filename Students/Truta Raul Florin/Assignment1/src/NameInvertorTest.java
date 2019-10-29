import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NameInvertorTest {

	@Test
	void TestFor2NamesOnly() {
		String exp = "Minecraft, Raul";
		String act = NameInvertor.Invert("Raul Minecraft");
		org.junit.Assert.assertEquals(exp, act);
		
	}

	@Test
	void TestFor2NamesWithSpaces() {
		String exp = "Minecraft, Raul";
		String act = NameInvertor.Invert("  Raul Minecraft      ");
		org.junit.Assert.assertEquals(exp, act);
	}
	
	@Test
	void TestFor1NameOnly() {
		String exp = "Raul";
		String act = NameInvertor.Invert("  Raul ");
		org.junit.Assert.assertEquals(exp, act);
	}
	
	@Test
	void TestWithTitles() {
		String exp = "Minecraft, Raul Phd. Mr.";
		String act = NameInvertor.Invert("  Mr. Phd. Raul Minecraft");
		org.junit.Assert.assertEquals(exp, act);
	}
	
	@Test
	void TestForBlank() {
		String exp = "";
		String act = NameInvertor.Invert("");
		org.junit.Assert.assertEquals(exp, act);
	}

}
