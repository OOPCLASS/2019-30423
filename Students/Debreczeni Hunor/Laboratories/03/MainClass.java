public class MainClass {
    public static void main(String[] args) {
        Room roomTen = new Room();
        roomTen.setArea(62.1);
        roomTen.setNumber(10);
        Floor firstFloor = new Floor();
        firstFloor.addRoom(roomTen);
        firstFloor.addRoom(roomTen);
        Building Vivo = new Building();
        Vivo.addFloor(firstFloor);
        for (Floor floor : Vivo.getFloors()) {
            if (floor != null) { // Gives NullErrorException because it goes through all the declared elements ( MAX_ROOM_NR )
                for (Room room : floor.getRooms()) {
                    if (room != null) { // Same
                        System.out.println(room.getNumber());
                    }
                }

            }
        }
    }
}