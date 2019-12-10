package assignment3;

import assignment3.Card.Suit;
import assignment3.Card.Number;

public class MainClass {

	public static void main(String[] args) {
		
		CardsDeck deck = new CardsDeck();
		Card card1 = new Card(Number.TWO, Suit.HEARTS);
		Card card2 = new Card(Number.TWO, Suit.CLUBS);
		Card card3 = new Card(Number.TEN, Suit.CLUBS);
		Card card4 = new Card(Number.J, Suit.DIAMONDS);
		
		deck.put(card1);
		deck.put(card2);
		deck.put(card3);
		deck.put(card4);
		
		while(deck.hasNext()) {
			System.out.println(deck.next().toString());
		}
	}

}
