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

        for (Dog dog : dogsArray) {
            System.out.println(dog.getName());
        }

        Number[] numbersArray = new Number[5];

        Number one = new Number(1);
        Number two = new Number(2);
        Number three = new Number(3);
        Number four = new Number(4);
        Number five = new Number(5);

        numbersArray[0] = one;
        numbersArray[4] = two;
        numbersArray[3] = three;
        numbersArray[2] = four;
        numbersArray[1] = five;

        Arrays.sortArray(numbersArray);

        for(Number number : numbersArray){
            System.out.println(number.getValue());
        }
    }
}