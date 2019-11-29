package assignment_03.cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeckTest {

    @Test
    void size() {
        Deck deck = new Deck();
        Assertions.assertEquals(0, deck.size());
        deck.add(new Card(Card.Suit.HEARTS, Card.Number.JACK));
        Assertions.assertEquals(1, deck.size());
        deck.remove(0);
        Assertions.assertEquals(0, deck.size());
    }

    @Test
    void add() {
        Deck deck = new Deck();
        Assertions.assertEquals(0, deck.size());
        Card card = new Card(Card.Suit.HEARTS, Card.Number.JACK);
        deck.add(card);
        Assertions.assertEquals(1, deck.size());
        Assertions.assertEquals(card, deck.get(0));
    }

    @Test
    void addInOrder() {
        Deck deck = new Deck();
        Card card1 = new Card(Card.Suit.HEARTS, Card.Number.TWO);
        Card card2 = new Card(Card.Suit.HEARTS, Card.Number.THREE);
        Card card3 = new Card(Card.Suit.HEARTS, Card.Number.FOUR);
        Card card4 = new Card(Card.Suit.HEARTS, Card.Number.FOUR);

        Assertions.assertEquals(0, deck.addInOrder(card3));
        Assertions.assertEquals(0, deck.addInOrder(card1));
        Assertions.assertEquals(card3, deck.get(1));
        Assertions.assertEquals(1, deck.addInOrder(card2));
        Assertions.assertEquals(card3, deck.get(2));
        Assertions.assertEquals(card1, deck.get(0));
        Assertions.assertEquals(-1, deck.addInOrder(card4));
    }

    @Test
    void add1() {
        Deck deck = new Deck();
        Card card1 = new Card(Card.Suit.HEARTS, Card.Number.TWO);
        Card card2 = new Card(Card.Suit.HEARTS, Card.Number.THREE);
        Card card3 = new Card(Card.Suit.HEARTS, Card.Number.FOUR);

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> deck.add(-1, card1));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> deck.add(1, card1));
        Assertions.assertTrue(deck.add(0, card1));
        Assertions.assertEquals(card1, deck.get(0));
        Assertions.assertTrue(deck.add(0, card2));
        Assertions.assertEquals(card2, deck.get(0));
        Assertions.assertEquals(card1, deck.get(1));
        Assertions.assertTrue(deck.add(2, card3));
        Assertions.assertEquals(card3, deck.get(2));
        Assertions.assertEquals(card2, deck.get(0));
        Assertions.assertEquals(card1, deck.get(1));
    }

    @Test
    void remove() {
        Deck deck = new Deck();
        Card card1 = new Card(Card.Suit.HEARTS, Card.Number.TWO);
        Card card2 = new Card(Card.Suit.HEARTS, Card.Number.THREE);
        Card card3 = new Card(Card.Suit.HEARTS, Card.Number.FOUR);

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> deck.remove(-1));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> deck.remove(0));
        Assertions.assertTrue(deck.add(card1));
        Assertions.assertTrue(deck.add(card2));
        Assertions.assertTrue(deck.add(card3));
        Assertions.assertEquals(card3, deck.get(2));
        Assertions.assertEquals(card2, deck.get(1));
        Assertions.assertEquals(card1, deck.get(0));

        deck.remove(1);
        Assertions.assertEquals(card3, deck.get(1));
        Assertions.assertEquals(card1, deck.get(0));

        deck.remove(1);
        Assertions.assertEquals(card1, deck.get(0));

        Assertions.assertTrue(deck.add(card2));
        deck.remove(0);
        Assertions.assertEquals(card2, deck.get(0));
    }
}