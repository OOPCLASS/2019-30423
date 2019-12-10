package assignment3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import assignment3.Card.Suit;
import org.junit.Assert;
import assignment3.Card.Number;

class CardsDeckTest {

	@Test
	void test() {
		
		CardsDeck testDeck = new CardsDeck();
		
		Card card1 = new Card(Number.EIGHT, Suit.CLUBS);
		Card card2 = new Card(Number.EIGHT, Suit.CLUBS);
		Card card3 = new Card(Number.J, Suit.SPADES);
		Card card4 = new Card(Number.NINE, Suit.DIAMONDS);
		
		//test for duplicates
		testDeck.put(card1);
		Assert.assertEquals(-1, testDeck.put(card2));
		
		testDeck.put(card3);
		testDeck.put(card4);
		
		//test to see if cards are in the deck
		Assert.assertTrue(testDeck.hasNext());
		Assert.assertEquals(card1, testDeck.next());
		Assert.assertEquals(card3, testDeck.next());
		Assert.assertEquals(card4, testDeck.next());
		Assert.assertEquals(2, testDeck.getIndex());
		Assert.assertFalse(testDeck.hasNext());
		
		//test to check if removal is done properly - for 1st and last element
		testDeck.resetIndex();
		testDeck.next();
		testDeck.remove();
		Assert.assertEquals(card3, testDeck.cards[0]);
		testDeck.next();
		testDeck.remove();
		Assert.assertEquals(1, testDeck.getSize());
		
		//test to see if getNumber & getSuit work
		Assert.assertEquals(Number.J, card3.getNumber());
		Assert.assertEquals(Suit.DIAMONDS, card4.getSuit());
		
	}

}
