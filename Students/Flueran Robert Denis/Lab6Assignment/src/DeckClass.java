import java.util.Iterator;

public class DeckClass implements Iterator, OrderedIterator{

	///char[] deck = new char[] {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'K', 'Q', 'A'};
	
	private int iterator = 0;
	private int noOfCards;
	CardClass[] cards = new CardClass[100];
	
	DeckClass(int number) {
		noOfCards = number;
	}
	@Override
	public boolean hasNext() {
		if(iterator >= noOfCards - 1) {
			return false;
		}	
		return true;
	}

	@Override
	public Object next() {
		if(iterator < noOfCards - 1) {
			iterator++;
			return cards[iterator].deckNumber + " " + cards[iterator].suit;
		}
		return "Already reached the end of the Array";
	}
	
	public void remove() {
		System.out.println("The card with the suit: " + cards[iterator].suit + " and number: " + cards[iterator].deckNumber + " from position " + iterator + " "
				+ "is going to be removed!");
		for(int i = iterator; i < noOfCards - 1; i++)
			cards[i] = cards[i+1];
		noOfCards--;
	}
	public int getIterator() {
		return iterator;
	}
	public int getNoOfCards() {
		return noOfCards;
	}
	@Override
	public int put(Comparable objToCompare) {
		if(noOfCards == 100) {
			System.out.println("The array is already full!");
			return 0;
		}
		if(objToCompare instanceof CardClass) {
			CardClass temp = (CardClass) objToCompare;
			for(int i = 0; i < noOfCards; i++) {
				if(cards[i].compare(objToCompare)) {
					System.out.println("Card is already in the deck");
					return 0;
				}	
			}
			noOfCards++;
			cards[noOfCards - 1] = new CardClass(temp.deckNumber, temp.suit);
		}
		return 0;
	}
}
