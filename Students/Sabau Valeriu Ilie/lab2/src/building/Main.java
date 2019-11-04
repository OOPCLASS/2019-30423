package building;

import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Building scoala = new Building();

        scoala.setAddress(new Address("baririu", 24, "Cluj"));
        Floor[] etaje = new Floor[4];
        for (int i = 0; i < 4; i++) {
            etaje[i] = new Floor();
            etaje[i].setNumber(i);
            Rooms[] camere = new Rooms[10];
            for (int j = 0; j < 10; j++) {
                camere[j] = new Rooms(i * 100 + j, 20.0);
                etaje[i].addRoom(camere[j]);
            }
            scoala.addFloor(etaje[i]);
        }
        System.out.println("la etajul " + scoala.getFloor()[1].getNumber() + "exista camera" + scoala.getFloor()[1].getNumber());
    }
}
