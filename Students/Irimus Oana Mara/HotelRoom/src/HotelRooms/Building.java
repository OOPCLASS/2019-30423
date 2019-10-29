package HotelRooms;

public class Building {
	public Address address;
	public Floor[] floors = new Floor[10];
	
	public int floorIndex;

	public Building(Address address) {
		
		this.address = address;
		floorIndex = 0;
	}
	
	public void addFloor(Floor floor) {
		
		floors[floorIndex++] = floor;
	}
}
