
public class Watch {

	private String brandName;
	private Double price;
	
	public Watch(String brandName, Double price) {
		this.brandName = brandName;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
