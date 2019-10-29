public class Address {
    private String street;
    private Integer number;
    private String city;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Integer getNumber() {
        return number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
