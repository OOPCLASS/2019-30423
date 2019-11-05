import java.util.Comparator;

public class Card implements Comparable {

	private String suit;
	private char number;

	public Card(char numbre, String suit) {
		this.number = numbre;
		this.suit = suit;

	}

	public void setNumber(char number) {
		this.number = number;
	}

	public String getSuit() {
		return suit;
	}

	public char getNumber() {
		return number;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Card) {
			if (((Card) o).suit.compareTo(suit) == 0 && number == ((Card) o).number) {
				return 1;
			}

		}

		return 0;
	}

}
