package Cards;

public class CardClass implements Comparable {
	
	char deckNr;
	String suit;
	
	CardClass()
	{
		
		deckNr = '7';
		suit = "Diamonds";
	}

	CardClass(char deckNr, String suit)
	{
		this.deckNr = deckNr;
		this.suit = suit;
	}
	@Override
	public boolean compare(Comparable objToCompare) {
		if(objToCompare instanceof CardClass)
		{
			CardClass temp = (CardClass) objToCompare;
			if(suit.compareTo(temp.suit) == 0 && deckNr == temp.deckNr)
			{
				return true;
			}
		}
		return false;
	}

}
