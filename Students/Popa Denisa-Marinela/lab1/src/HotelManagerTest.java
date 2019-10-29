import org.junit.Assert;
import org.junit.Test;

public class HotelManagerTest {
    @Test
    public void testIsClean()
    {
        Assert.assertFalse(HotelManager.isClean(214));
    }
}
