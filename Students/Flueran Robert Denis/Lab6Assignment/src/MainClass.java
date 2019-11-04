
public class MainClass {

	public static void main(String[] args) {
		
		DeckClass cardDeck = new DeckClass(13);
		DeckClass lilCard = new DeckClass(13);
		lilCard.cards[0] = new CardClass('9', "Hearts");
		cardDeck.cards[0] = new CardClass();
		cardDeck.cards[1] = new CardClass();
		cardDeck.cards[2] = new CardClass('7', "Diamonds");
		cardDeck.cards[3] = new CardClass('6', "Hearts");
		cardDeck.cards[4] = new CardClass('X', "Clubs");
		cardDeck.cards[5] = new CardClass('9', "Diamonds");
		cardDeck.cards[6] = new CardClass('A', "Hearts");
		cardDeck.cards[7] = new CardClass('6', "Spades");
		cardDeck.cards[8] = new CardClass('J', "Clubs");
		cardDeck.cards[9] = new CardClass('8', "Hearts");
		cardDeck.cards[10] = new CardClass('Q', "Spades");
		cardDeck.cards[11] = new CardClass('K', "Diamonds");
		cardDeck.cards[12] = new CardClass('7', "Spades");
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.cards[0].compare(cardDeck.cards[1]));
		cardDeck.remove();
		cardDeck.put(lilCard.cards[0]);
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.next());
		System.out.println("Iterator:" + cardDeck.getIterator());
		System.out.println("noOfCards:" + cardDeck.getNoOfCards());
		System.out.println(cardDeck.next());
		System.out.println(cardDeck.hasNext());
	}
}
