
public class Building {

	public Integer i = 0;
	Adress adress = new Adress();
	Floor[] floors = new Floor[10];

	public void addFloor(Floor floor) {

		floors[i++] = floor;

	}

	public void getDetails(Building building) {

		System.out.println("The adress of the building is: ");
		adress.printAdress();
		int j = 0;
		System.out.println("Floors: ");
		while (j < 10) {
			building.floors[j].printFloor(j, building.floors[j]);
			j++;
		}
	}
}
