import org.junit.Assert;
import org.junit.Test;

public class HotelManagerTest
{
	@Test
	public void testisClean()
	{
		Assert.assertTrue(HotelManager.isClean(10)); //meaning if I call that method with parameter 10, the result must be true
		Assert.assertFalse(HotelManager.isClean(-5));
	}
	
	/**
	@Test
	public void testisCleanReturnFalse()
	{
		//
	}
	
	@Test
	public void testisCleanReturnTrue()
	{
		//
	}
	*/
}
