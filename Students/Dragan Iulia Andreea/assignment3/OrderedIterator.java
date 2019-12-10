package assignment3;
import java.util.Iterator;

public interface OrderedIterator extends Iterator<Card> {
	int put(Comparable comparable);
}
