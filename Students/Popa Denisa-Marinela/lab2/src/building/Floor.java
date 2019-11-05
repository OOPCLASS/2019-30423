package building;
import java.util.Vector;
public class Floor {
    public Integer number;
    public Vector<Room> rooms = new Vector<Room>();

    public Floor(Integer floorNumber) {
        this.number = floorNumber;
        System.out.println("New floor created");
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public String toString() {
        var result = "Floor number: " + number;
        if(rooms.isEmpty() == false)
        {
            for(int i = 0; i < rooms.size(); i++)
            {
                // I used rooms.get because this instance is of type vector and id doesn't work with rooms[i] like a typical array
                var room = rooms.get(i);
                result = result + " Room number: " + room.number + " area:" + room.area;
            }
        }
        return result;
    }

}