package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {

    public static void sortList(ArrayList<Dog> elements) {
        for (int i = 0; i < elements.size() - 1; i++) {
            for (int j = i; j < elements.size(); j++) {
                if (elements.get(i).compare(elements.get(j))) {
                    Collections.swap(elements, i, j);
                }
            }
        }
    }

    public static void sortArray(Comparable[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i; j < elements.length; j++) {
                if (elements[i].compare(elements[j])) {
                    Comparable temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }
}
