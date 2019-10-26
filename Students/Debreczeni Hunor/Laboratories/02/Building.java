public class Building {

    private static final int MAX_FLOOR_NR = 30;
    private Integer floorNumber;
    private Address address;
    private Floor[] floors;

    public Building() {
        this.floors = new Floor[MAX_FLOOR_NR];
        this.floorNumber = 0;
    }

    public Floor[] getFloors() {
        return this.floors;
    }

    public void setFloors(Floor[] floors) {
        floorNumber = floors.length;
        this.floors = floors;
    }

    public void addFloor(Floor floor) {
        this.floors[floorNumber] = floor;
        floorNumber++;
    }

    public void addFloors(Floor[] floors) {
        for (int i = 0; i < floors.length; i++) {
            this.floors[floorNumber] = floors[i];
            floorNumber++;
        }
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
