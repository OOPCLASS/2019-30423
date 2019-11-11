package assignment3;

import assignment3.Card.Suit;

public class MainClass {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		Card myCard1 = new Card();
		Card myCard2 = new Card();
		Card myCard3 = new Card();
		Card myCard4 = new Card();
		Card myCard5 = new Card();
		Card myCard6 = new Card();
		myCard1.setCardNumber("J");
		myCard1.setSuit(Suit.DIAMONDS);
		myCard2.setCardNumber("2");
		myCard2.setSuit(Suit.CLUBS);
		myCard3.setCardNumber("K");
		myCard3.setSuit(Suit.CLUBS);
		myCard4.setCardNumber("A");
		myCard4.setSuit(Suit.CLUBS);
		myCard5.setCardNumber("Q");
		myCard5.setSuit(Suit.SPADES);
		myCard6.setCardNumber("K");
		myCard6.setSuit(Suit.CLUBS);
		myDeck.putCard(myCard1);
		myDeck.putCard(myCard2);
		myDeck.putCard(myCard3);
		myDeck.putCard(myCard4);
		myDeck.putCard(myCard5);
		myDeck.putCard(myCard6);
		System.out.println(myDeck.deckSize);
		while (myDeck.hasNext()) {
			System.out.println(myDeck.next().toString());
		}
	}
}