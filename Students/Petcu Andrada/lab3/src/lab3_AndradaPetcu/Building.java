package lab3_AndradaPetcu;

import java.util.Vector;

public class Building {
	public Address buildingAddress  = new Address(null, null, null);
	public Vector<Floor> floors = new Vector<Floor>();
	
	public Building ()
	{
		System.out.println("New building created");
	}
	
	public void addFloors(Floor floor) {
		floors.add(floor);
	}
	
	@Override
	public String toString() {
		String result = "Building address: " + buildingAddress.city + ", street: " + buildingAddress.street + ", number: " + buildingAddress.number;
		if(floors.isEmpty() == false)
		{
			for(int i = 0; i < floors.size(); i++)
			{
				var floor = floors.get(i);
				result = result + " Floor number: " + floor.number + ";";
				for(int j = 0; j < floor.rooms.size(); j++)
				{
					var room = floor.rooms.get(j);
					result = result + " Room number: " + room.number + " Room area: " + room.area;
				}
			}
		}
		return result;
	}

}
