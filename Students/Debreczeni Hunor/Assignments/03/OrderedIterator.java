import java.util.Iterator;

public interface OrderedIterator<Type> extends Iterator<Type> {

    int put(Object obj);

}
