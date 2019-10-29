package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class InvertorTest {

	@Test
	void testInvertName() {
		assertEquals("Tudor", Invertor.invertName("  Tudor "));
		assertEquals(null,Invertor.invertName(null));
		assertEquals("Florea, Tudor",Invertor.invertName("Tudor Florea"));
		assertEquals("Tudor",Invertor.invertName("   Tudor   "));
		assertEquals("Florea, Tudor",Invertor.invertName("   Tudor   Florea   "));
		assertEquals("Florea, Tudor Mr.",Invertor.invertName("Mr. Tudor Florea"));
		assertEquals("Florea, Tudor Mr.",Invertor.invertName("     Mr.   Tudor     Florea  "));
		assertEquals("Florea, Tudor Mr. Phd.",Invertor.invertName("Mr. Phd. Tudor Florea"));
		assertEquals("Florea, Tudor Mr. Phd.",Invertor.invertName("     Mr.   Phd.    Tudor     Florea  "));
		assertEquals("Florea, Tudor Mr.Phd. Prof. Ing. Dr.",Invertor.invertName("Mr.Phd. Prof. Ing. Dr. Tudor Florea"));
		assertEquals("Florea, Tudor Mr. Phd. Prof. Dr.",Invertor.invertName("     Mr.   Phd.    Prof.  Dr.   Tudor     Florea  "));
		
		
	}

}
