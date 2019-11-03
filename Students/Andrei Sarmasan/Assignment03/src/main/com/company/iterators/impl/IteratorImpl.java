package com.company.iterators.impl;

import com.company.classes.Card;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorImpl implements Iterator {

    protected List<Card> cards = new ArrayList<>();
    protected int cursor;

    @Override
    public boolean hasNext() {
        return cursor != cards.size() - 1;
    }

    @Override
    public Card next() {
        return cards.get(++cursor);
    }

}
