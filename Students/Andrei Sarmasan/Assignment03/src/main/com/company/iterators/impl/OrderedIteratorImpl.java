package com.company.iterators.impl;

import com.company.classes.Card;
import com.company.iterators.OrderedIterator;

public class OrderedIteratorImpl extends IteratorImpl implements OrderedIterator {
    @Override
    public int put(Comparable comparable) {
        cursor = -1;
        while (super.hasNext()) {
            final Card currentCard = super.next();
            if(currentCard.compareTo((Card) comparable) == 0) {
                return 0;
            }
            else if(currentCard.compareTo((Card) comparable) < 0) {
                cursor--;
                break;
            }
        }
        cards.add(cursor + 1, (Card) comparable);
        return cursor;
    }
}
