package assignment_03;

import assignment_03.cards.Card;
import assignment_03.cards.Deck;
import assignment_03.cards.OrderedIterator;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Card card1 = new Card(Card.Suit.HEARTS, Card.Number.JACK);
        Card card2 = new Card(Card.Suit.SPADES, Card.Number.ACE);
        Card card3 = new Card(Card.Suit.HEARTS, Card.Number.FOUR);
        Card card4 = new Card(Card.Suit.CLUBS, Card.Number.THREE);
        deck.add(card1);
        deck.add(card2);
        deck.add(card3);

        OrderedIterator<Card> deckIterator = deck.iterator();

        printDeck(deck);

        while(deckIterator.hasNext())
        {
            Card card = deckIterator.next();
            if(card.getSuit() == Card.Suit.HEARTS)
            {
                deckIterator.remove();
            }
        }

        printDeck(deck);

        deckIterator = deck.iterator();
        deckIterator.put(card4);
        deckIterator.put(new Card(Card.Suit.CLUBS, Card.Number.EIGHT));
        deckIterator.put(new Card(Card.Suit.CLUBS, Card.Number.THREE));
        deckIterator.put(new Card(Card.Suit.CLUBS, Card.Number.TWO));

        printDeck(deck);
    }

    private static void printDeck(Deck deck)
    {
        System.out.print("Deck: ");
        for(Card card : deck)
        {
            System.out.print(card + " ");
        }
        System.out.println();
    }
}
