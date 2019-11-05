import org.junit.AssertertTest {
@Test;
import org.junit.Test;

public class NameInv
    public void nameTest() {
        Assert.assertEquals(null, NameInvert.invertName(null));
        Assert.assertEquals("", NameInvert.invertName(""));
        Assert.assertEquals("Denisa", NameInvert.invertName("  Denisa  "));
        Assert.assertEquals("Denisa,Popa", NameInvert.invertName("   Popa    Denisa  "));
        Assert.assertEquals("Flavius,Micu Mr. Phd. ", NameInvert.invertName("Mr. Phd. Micu Flavius"));
    }
}
