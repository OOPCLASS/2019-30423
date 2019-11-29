package assignment_03.cards;

public class DeckIterator implements OrderedIterator<Card> {
    private Deck deck;
    private int index = 0;
    private boolean wasDeleted = false;

    public DeckIterator(Deck deck) {
        this.deck = deck;
    }

    @Override
    public boolean hasNext() {
        return index < deck.size();
    }

    @Override
    public Card next() {
        wasDeleted = false;
        return deck.get(index++);
    }

    @Override
    public void remove() {
        if (index == 0 || wasDeleted)
            throw new IllegalStateException();
        deck.remove(index - 1);
        wasDeleted = true;
        index--;
    }

    @Override
    public int put(Comparable comparable) {
        if (!(comparable instanceof Card))
            throw new ClassCastException();
        return deck.addInOrder((Card) comparable);
    }
}
