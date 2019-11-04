import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int m;	//m = option variable for the menu
		Building myBuilding = new Building();
		
		for(int i = 0; i < 10; i++)
			myBuilding.floors[i] = new Floor();  			
		
		for(int i = 0; i < 10; i++)
			for(int j = 0; j < 10; j++)
				myBuilding.floors[i].rooms[j] = new Room();
		
		//myFloor.addRoom(myRoom);
		//myBuilding.adress = myAdress;
		//myBuilding.addFloor(myFloor);
		
		//myBuilding.getDetails();
		
		do {
			
			System.out.println("Choose an option: ");
			System.out.println("1. Add room to one floor");
			System.out.println("2. Change adress");
			System.out.println("3. Show building details");
			System.out.println("4. Close app");
			m = in.nextInt();
			
			if(m == 1) {
				System.out.print("What floor is the room in? ");
				myBuilding.floors[myBuilding.i].number = in.nextInt();
				System.out.print("Number of the room = ");
				myBuilding.floors[myBuilding.floors[myBuilding.i].number].rooms[myBuilding.floors[myBuilding.i].j].number = in.nextInt();
				System.out.print("Area of the room = ");
				myBuilding.floors[myBuilding.floors[myBuilding.i].number].rooms[myBuilding.floors[myBuilding.i].j].area = in.nextDouble();
				myBuilding.floors[myBuilding.floors[myBuilding.i].number].j++;
			}
			
			else if(m == 2) {
				
				System.out.println("What is the new adress?");
				System.out.println("City = ");
				in.nextLine();
				myBuilding.adress.city = in.nextLine();
				in.nextLine();
				System.out.println("Number = ");
				myBuilding.adress.number = in.nextInt();
				in.nextLine();
				System.out.println("Street = ");
				myBuilding.adress.street = in.nextLine();
			}

			else if(m == 3) {
				
				myBuilding.getDetails(myBuilding);
			}
			else if(m < 4 || m > 4) {
				
				System.out.println("You've got to choose one of the options");
			}
		} while(m != 4);
		in.close();
	}
}
