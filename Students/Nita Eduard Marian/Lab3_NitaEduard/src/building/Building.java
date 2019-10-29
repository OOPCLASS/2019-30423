package building;
public class Building {
	private int indexFloors = 0;
	public Address address = new Address(null, null, null);
	public Floor[] floors = new Floor[10];
	
	public Building(Address myAddress) {
		this.address = myAddress;
	}
	
	public void addFloor(Floor myFloor) {
		this.floors[indexFloors ++] = myFloor;
	}
}
