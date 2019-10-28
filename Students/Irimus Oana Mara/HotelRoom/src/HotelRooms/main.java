package HotelRooms;

public class main {

	public static void main(String[] args) {
		Address address0 = new Address("Cluj", 12, "Plopilor");
		Address address1 = new Address("Baia Mare", 4, "Ioan Slavici");
		Address address2 = new Address("Bucuresti", 55, "Calea Victoriei");
		
		Room room0 = new Room(10, 55);
		Room room1 = new Room(11, 25);
		Room room2 = new Room(12, 68);		
		Room room3 = new Room(20, 55);		
		Room room4 = new Room(30, 33);
		Room room5 = new Room(31, 25);
		Room room6 = new Room(40, 46);
		Room room7 = new Room(41, 102);
		
		Building b0 = new Building(address0);
		Building b1 = new Building(address1);
		Building b2 = new Building(address2);
		
		
		Floor f0 = new Floor(0);
		Floor f1 = new Floor(1);
		Floor f2 = new Floor(2);
		Floor f3 = new Floor(3);
		
		
		f0.addRoom(room0);
		f0.addRoom(room1);
		f0.addRoom(room2);
		f1.addRoom(room3);
		f2.addRoom(room4);
		f2.addRoom(room5);
		f3.addRoom(room6);
		f3.addRoom(room7);
		
		
		b0.addFloor(f0);
		b0.addFloor(f1);
		
		b1.addFloor(f0);
		b1.addFloor(f1);
		b1.addFloor(f2);
		
		b2.addFloor(f0);
		b2.addFloor(f1);
		b2.addFloor(f2);
		b2.addFloor(f3);
		
		System.out.println("Floor indexes:");
		System.out.println(b0.floorIndex);
		System.out.println(b1.floorIndex);
		System.out.println(b2.floorIndex);

	}

}
