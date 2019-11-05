public class Laptop {
    public int memorySize;
    private String brandName="ASUS";

    private  String dedicatedGraphicsCardBrandName;
    private boolean hasParallelPort;
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}
