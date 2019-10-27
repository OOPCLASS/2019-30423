package building;

public class Floor {
    private Integer number;
    private Rooms[] room;
    private final Integer numberOfRooms = 100;
    private Integer roomIndex=0;

    public Floor() {
        room = new Rooms[numberOfRooms];
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void addRoom(Rooms room) {
        if(numberOfRooms > roomIndex) {
            this.room[roomIndex++]=room;
        }
    }

    public Integer getNumber() {
        return number;
    }

    public Rooms getRoomAtIndex(Integer index) {
        if(index <roomIndex && index > 0)
            return room[index];
        return null;
    }

    public Rooms[] getRoom() {
        return room;
    }
}
