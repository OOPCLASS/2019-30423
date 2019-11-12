package assignment3;

public class Card implements Comparable {
	
	public Suit suit;
	public Number number;
	
	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES;
	}
	
	public enum Number {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K, A;
	}
	
	public Card() {
		
	}
	
	public Card(Number number, Suit suit) {
		this.suit = suit;
		this.number = number;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public void setNumber(Number number) {
		this.number = number;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
	
	public Number getNumber() {
		return this.number;
	}

	@Override
	public int compareTo(Comparable objectToCompareTo) {
		if(objectToCompareTo instanceof Card) {
			int temp = suit.compareTo(((Card) objectToCompareTo).getSuit());
			if(temp == 0) {
				return number.compareTo(((Card) objectToCompareTo).getNumber());
			}
			return temp;
		}
		return -2;
	}

	@Override
	public String toString() {
		return number + " of " + suit;
	}
}
