import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseNameTest {

	@Test
	void testReverse() {
		assertEquals(null, ReverseName.reverseName(null));
		assertEquals("", ReverseName.reverseName(""));
		assertEquals("Iulia", ReverseName.reverseName("Iulia"));
		assertEquals("Dragan, Iulia", ReverseName.reverseName("Iulia Dragan"));
		assertEquals("Iulia", ReverseName.reverseName("  Iulia  "));	
		assertEquals("Dragan, Iulia", ReverseName.reverseName("  Iulia Dragan  "));
		assertEquals("Dragan, Iulia Ms.", ReverseName.reverseName("Ms. Iulia Dragan"));
		assertEquals("Dragan, Iulia Ms. Phd.", ReverseName.reverseName("Ms. Phd. Iulia Dragan"));
	}

}
