package building;

public class Building {

    private Integer indexFloors=0;
    private Address address;
    private Floor []floor;
    private final Integer numberOfFloors = 100;
    Building() {

        this.floor= new Floor[numberOfFloors];
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addFloor(Floor floor) {
        if(numberOfFloors > indexFloors)
            this.floor[indexFloors++] = floor;
    }
    public Floor[] getFloor() {
        return floor;
    }

    public Address getAddress() {
        return address;
    }

    public Integer getIndexFloors() {
        return indexFloors;
    }
}
