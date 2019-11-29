package assignment_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNameInverter {
    @Test
    public void testInvertName()
    {
        Assertions.assertNull(NameInverter.invertName(null));
        Assertions.assertEquals(NameInverter.invertName(""), "");
        Assertions.assertEquals(NameInverter.invertName("SingleWord"), "SingleWord");
        Assertions.assertEquals(NameInverter.invertName("FirstName LastName"), "LastName, FirstName");
        Assertions.assertEquals(NameInverter.invertName(" SingleWord "), "SingleWord");
        Assertions.assertEquals(NameInverter.invertName(" FirstName LastName "), "LastName, FirstName");
        Assertions.assertEquals(NameInverter.invertName("Mr. FirstName LastName"), "LastName, FirstName Mr.");
        Assertions.assertEquals(NameInverter.invertName("Mrs. FirstName LastName"), "LastName, FirstName Mrs.");
        Assertions.assertEquals(NameInverter.invertName("Mr. Phd. FirstName LastName"), "LastName, FirstName Mr. Phd.");
        //Last name is missing
        Assertions.assertEquals(NameInverter.invertName("Mr. Phd. FirstName"), "Mr. Phd. FirstName");
        //Only title was given
        Assertions.assertEquals(NameInverter.invertName("Mr. Phd."), "Mr. Phd.");
        //Additional spaces between words
        Assertions.assertEquals(NameInverter.invertName(" Mr.  Phd.  FirstName  LastName "), "LastName, FirstName Mr. Phd.");
        //Multiple names
        Assertions.assertEquals(NameInverter.invertName("Mr. Phd. FirstName MiddleName1 MiddleName2 LastName"),
                "LastName, FirstName MiddleName1 MiddleName2 Mr. Phd.");
        Assertions.assertEquals(NameInverter.invertName("FirstName MiddleName1 MiddleName2 LastName"),
                "LastName, FirstName MiddleName1 MiddleName2");

    }
}
