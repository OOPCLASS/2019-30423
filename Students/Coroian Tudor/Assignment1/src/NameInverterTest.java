import org.junit.jupiter.api.Test;

public class NameInverterTest 
{
	@Test
	public void test() 
	{
		NameInverter.invertName(null); 
		NameInverter.invertName("");	
		NameInverter.invertName("Clarance"); 
		NameInverter.invertName("   Clarance   "); 
		NameInverter.invertName("Mathew Clarance"); 
		NameInverter.invertName("   Mathew Clarance   "); 
		NameInverter.invertName("Mr. Mathew Clarance"); 
		NameInverter.invertName("Mr. Phd. Mathew Clarance"); 

	}

}
