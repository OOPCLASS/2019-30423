package lab_03;

import lab_03.building.Address;
import lab_03.building.Building;
import lab_03.building.Floor;
import lab_03.building.Room;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Room r1 = new Room(101, 101.0);
        Room r2 = new Room(102, 102.0);
        Room r3 = new Room(201, 201.0);
        Floor f1 = new Floor(1);
        Floor f2 = new Floor(2);
        Address address = new Address("Jake st.", 53, "New York");
        Building building1 = new Building();

        f1.addRoom(r1);
        f1.addRoom(r2);
        f2.addRoom(r3);
        building1.addFloor(f1);
        building1.addFloor(f2);
        building1.setAddress(address);

        System.out.println(building1);


        Building building2 = new Building(
                new Address("Bob st.", 11, "Toronto"),
                List.of(
                        new Floor(1, List.of(
                                new Room(101, 101.0),
                                new Room(102, 102.0),
                                new Room(103, 103.0)
                        )),
                        new Floor(2, List.of(
                                new Room(201, 201.0),
                                new Room(202, 202.0),
                                new Room(203, 203.0)
                        )),
                        new Floor(3, List.of(
                                new Room(301, 301.0)
                        ))
                )
        );

        System.out.println(building2);
    }
}
