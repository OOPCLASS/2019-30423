
public class Building
{
	public Address buildingAddress = new Address();
	public Floor[] buildingFloors = new Floor[10];
	private int floorIndex = 0;
	
	public void setAddress(Address address)
	{
		buildingAddress = address;
	}
	
	public void addFloor(Floor floor)
	{
		buildingFloors[floorIndex ++] = floor;
	}
	
	public void describeYourself(int nrOfRooms)
	{
		System.out.println("The address of the building is: " + buildingAddress.city + ", " + buildingAddress.street + ", " + buildingAddress.addressNumber);
		System.out.println("The building has " + floorIndex + " floors.");
		System.out.println("There are " + floorIndex*nrOfRooms + " rooms in total.");
	}
	
	/*
	public Building()
	{
		buildingAddress = null;
		buildingFloors = null;
	}
	*/
}
