package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardDeckTest {

    @Test
    void validPutTest() {
        CardDeck cardDeck = new CardDeck();
        Assert.assertFalse(cardDeck.hasNext());
        Card card1 = new Card('H', '5');
        Card card2 = new Card('H', '9');
        Card card3 = new Card('C', '5');
        Assert.assertTrue(card1.isValid());
        Assert.assertTrue(card2.isValid());
        Assert.assertTrue(card3.isValid());
        cardDeck.put(card1);
        cardDeck.put(card2);
        cardDeck.put(card3);
        Card fromDeck = (Card) cardDeck.next();
        Assert.assertEquals(fromDeck.toString(), card3.toString());
        fromDeck = (Card) cardDeck.next();
        Assert.assertEquals(fromDeck.toString(), card1.toString());
        fromDeck = (Card) cardDeck.next();
        Assert.assertEquals(fromDeck.toString(), card2.toString());
        Assert.assertFalse(cardDeck.hasNext());
    }

    @Test
    void invalidPutTest() {
        CardDeck cardDeck = new CardDeck();
        Assert.assertFalse(cardDeck.hasNext());
        Card card1 = new Card('H', '1');
        Card card2 = new Card('W', '1');
        cardDeck.put(card1);
        cardDeck.put(card1);
        Assert.assertFalse(cardDeck.hasNext());
    }
}