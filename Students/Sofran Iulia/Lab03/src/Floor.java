
public class Floor
{
	public Integer floorNumber;
	public Room[] floorRooms = new Room[10];
	private int roomIndex = 0;
	
	public void addRoom(Room room)
	{
		floorRooms[roomIndex ++] = room;
	}
	
	/*
	public Floor()
	{
		floorNumber = null;
		floorRooms = null;
	}
	*/
}
