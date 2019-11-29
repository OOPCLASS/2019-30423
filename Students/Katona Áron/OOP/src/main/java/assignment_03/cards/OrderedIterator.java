package assignment_03.cards;

import java.util.Iterator;

public interface OrderedIterator<E> extends Iterator<E> {
    int put(Comparable comparable);
}
