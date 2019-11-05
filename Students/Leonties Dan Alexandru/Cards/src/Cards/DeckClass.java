package Cards;

import java.util.Iterator;

public class DeckClass implements Iterator<Object>, OrderIterator {

	
	
	private int iterator = 0;
	private int nrCards;
	CardClass[] cards = new CardClass[1000];
	
	DeckClass(int nr)
	{
		nrCards = nr;
	}
	
	//@Override
	public boolean hasNext()
	{
		if(iterator >= nrCards - 1)
		{
			return false;
		}
		return true;
	}
	

	//@Override
	public Object next()	
	{
		if(iterator < nrCards - 1)
		{
			iterator++;
			return cards[iterator].deckNr + " " + cards[iterator].suit;
		}
		return "Array already ended";
	}

	
	public void remove()
	{
		System.out.println("The card with suit : " + cards[iterator].suit + " and number :" + cards[iterator].deckNr + " is going to be removed ");
		
		for(int i = iterator; i < nrCards - 1; i++)
		{
			cards[i] = cards[i+1];
		}
		nrCards--;
	}
	
	public int getInterator()
	{
		return iterator;
	}
	public int getNrCards()
	{
		return nrCards;
	}
	
	@Override
	
	public int put(Comparable objToCompare)
	{
		if(nrCards == 1000)
		{
			System.out.println(" The array already is already full ");
			return 0;
		}
		if(objToCompare instanceof CardClass)
		{
			CardClass temp = (CardClass) objToCompare;
			
			for(int i =0; i < nrCards; i++)
			{
				if(cards[i].compare(objToCompare))
				{
					System.out.println("Card is in the deck");
					return 0;
				}
			}
			
			nrCards++;
			cards[nrCards - 1] = new CardClass(temp.deckNr, temp.suit);
		}
		return 0;
	}

	

	

	

}
