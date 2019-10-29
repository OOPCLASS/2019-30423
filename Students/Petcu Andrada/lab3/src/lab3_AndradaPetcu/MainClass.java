package lab3_AndradaPetcu;

public class MainClass {
	public static void main(String[] args) {
		Room room1 = new Room(100, 123.00);
		Address street1 = new Address("Observator", 1, "Cluj-Napoca");
		Room room2 = new Room(101, 123.00);
		Floor floor1 = new Floor(1);
		floor1.addRoom(room1);
		floor1.addRoom(room2);
		System.out.println(floor1.toString());
		Building building1 = new Building();
		building1.buildingAddress = street1;
		building1.addFloors(floor1);
		System.out.println(building1.toString());
	}
}
