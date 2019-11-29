package lab_05.model;

import lab_05.sorting.Comparable;

public class Dog implements Comparable {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public int compare(Comparable objectToCompareTo) {
        if (objectToCompareTo == null)
            return 0;

        if (objectToCompareTo instanceof Dog) {
            if(((Dog) objectToCompareTo).name == null)
                return 0;
            if(this.name == null)
                return 1;
            return name.compareTo(((Dog) objectToCompareTo).name);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Dog{name = " + name + "}";
    }
}
