package lab_05.sorting;

public class Arrays {
    public static void sort(Comparable[] elements) {
        Comparable key;
        int j;
        for (int i = 1; i < elements.length; i++) {
            key = elements[i];
            j = i - 1;
            while (j >= 0 && elements[j].compare(key) > 0) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = key;
        }
    }
}
