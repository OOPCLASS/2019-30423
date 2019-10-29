package lab_03.building;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private Address address;
    private List<Floor> floors;

    public Building() {
        this.address = null;
        this.floors = new ArrayList<>();
    }

    public Building(Address address, List<Floor> floors) {
        this.address = address;
        this.floors = floors;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Floor getFloor(int floorId) {
        return floors.get(floorId);
    }

    public void addFloor(Floor floor)
    {
        floors.add(floor);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address=" + address +
                ", floors=" + floors +
                '}';
    }
}
