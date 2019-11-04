package sorting;

public class Dog implements Comparable {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public boolean compare(Comparable objectToCompareTo) throws IllegalArgumentException {
        if (objectToCompareTo instanceof Dog) {
            if (this.name.compareTo(((Dog) objectToCompareTo).getName()) > 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Wrong instance to be compared!");
    }

    public String getName() {
        return name;
    }
}
