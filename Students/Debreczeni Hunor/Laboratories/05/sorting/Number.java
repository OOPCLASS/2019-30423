package sorting;

public class Number implements Comparable {

    private Integer value;

    public Number(Integer value) {
        this.value = value;
    }

    public boolean compare(Comparable objectToCompareTo) throws IllegalArgumentException {
        if (objectToCompareTo instanceof Number) {
            if (this.value < ((Number) objectToCompareTo).getValue()) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Wrong instance to be compared!");
    }

    public Integer getValue() {
        return value;
    }
}
