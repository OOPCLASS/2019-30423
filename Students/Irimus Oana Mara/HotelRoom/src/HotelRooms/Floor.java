package HotelRooms;

public class Floor {
	public Integer number;
	public Room[] rooms = new Room[100];
	
	private int roomIndex;
	
	public Floor(Integer number) {
		
		this.number = number;
		roomIndex = 0;
	}
	
	public void addRoom(Room room) {
		
		rooms[roomIndex++] = room;
	}
}
