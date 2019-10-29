import java.util.Scanner;

public class MainClass
{
	public static void main(String[] args)
	{
		Building building = new Building();	//create building
		Address address = new Address();	//create address
		
		Scanner scanner = new Scanner(System.in);	
		System.out.print("Insert city: ");			//read city
		address.city = scanner.nextLine();
		System.out.print("Insert street: ");		//read street
		address.street = scanner.nextLine();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Insert addressNumber: ");	//read address number
		address.addressNumber = keyboard.nextInt();
		
		building.setAddress(address);	//set the address of the building
		
		System.out.print("Insert the number of floors of the building: ");
		int nrFloorsOfBuilding = keyboard.nextInt();
		System.out.print("Insert the number of rooms per floor: ");
		int nrRoomsPerFloor = keyboard.nextInt();
		System.out.print("\n");
		
		for (int i = 1; i <= nrFloorsOfBuilding; i++)
		{
			Floor floor = new Floor();	//create floor
			building.addFloor(floor);	//add floor to building
			System.out.print("Insert floor number: ");
			floor.floorNumber = keyboard.nextInt();

			for (int j = 1; j <= nrRoomsPerFloor; j++)
			{
				Room room = new Room();	//create room
				floor.addRoom(room);	//add room to floor
				System.out.print("\tInsert room number: ");
				room.roomNumber = keyboard.nextInt();
				System.out.print("\tInsert area of room number " + room.roomNumber + ":");
				room.roomArea = keyboard.nextDouble();
				System.out.print("\n");
			}
		}
		building.describeYourself(nrRoomsPerFloor);
	}
}
