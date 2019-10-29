package building;

public class Floor {
	private int roomsIndex = 0;
	public Integer number = null;
	public Room[] rooms = new Room[10];
	
	
	public Floor(Integer myNumber) {
		this.number = myNumber;
	}
	
	public void addRoom(Room myRoom) {
		this.rooms[roomsIndex ++] = myRoom;
	}
}
