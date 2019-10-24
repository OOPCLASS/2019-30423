import org.junit.Assert;
import org.testng.annotations.Test;

public class NameTest extends Name {

    @Test
    public void testInvert() {
        Assert.assertEquals("", Name.invert(""));
        Assert.assertNull(Name.invert(null));
        Assert.assertEquals("SingleWord", Name.invert("SingleWord"));
        Assert.assertEquals("LastName, FirstName", Name.invert("FirstName LastName"));
        Assert.assertEquals("SingleWord", Name.invert("  SingleWord  "));
        Assert.assertEquals("LastName, FirstName", Name.invert("  FirstName   LastName   "));
        Assert.assertEquals("LastName, FirstName Mr.", Name.invert("Mr. FirstName LastName"));
        Assert.assertEquals("LastName, FirstName Mr. PhD.", Name.invert("Mr. PhD. FirstName LastName"));
        Assert.assertEquals("Doe, John Mr. PhD. Dr. Ing.", Name.invert("    Mr.      PhD.     Dr.    Ing.    John    Doe   "));
        Assert.assertEquals("Doe, John Michael Jackson Mr. PhD. Dr. Ing.", Name.invert("    Mr.      PhD.     Dr.    Ing.    John    Michael    Jackson    Doe   "));
    }
}