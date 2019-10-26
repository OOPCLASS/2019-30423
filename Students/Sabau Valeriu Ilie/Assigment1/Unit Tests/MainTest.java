import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public static void TestNameInverter(){


        Assert.assertEquals(Main.invertName("Singleton"),"Singleton");
        assertNull(Main.invertName(null));
        Assert.assertEquals(Main.invertName(""),"");
        Assert.assertEquals(Main.invertName("FirstName LastName"),"LastName, FirstName");
        Assert.assertEquals(Main.invertName(" SingleWord "),"SingleWord");
        Assert.assertEquals(Main.invertName(" FirstName LastName " ),"LastName, FirstName");
        Assert.assertEquals(Main.invertName("Mr. FirstName LastName" ),"LastName, FirstName Mr.");
        Assert.assertEquals(Main.invertName("Mr. Phd. FirstName LastName" ),"LastName, FirstName Mr. Phd.");


    }


}