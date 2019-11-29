package lab_05;

import lab_05.model.Dog;
import lab_05.sorting.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(null),
                new Dog("Jack"),
                new Dog("Sarah")
        };

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println();

        Arrays.sort(dogs);

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println();
    }
}
