package main;

import java.io.CharArrayReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.NoSuchElementException;


public class CardDeck implements OrderIterator {
    private ArrayList<Card> deck;
    private int index = 0;

    public CardDeck() {
        deck = new ArrayList<Card>();
    }

    @Override
    public boolean hasNext() {
        return index < deck.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return deck.get(index++);
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void remove() {
        deck.remove(index);
    }

    @Override
    public void forEachRemaining(Consumer action) {
    }

    @Override
    public int put(Comparable comparable) {
        if (comparable == null)
            return 0;
        if (comparable instanceof Card) {
            Card card = (Card) comparable;
            if (card.isValid()) {
                boolean found = false;
                int position = 0;
                while (!found && position < deck.size()) {
                    Card afterCard = deck.get(position);
                    if (afterCard.compareTo(card) > 0) {
                        deck.add(position, card);
                        found = true;
                    }
                    position++;
                }

                if (!found)
                    deck.add(card);
            }

        }
        return 0;
    }
}
