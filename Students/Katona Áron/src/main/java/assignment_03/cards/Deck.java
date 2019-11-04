package assignment_03.cards;

import java.util.Objects;

public class Deck implements Iterable<Card> {
    private static final int maxSize = 13;
    private Card[] cards = new Card[maxSize];
    private int size = 0;

    public Deck() {
    }

    public int size() {
        return size;
    }

    public boolean add(Card card) {
        return add(size, card);
    }

    public int addInOrder(Card card) {
        Objects.requireNonNull(card);
        int index = 0;
        while (index < size() && get(index).compareTo(card) < 0) {
            index++;
        }
        if (index < size() && get(index).compareTo(card) == 0)
            return -1;
        if (add(index, card))
            return index;
        else
            return -1;
    }

    public boolean add(int index, Card card) {
        Objects.requireNonNull(card);
        if (size >= maxSize)
            throw new IllegalStateException();
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        for (int i = size; i > index; i--) {
            cards[i] = cards[i - 1];
        }
        cards[index] = card;
        size++;
        return true;
    }

    public Card get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return cards[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            cards[i] = cards[i + 1];
        }
        size--;
    }

    @Override
    public OrderedIterator<Card> iterator() {
        return new DeckIterator(this);
    }
}
