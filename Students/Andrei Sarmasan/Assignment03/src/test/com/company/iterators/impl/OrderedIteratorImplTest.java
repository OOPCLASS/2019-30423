package com.company.iterators.impl;

import com.company.classes.Card;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderedIteratorImplTest {

    private OrderedIteratorImpl orderedIterator;

    @Before
    public void setUp() throws Exception {
        orderedIterator = new OrderedIteratorImpl();
    }

    @Test
    public void put_SuccessfulAddWhenListIsEmpty() {
        final Card card = new Card();
        card.setNumber("A");
        card.setSuit("diamonds");
        orderedIterator.put(card);
        assertEquals(1, orderedIterator.cards.size());
    }

    @Test
    public void put_SuccessfulStopWhenInsertingDuplicateElement() {
        Card card = new Card();
        card.setNumber("A");
        card.setSuit("diamonds");
        orderedIterator.put(card);
        final int sizeBeforeInsert = orderedIterator.cards.size();

        card = new Card();
        card.setNumber("A");
        card.setSuit("diamonds");
        orderedIterator.put(card);

        final int sizeAfterInsert = orderedIterator.cards.size();

        assertEquals(sizeBeforeInsert, sizeAfterInsert);
    }

    @Test
    public void put_SuccessfulAddWhenInsertingSmallerElement() {
        final Card card = new Card();
        card.setNumber("A");
        card.setSuit("diamonds");
        orderedIterator.put(card);
        final int oldCardPositionBeforeInsertion = orderedIterator.cards.indexOf(card);

        final Card cardToBeInserted = new Card();
        cardToBeInserted.setNumber("2");
        cardToBeInserted.setSuit("diamonds");
        orderedIterator.put(cardToBeInserted);
        final int oldCardPositionAfterInsertion = orderedIterator.cards.indexOf(card);

        assertEquals(true, oldCardPositionBeforeInsertion < oldCardPositionAfterInsertion);
    }

    @Test
    public void put_SuccessfulAddWhenInsertingGreaterElement() {
        final Card card = new Card();
        card.setNumber("A");
        card.setSuit("diamonds");
        orderedIterator.put(card);
        final int oldCardPositionBeforeInsertion = orderedIterator.cards.indexOf(card);

        final Card cardToBeInserted = new Card();
        cardToBeInserted.setNumber("A");
        cardToBeInserted.setSuit("spades");
        orderedIterator.put(cardToBeInserted);
        final int oldCardPositionAfterInsertion = orderedIterator.cards.indexOf(card);

        assertEquals(true, oldCardPositionBeforeInsertion == oldCardPositionAfterInsertion);
    }

    @After
    public void tearDown() throws Exception {
        orderedIterator = null;
    }

}