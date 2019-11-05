import java.util.Iterator;

public class Deck implements OrderedIterator<Card>, Iterator<Card> {
	// public char[] decks = new char[] { '1', '2', '3', '4', '5', '6', '7', '8',
	// '9', 'X', 'J', 'Q', 'K', 'A' };

	Card[] cards = new Card[100];

	private int iterator = 0;
	private int noOfCards=0;

	@Override
	public boolean hasNext() {

		if (iterator > noOfCards - 1)
			return false;
		return true;

	}

	@Override
	public Card next() {
		if (iterator < noOfCards - 1) {
			iterator++;
			Card temp = new Card(cards[iterator].getNumber(), cards[iterator].getSuit());
			return temp;
		}

		System.out.println("The deck has reached its final card");
		return null;
	}

	/*
	 * public void remove() {
	 * 
	 * for(int i=iterator;i<decks.length-1;i++) { decks[i]= decks[i+1]; }
	 * 
	 * decks[decks.length-1]= 0;
	 * 
	 * }
	 * 
	 * public void print() { for(int i=0;i<decks.length;i++)
	 * System.out.print(decks[i] + " "); }
	 * 
	 * 
	 */
	
	public int getIterator() {
		return iterator;
	}
	public int getNoOfCards() {
		return noOfCards;
	}
	
	public void remove()
	{
		if(noOfCards==0) {
			System.out.println("The deck is already empty");
		}
		else {
			
		
		System.out.println("The card with the suit: " + cards[iterator].getSuit() + " and number: " + cards[iterator].getNumber() + " from position " + iterator + " "
				+ "is going to be removed!");
		for(int i = iterator; i < noOfCards - 1; i++)
			cards[i] = cards[i+1];
		noOfCards--;
	}
}		
		
	
	
	@Override
	public int put(Comparable obj) {
		if (noOfCards == 100) {
			System.err.println("The deck is full ");
			return 0;
		}

		if (obj instanceof Card) {
			Card temp = (Card) obj;
			for (int i = 0; i < noOfCards; i++) {
				if (cards[i].compareTo(temp) == 1) {
					System.out.println("Card is already in the deck");
					return 0;
				}
			}

			noOfCards++;
			cards[noOfCards - 1] = new Card(temp.getNumber(), temp.getSuit());
		}

		return 0;
	}

	
	public void showDeck()
	{
		for(int i=0;i<noOfCards;i++)
			System.out.println(cards[i].getNumber()+ " " + cards[i].getSuit());
		
	}
	//i wanted to test the for each 
	public void showHand() {
		for(Card aux : cards)
		{
			System.out.println(aux.getNumber()+ " " + aux.getSuit());
		}
		
	}
}
