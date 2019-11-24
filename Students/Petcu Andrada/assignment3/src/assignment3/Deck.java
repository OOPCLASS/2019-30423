package assignment3;

import java.util.Vector;

public class Deck implements OrderedIterator {
	private Vector<Card> cards = new Vector<Card>();
	public Integer currentIndex = -1;
	public Integer deckSize = 0;
	final String[] deck = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	public Deck() {
	}

	public Vector<Card> getDeck() {
		return this.cards;
	}

	@Override
	public boolean hasNext() {
		if (currentIndex >= deckSize - 1) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		if (hasNext() != false) {
			currentIndex++;
			return cards.get(currentIndex);
		} else {
			return null;
		}
	}

	/*
	 * @Override public void put(Comparable comparable) { if (comparable instanceof
	 * Card) { Card temporary = (Card) comparable; for (int i = 0; i < cards.size();
	 * i++) { if (cards.elementAt(i).compareTo(temporary) == true) {
	 * System.out.println("Card already exists"); return; } } cards.add(temporary);
	 * deckSize++; } }
	 */
	@Override
	public void put(Comparable comparable) {
		if (comparable instanceof Card) {
			Card temporary = (Card) comparable;
			if (cards.size() == 0) {
				cards.add(temporary);
				deckSize++;
			} else {
				int auxiliar = 1;
				int index = 0;
				for (int i = 0; i < cards.size(); i++) {
					auxiliar = cards.get(i).compareTo(temporary);
					if (auxiliar != 0) {
						index = i;
						break;
					}
				}
				if (auxiliar == 1) {
					cards.add(temporary);
					deckSize++;
				} else {
					if (auxiliar == -1) {
						cards.add(index, temporary);
						deckSize++;
					} else {
						return;
					}
				}

			}
		}
	}

	public void putCard(Comparable comparable) {
		if (comparable instanceof Card) {
			Card temporary = (Card) comparable;
			int index = 0;
			while (index < cards.size() && cards.get(index).compareTo(temporary) > 0) {
				index++;
			}
			if (index < cards.size() && cards.get(index).compareTo(temporary) == 0) {
				return;
			}
			cards.add(index, temporary);
			deckSize++;
		}
	}
}
