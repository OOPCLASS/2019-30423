import java.util.Iterator;

public class SuitOfCards implements Iterator<Card>, OrderedIterator {
	private Card[] suit;
	public Integer index;
	public Integer dimension;

	public SuitOfCards() {
		this.suit = new Card[52];
		index = 0;
		dimension=0;

	}

	public Integer setIndex(Integer position) {
		this.index = position;
		return this.index;
	}

	public void setSuit(Card[] suit) {
		this.suit = suit;
	}

	public char[] getSuit(char[] suit) {
		return suit;
	}

	@Override
	public boolean hasNext() {
		if (this.index < 0 && this.index >= 12) {
			return false;
		}
		return true;
	}

	@Override
	public Card next() {
		if (this.index >= 0 && index < 12) {
			return suit[++index];
		} else {
			return null;
		}
	}

	@Override
	public int put(Comparable<Card> comparable) {
		if (comparable instanceof Card && dimension < 52) {
			if(((Card)comparable).getCardNumber()=="0"){
				System.out.println("This card can not be added");
				return -1;
			}
			for (int i = 0; i < dimension; i++) {
				if (suit[i].compareTo((Card) comparable)==0) {
					System.out.println("This card already exists");
					return -1;
				}
			}
			int j = 0;
			while (comparable.compareTo(suit[j]) > 0) {
					j++;
				}
			for (int i = dimension+1; i > j; i--)
				suit[i] = suit[i - 1];
			suit[j]=(Card) comparable;
			dimension++;
			return j;
		}
			return -1;
	}
	
	public void showCards() {
		for(int i=0;i<dimension;i++) {
			System.out.println("Card number: "+suit[i].getCardNumber()+" Colour: "+suit[i].getSuitName());
		}
	}

}
