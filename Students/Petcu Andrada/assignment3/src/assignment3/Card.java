package assignment3;

public class Card implements Comparable {
	private String cardNumber;
	private Suit suit;
	final String[] deck = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	public Card() {
	}

	public boolean isCard(String cardNumber) {
		for (int i = 0; i < deck.length; i++) {
			if (cardNumber.equals(deck[i])) {
				return true;
			}
		}
		return false;
	}

	public void setCardNumber(String cardNumber) {
		if (isCard(cardNumber) == true) {
			this.cardNumber = cardNumber;
		} else {
			System.out.println("'" + cardNumber + "'" + " is not a valid card");
		}
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Suit getSuit() {
		return suit;
	}

	/*
	 * @Override public boolean compareTo(Comparable objToCompare) { //iseq if
	 * (objToCompare instanceof Card) { Card temp = (Card) objToCompare; if
	 * (suit.compareTo(temp.getSuit()) == 0 &&
	 * cardNumber.equals(temp.getCardNumber())) { return true; } } return false; }
	 */
	@Override
	public int compareTo(Comparable objToCompare) {
		if (objToCompare instanceof Card) {
			Card temp = (Card) objToCompare;
			if (cardNumber.compareTo(temp.getCardNumber()) == 0) {
				return suit.compareTo(temp.getSuit());
			} else {
				if (cardNumber.compareTo(temp.getCardNumber()) > 0) {
					return -1;
				} else {
					return 1;
				}
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		String result = "card: " + cardNumber + " suit: " + suit;
		return result;
	}

	enum Suit {
		HEARTS, CLUBS, DIAMONDS, SPADES
	}

}
