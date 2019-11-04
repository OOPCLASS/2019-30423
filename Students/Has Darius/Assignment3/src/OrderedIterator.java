import java.util.Iterator;

public interface OrderedIterator extends Iterator<Card>{
	int put(Comparable<Card> comparable);
	

}
