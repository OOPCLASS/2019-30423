package building;

public class Address {
    private String street;
    private  Integer number;
    private String city;

    public Address(String street, Integer number,String city){
        this.street = street;
        this.number = number;
        this.city = city;
    }
    public String getStreet()
    {
        return  street;
    }
    public Integer getNumber() {
        return number;
    }
    public String getCity() {
        return city;
    }
}
