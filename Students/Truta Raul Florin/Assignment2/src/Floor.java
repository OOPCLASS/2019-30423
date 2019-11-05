
public class Floor {

	public Integer j = 0;
	public Integer number;
	Room[] rooms = new Room[10];
	
	public void addRoom(Room room, int i) {

		rooms[i] = room;
	}

	public void printFloor(int nr, Floor floor) {
 
		int j = 0;
		System.out.println("Rooms on floor " + nr + ": ");
		while (floor.rooms[j].number != null) {
			floor.rooms[j].printRoom();
			j++;
		}
	}

}
