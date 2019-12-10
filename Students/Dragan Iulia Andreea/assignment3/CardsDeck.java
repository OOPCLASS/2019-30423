package assignment3;

public class CardsDeck implements OrderedIterator {

	public Card[] cards = new Card[52];
	private int index = -1;
	private int currSize = 0; 
	private final int MAX_SIZE = 52;
	
	public void resetIndex() {
		index = -1;
	}
	
	public int getSize() {
		return currSize;
	}
	
	public int getIndex() {
		return index;
	}
	
	@Override
	public void remove() {
		if ( currSize == 0) {
			System.err.println("Cannot remove card: Deck is empty");
		}
		else {
			if(currSize != MAX_SIZE-1) {
				for(int i = index; i < currSize; i++) {
					cards[i] = cards[i+1];
				}
			currSize--;
			}
		}
	}


	@Override
	public boolean hasNext() {
		if(index < currSize-1) {
			return true;
		}
		return false;
	}


	@Override
	public Card next() {
		if(hasNext()) {
			index++;
			return cards[index];
		}
		return null;
	}


	@Override
	public int put(Comparable comparable) {
		if( currSize == MAX_SIZE - 1) {
			System.err.println("Cannot add new card: Deck is already full");
			return -1;
		}
		if(comparable instanceof Card) {
			Card aux = (Card) comparable;
			for(int i = 0; i < currSize; i++) {
				if(aux.compareTo(cards[i]) == 0) {
					System.err.println("Cannot add new card: Card is already in the deck");
					return -1;
				}
			}
			cards[currSize] = aux;
			currSize++;
			return 0;
		}
		return 0;
	}
}
