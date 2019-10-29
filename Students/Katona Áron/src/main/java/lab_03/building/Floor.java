package lab_03.building;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private Integer number;
    private List<Room> rooms;

    public Floor(Integer number) {
        this.number = number;
        this.rooms = new ArrayList<>();
    }

    public Floor(Integer number, List<Room> rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Room getRoom(int roomId) {
        return rooms.get(roomId);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public String toString() {
        return "Floor{" +
                "number=" + number +
                ", rooms=" + rooms +
                '}';
    }
}
