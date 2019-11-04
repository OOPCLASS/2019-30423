package com.company.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card();
        card.setSuit("hearts");
        card.setNumber("5");
    }

    @Test
    public void compareTo_return0WhenCardsAreEqual() {
        final Card cardToBeCompared = new Card();
        cardToBeCompared.setSuit("hearts");
        cardToBeCompared.setNumber("5");
        assertEquals(0, card.compareTo(cardToBeCompared));
    }

    @Test
    public void compareTo_returnNegativeValueWhenComparedCardHasSmallerNumber() {
        final Card cardToBeCompared = new Card();
        cardToBeCompared.setSuit("hearts");
        cardToBeCompared.setNumber("4");
        assertEquals(-1, card.compareTo(cardToBeCompared));
    }

    @Test
    public void compareTo_returnNegativeValueWhenComparedCardHasSmallerSuit() {
        final Card cardToBeCompared = new Card();
        cardToBeCompared.setSuit("diamonds");
        cardToBeCompared.setNumber("5");
        assertEquals(-1, card.compareTo(cardToBeCompared));
    }

    @Test
    public void compareTo_returnPositiveValueWhenComparedCardHasGreaterNumber() {
        final Card cardToBeCompared = new Card();
        cardToBeCompared.setSuit("hearts");
        cardToBeCompared.setNumber("A");
        assertEquals(+1, card.compareTo(cardToBeCompared));
    }

    @Test
    public void compareTo_returnPositiveValueWhenComparedCardHasGreaterSuit() {
        final Card cardToBeCompared = new Card();
        cardToBeCompared.setSuit("spades");
        cardToBeCompared.setNumber("5");
        assertEquals(+1, card.compareTo(cardToBeCompared));
    }

    @After
    public void tearDown() throws Exception {
        card = null;
    }

}