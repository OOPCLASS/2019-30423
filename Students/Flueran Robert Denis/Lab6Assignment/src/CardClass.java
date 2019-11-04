
public class CardClass implements Comparable {
	
	char deckNumber;
	String suit;
	
	CardClass(){
		deckNumber = '5';
		suit = "Spades";
	}
	CardClass(char deckNumber, String suit){
		this.deckNumber = deckNumber;
		this.suit = suit;
	}
	@Override
	public boolean compare(Comparable objToCompare) {
		if(objToCompare instanceof CardClass) {
			CardClass temp = (CardClass) objToCompare;
			if(suit.compareTo(temp.suit) == 0 && deckNumber == temp.deckNumber) {
				return true;
			}
		}
		return false;
	}
}
