import building.*;

public class MainClass {
	public static void main(String[] args) {
		Address acasa = new Address("strAcasa", 10, "orasAcasa");
		Room camera = new Room(10, 10.5);
		Floor parter = new Floor(0);
		parter.addRoom(camera);
		Building blocComunistSiTrist = new Building(acasa);
		blocComunistSiTrist.addFloor(parter);
		
		System.out.println(blocComunistSiTrist.address.street + " " + blocComunistSiTrist.address.number + " " + blocComunistSiTrist.address.city);
	}
}
