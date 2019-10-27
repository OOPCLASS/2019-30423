package lab_03.building;

public class Room {
    private Integer number;
    private Double area;

    public Room(Integer number, Double area) {
        this.number = number;
        this.area = area;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", area=" + area +
                '}';
    }
}
