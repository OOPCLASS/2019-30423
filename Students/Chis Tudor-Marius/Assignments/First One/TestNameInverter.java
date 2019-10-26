import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestNameInverter extends NameInverter {

    @Test
    public void testInvert() {
        Assert.assertEquals("",NameInverter.createInvertedString(""));
        Assert.assertNull(NameInverter.createInvertedString(null));
        Assert.assertEquals("Tudor",NameInverter.createInvertedString("Tudor"));
        Assert.assertEquals("Chis, Tudor",NameInverter.createInvertedString("Tudor Chis"));
        Assert.assertEquals("Tudor",NameInverter.createInvertedString("  Tudor  "));
        Assert.assertEquals("Chis, Tudor",NameInverter.createInvertedString("  Tudor   Chis   "));
        Assert.assertEquals("Chis, Tudor Mr.",NameInverter.createInvertedString("Mr. Tudor Chis"));
        Assert.assertEquals("Chis, Tudor Mr. PhD.",NameInverter.createInvertedString("Mr. PhD. Tudor Chis"));
        Assert.assertEquals("Chis, Tudor Mr. PhD. Dr. Ing.",NameInverter.createInvertedString("    Mr.      PhD.     Dr.    Ing.    Tudor    Chis   "));
        Assert.assertEquals("Chis, Tudor Marius Man Barman Mr. PhD. Dr. Ing. Bro.",NameInverter.createInvertedString("    Mr.      PhD.     Dr.    Ing.  Bro.   Tudor  Marius   Man   Barman  Chis   "));
    }
}