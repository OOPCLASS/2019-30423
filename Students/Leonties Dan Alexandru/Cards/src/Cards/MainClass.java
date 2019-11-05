package Cards;

public class MainClass {
	
	
	public static void main(String[] args)
	{
		DeckClass deckCard = new DeckClass(13);
		DeckClass smallCard = new DeckClass(13);
		
		smallCard.cards[0] = new CardClass('5', "Spades");


		deckCard.cards[0] = new CardClass();
		deckCard.cards[1] = new CardClass();
		deckCard.cards[2] = new CardClass('6',"Clubs");
		deckCard.cards[3] = new CardClass('3',"Clubs");
		deckCard.cards[4] = new CardClass('A',"Spades");
		deckCard.cards[5] = new CardClass('2',"Diamonds");
		deckCard.cards[6] = new CardClass('J',"Hearts");
		deckCard.cards[7] = new CardClass('8',"Diamonds");
		deckCard.cards[8] = new CardClass('4',"Clubs");
		deckCard.cards[9] = new CardClass('K',"Clubs");
		deckCard.cards[10] = new CardClass('9',"Spades");
		deckCard.cards[11] = new CardClass('Q',"Hearts");
		deckCard.cards[12] = new CardClass('7',"Spades");
		System.out.println(deckCard.next());
		System.out.println(deckCard.cards[0].compare(deckCard.cards[1]));
		
		deckCard.remove();
		deckCard.remove();
		
		deckCard.put(smallCard.cards[0]);
		
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		System.out.println(deckCard.next());
		
		
		System.out.println("Iterator:" + deckCard.getInterator());
		System.out.println("nrCards:" + deckCard.getNrCards());
		System.out.println(deckCard.next());
		System.out.println(deckCard.hasNext());
		
		
		
		
		
		
		
	}
	
	

}
