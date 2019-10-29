package sorting;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Dog> dogsList = new ArrayList<>();

        Dog Tom = new Dog("Tom");
        Dog Jack = new Dog("Jack");
        Dog Michael = new Dog("Michael");
        Dog Albert = new Dog("Albert");

        dogsList.add(Tom);
        dogsList.add(Jack);
        dogsList.add(Michael);
        dogsList.add(Albert);

        Arrays.sortList((ArrayList<Dog>) dogsList);

        for (Dog dog : dogsList) {
            System.out.println(dog.getName());
        }
        System.out.println();

        Dog[] dogsArray = new Dog[5];
        dogsArray[0] = Tom;
        dogsArray[1] = Jack;
        dogsArray[2] = Michael;
        dogsArray[3] = Albert;
        dogsArray[4] = Tom;

        Arrays.sortArray(dogsArray);

        for (int i = 0; i < dogsArray.length; i++) {
            System.out.println(dogsArray[i].getName());
        }

        Number[] numbersArray = new Number[5];

        numbersArray[0] = ;
        numbersArray[1] = ;
        numbersArray[2] = ;
        numbersArray[3] = ;
        numbersArray[4] = ;
        //... not finished

    }
}