package Cards;
import java.util.Iterator;

public class IteratorClass implements Iterator<Card>{
	
	protected Card[] cards;//={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	protected int indexCount;
	protected int dimension;
	public IteratorClass() {
		this.cards = new Card[52];
		indexCount=0;
		dimension=0;
	}
	public void resetIndex() {
		indexCount=0;
	}
	public int getIndex() {
		return indexCount;
	}
	public int getDimension() {
		return dimension;
	}
	
	public Card next() {
		return cards[indexCount++];
	}
	
	@Override
	public boolean hasNext() {
		if(indexCount+1<dimension) {
			return true;
		}
		return false;
	}
	public void remove(Card card) {
		int poz=getIndexOfCard(card);
		if(poz==-1) {
			System.out.println("Error. The card doesn't exist");
		}
		else
		{
			for(int i=poz;i<dimension-1;i++) {
				cards[i]=cards[i+1];
			}
			dimension--;
		}
	}
	private int getIndexOfCard(Card card) {
		for(int i=0;i<dimension;i++) {
			if(cards[i]==card) {
				return i;
			}
		}
		return -1;
	}
	
}