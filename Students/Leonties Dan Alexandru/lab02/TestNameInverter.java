package lab02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNameInverter {

	@Test
	public void testInvertName() {
		Assertions.assertNull(NameInverter.InvertName(null));
		
		Assertions.assertEquals(NameInverter.InvertName(""), "");
        
		Assertions.assertEquals(NameInverter.InvertName("SingleWord"), "SingleWord");
        
		Assertions.assertEquals(NameInverter.InvertName("FirstName LastName"), "LastName, FirstName");
        
		Assertions.assertEquals(NameInverter.InvertName(" SingleWord "), "SingleWord");
        
		Assertions.assertEquals(NameInverter.InvertName(" FirstName LastName "), "LastName, FirstName");
        
		Assertions.assertEquals(NameInverter.InvertName("Mr. FirstName LastName"), "LastName, FirstName Mr.");
        
		Assertions.assertEquals(NameInverter.InvertName("Mrs. FirstName LastName"), "LastName, FirstName Mrs.");
        
		Assertions.assertEquals(NameInverter.InvertName("Mr. Phd. FirstName LastName"), "LastName, FirstName Mr. Phd.");
        
		Assertions.assertEquals(NameInverter.InvertName("Mrs. Phd. FirstName LastName"), "LastName, FirstName Mrs. Phd.");
        
		Assertions.assertEquals(NameInverter.InvertName("Mr. Phd. Firstname Middlename Lastname"), "Error");
        
		Assertions.assertEquals(NameInverter.InvertName("Mrs. Phd. Firstname Middlename Lastname"), "Error");
        
		Assertions.assertEquals(NameInverter.InvertName("This shouldn't work"), "Error");
	
	
	}

}
