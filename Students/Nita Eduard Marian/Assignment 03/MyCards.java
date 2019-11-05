import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MyCards implements Iterator, OrderedIterator {
	public ArrayList<Card> myCards = new ArrayList<>();
	private Integer currentIndex = 0;
	private Character[] referenceValues = { '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K', 'A' };
	private Suite[] suiteArray = Suite.values();
	private HashMap<Character, Integer> charToInt = new HashMap<Character, Integer>();

	public MyCards() {
		for (int i = 0; i < referenceValues.length; i++) {
			charToInt.put(referenceValues[i], i);
		}
	}

	@Override
	public boolean hasNext() {
		return (currentIndex < myCards.size() ? true : false);
	}

	@Override
	public Card next() {
		if (this.hasNext()) {
			return myCards.get(currentIndex++);
		} else {
			return null;
		}
	}

	@Override
	public void put(Comparable comparable) {
		this.resetCurrentIndex();
		if (myCards.size() == 0) {
			myCards.add(0, (Card) comparable);
		} else {
			Card auxOne, auxTwo;
			if (cardInDeck((Card) comparable)) {
				while (true) {

					auxOne = this.next();
					auxTwo = this.next();
					if (auxOne == null) {
						myCards.add(currentIndex - 1, (Card) comparable);
						break;
					} else if (auxOne != null && auxTwo == null) {
						if (auxOne.compare((Card) comparable) == 1) {
							myCards.add(currentIndex, (Card) comparable);
						} else {
							myCards.add(currentIndex - 1, (Card) comparable);
						}
						break;
					} else if (auxOne.compare((Card) comparable) == 0) {
						myCards.add(currentIndex - 2, (Card) comparable);
						break;
					} else if (auxOne.compare((Card) comparable) == 1 && auxTwo.compare((Card) comparable) == 0) {
						myCards.add(currentIndex - 1, (Card) comparable);
						break;
					}
				}
			} else {
				System.out.println("Element " + ((Card) comparable).getSuite() + " " + ((Card) comparable).getNumber()
						+ "  was not added");
			}
		}
	}

	public Boolean cardInDeck(Card card) {
		for (int i = 0; i < myCards.size(); i++) {
			if (myCards.get(i).getNumber() == card.getNumber() && myCards.get(i).getSuite() == card.getSuite()) {
				return false;
			}
		}
		return true;
	}

	public Card createDeckCard(Suite suite, Character symbol) {
		return new Card(suite, symbol, charToInt);
	}

	public void generateDeck() {
		for (Suite suite : suiteArray) {
			for (int i = 0; i < referenceValues.length; i++) {
				myCards.add(new Card(suite, referenceValues[i], charToInt));
			}
		}
	}

	public void printDeck() {
		this.resetCurrentIndex();

		while (this.hasNext()) {
			Card currentCard = this.next();
			System.out.println(currentCard.getSuite() + " " + currentCard.getNumber());
		}
		this.resetCurrentIndex();
	}

	public void resetCurrentIndex() {
		this.currentIndex = 0;
	}

	public void remove(Card removedCard) {
		myCards.remove(myCards.indexOf(removedCard));
	}

	public void clearDeck() {
		myCards.clear();
	}

}
