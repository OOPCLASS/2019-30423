package building;

public class Room {
    public Integer number;
    public Double area;

    public Room(Integer roomNumber, Double roomArea) {
        number = roomNumber;
        area = roomArea;
        System.out.println("New room created");
    }
}