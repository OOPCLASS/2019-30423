import org.junit.Assert;
import org.junit.Test;
public class NameInverterTest {
	@Test
	public void test() {
		Assert.assertEquals(NameInverter.reverse(null),null);
		Assert.assertEquals(NameInverter.reverse("    Ioana Sandu  "), "Sandu Ioana");
		Assert.assertEquals(NameInverter.reverse("Mrs. are   Ana mere"),"mere Ana Mrs. are");
		Assert.assertEquals(NameInverter.reverse(""),"");
	}
}
