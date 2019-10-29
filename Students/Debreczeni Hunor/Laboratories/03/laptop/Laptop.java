package laptop;

public class Laptop {

    private String brandName = "ASUS";
    protected int memorySize;

    public Laptop(){

    }

    public void setBrandName(String brandName) {
        if(!brandName.equals("Dacia")){
            this.brandName = brandName;
        }
    }

    public String getBrandName() {
        return brandName;
    }

    public void bootUp(){
        //
    }

    public void bootUp(String message){
        System.out.println(message);
    }
}
