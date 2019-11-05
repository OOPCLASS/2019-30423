enum Suite {
	CLUBS, DIAMONDS, HEARTS, SPADES
}

public class MainClass {

	public static void main(String[] args) {

		System.out.println("########### FILLING DECK WITH ALL CARDS #############");
		MyCards deck = new MyCards();
		deck.generateDeck();
		deck.printDeck();

		System.out.println("########### DELETED 'X' OR '5' CARDS #############");
		Card myCard, myCardTwo;
		for (int i = 0; i < deck.myCards.size(); i++) {
			myCard = deck.myCards.get(i);
			if (myCard.getNumber().equals('X') || myCard.getNumber().equals('5')) {
				deck.remove(myCard);
			}
		}
		deck.printDeck();

		System.out.println("########### COMPARE TEST #############");
		myCard = deck.createDeckCard(Suite.SPADES, 'A');
		myCardTwo = deck.createDeckCard(Suite.CLUBS, 'A');
		System.out.println("Ace of spades greater than ace of clubs:" + (myCard.compare((Card) myCardTwo) == 1));
		myCard = deck.createDeckCard(Suite.SPADES, 'X');
		myCardTwo = deck.createDeckCard(Suite.CLUBS, 'A');
		System.out.println("Ten of spades greater than ace of clubs:" + (myCard.compare((Card) myCardTwo) == 1));

		System.out.println("########### CLEARED DECK OF CARDS #############");
		deck.clearDeck();

		System.out.println("########### PUT() CARDS IN DECK #############");
		deck.put(deck.createDeckCard(Suite.SPADES, 'X'));
		deck.put(deck.createDeckCard(Suite.HEARTS, 'X'));
		deck.put(deck.createDeckCard(Suite.SPADES, '9'));
		deck.put(deck.createDeckCard(Suite.SPADES, 'Q'));
		deck.put(deck.createDeckCard(Suite.SPADES, 'J'));
		deck.put(deck.createDeckCard(Suite.DIAMONDS, 'X'));
		deck.put(deck.createDeckCard(Suite.CLUBS, 'X'));
		deck.put(deck.createDeckCard(Suite.HEARTS, 'X'));

		deck.printDeck();
	}
}
