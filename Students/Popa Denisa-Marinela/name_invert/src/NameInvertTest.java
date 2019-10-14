import org.junit.Assert;
import org.junit.Test;
public class NameInvertTest {

    @Test
     public void NameTest(){
        Assert.assertEquals(null,NameInvert.invertName(null));
        Assert.assertEquals("",NameInvert.invertName(""));
        Assert.assertEquals("Denisa",NameInvert.invertName("  Denisa  "));
        Assert.assertEquals("Denisa,Popa",NameInvert.invertName("   Popa    Denisa  "));
        Assert.assertEquals("Flavius,Micu Mr. Phd. ",NameInvert.invertName("Mr. Phd. Micu Flavius"));

    }
}
