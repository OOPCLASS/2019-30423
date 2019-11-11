package assignment3;

import org.junit.Assert;
import org.junit.Test;

import assignment3.Card.Suit;

public class MyTest {

	@Test
	public void test() {
		Deck myDeck = new Deck();
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		Card card4 = new Card();
		Card card5 = new Card();
		Card card6 = new Card();
		card1.setCardNumber("K");
		card1.setSuit(Suit.SPADES);
		card2.setCardNumber("A");
		card2.setSuit(Suit.CLUBS);
		card3.setCardNumber("2");
		card3.setSuit(Suit.SPADES);
		card4.setCardNumber("J");
		card4.setSuit(Suit.HEARTS);
		card5.setCardNumber("K");
		card5.setSuit(Suit.SPADES);
		card6.setCardNumber("5");
		card6.setSuit(Suit.HEARTS);
		
		myDeck.putCard(card1);
		myDeck.putCard(card2);
		myDeck.putCard(card3);
		myDeck.putCard(card4);
		myDeck.putCard(card5);
		myDeck.putCard(card6);
		Assert.assertEquals("K", card1.getCardNumber());
		Assert.assertEquals("A", card2.getCardNumber());
		Assert.assertEquals("2", card3.getCardNumber());
		Assert.assertEquals("J", card4.getCardNumber());
		Assert.assertEquals("K", card5.getCardNumber());
		Assert.assertEquals("5", card6.getCardNumber());
	}

}
