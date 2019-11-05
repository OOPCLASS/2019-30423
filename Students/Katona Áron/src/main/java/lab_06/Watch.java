package lab_06;

public class Watch {

    private String brandName;
    private Double price;

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

    @Override
    public String toString() {
        return "Watch{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
}
