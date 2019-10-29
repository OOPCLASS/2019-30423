public class Floor {
    private static final int MAX_ROOM_NR = 30;
    private Integer number;
    private Room[] rooms;
    private Integer roomNumber;

    public Floor() {
        this.rooms = new Room[MAX_ROOM_NR];
        this.roomNumber = 0;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        this.rooms[this.roomNumber++] = room;
    }
}
