package com.company.classes.impl;

import com.company.classes.NameInverter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NameInverterImplTest {

    private NameInverter nameInverter;

    @Before
    public void setUp(){
        nameInverter = new NameInverterImpl();
    }

    @Test
    public void invert_returnExpectedStringWhenInputIsNull() {
        assertNull(nameInverter.invert(null));
    }

    @Test
    public void invert_returnExpectedStringWhenInputIsEmpty() {
        assertEquals(nameInverter.invert(""), "");
    }

    @Test
    public void invert_returnExpectedStringWhenInputIsSingleWord() {
        assertEquals(nameInverter.invert("SingleWord"), "SingleWord");
    }

    @Test
    public void invert_returnExpectedStringWhenInputIsFirstAndLastName() {
        assertEquals(nameInverter.invert("FirstName LastName"), "LastName, FirstName");
    }

    @Test
    public void invert_returnExpectedStringWhenInputIsUntrimmedSingleWord() {
        assertEquals(nameInverter.invert("     SingleWord    "), "SingleWord");
    }

    @Test
    public void invert_returnExpectedStringWhenInputIsUntrimmedFirstAndLastName() {
        assertEquals(nameInverter.invert("     FirstName      LastName    "), "LastName, FirstName");
    }

    @Test
    public void invert_returnExpectedStringWhenInputIsFirstLastNameAndTitle() {
        assertEquals(nameInverter.invert("Mr. FirstName LastName"), "LastName, FirstName Mr.");
    }

    @Test
    public void invert_returnExpectedStringWhenInputIsFirstLastNameAndTwoTitles() {
        assertEquals(nameInverter.invert("Mr. Phd. FirstName LastName"), "LastName, FirstName Mr. Phd.");
    }

    @After
    public void tearDown() throws Exception {
        nameInverter = null;
    }

}