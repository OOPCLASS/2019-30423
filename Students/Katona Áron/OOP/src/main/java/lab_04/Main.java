package lab_04;

import lab_04.animal.Hamster;
import lab_04.animal.Mouse;
import lab_04.animal.Rodent;
import lab_04.animal.Squirrel;


public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = {new Rodent(), new Hamster(), new Squirrel(), new Mouse(), new Hamster()};
        for(Rodent rodent : rodents){
            rodent.talk();
        }
    }
}
