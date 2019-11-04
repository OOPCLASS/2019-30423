import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {
		DeckClass cardDeck = new DeckClass(13);
		cardDeck.cards[0] = new CardClass();
		cardDeck.cards[1] = new CardClass('2', "Spades");
		cardDeck.cards[2] = new CardClass('7', "Diamonds");
		cardDeck.cards[3] = new CardClass('6', "Hearts");
		cardDeck.cards[4] = new CardClass('X', "Clubs");
		cardDeck.cards[5] = new CardClass('9', "Diamonds");
		cardDeck.cards[6] = new CardClass('A', "Hearts");
		cardDeck.cards[7] = new CardClass('5', "Spades");
		cardDeck.cards[8] = new CardClass('J', "Clubs");
		cardDeck.cards[9] = new CardClass('8', "Hearts");
		cardDeck.cards[10] = new CardClass('Q', "Spades");
		cardDeck.cards[11] = new CardClass('K', "Diamonds");
		cardDeck.cards[12] = new CardClass('7', "Spades");
		assertEquals("2 Spades", cardDeck.next());
		assertEquals("7 Diamonds", cardDeck.next());
		cardDeck.remove();
		assertEquals("X Clubs", cardDeck.next());
		assertEquals(true, cardDeck.hasNext());
		cardDeck.next();
		cardDeck.next();
		cardDeck.next();
		cardDeck.next();
		cardDeck.next();
		cardDeck.next();
		cardDeck.next();
		cardDeck.next();
		assertEquals(false, cardDeck.hasNext());
	}

}
