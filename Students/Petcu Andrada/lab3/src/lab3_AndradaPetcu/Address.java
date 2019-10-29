package lab3_AndradaPetcu;

public class Address {
	public String street;
	public Integer number;
	public String city;
	
	public Address(String streetAddr, Integer numberAddr, String cityAddr) {
		street = streetAddr;
		number = numberAddr;
		city = cityAddr;
		System.out.println("New address created");
	}

}
