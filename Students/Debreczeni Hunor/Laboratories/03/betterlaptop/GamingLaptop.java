package betterlaptop;

import laptop.Laptop;

public class GamingLaptop extends Laptop {
    private String dedicatedGraphicsCardBrandName;

    public GamingLaptop(){

    }

    public String getDedicatedGraphicsCardBrandName() {
        return dedicatedGraphicsCardBrandName;
    }

    public void setDedicatedGraphicsCardBrandName(String dedicatedGraphicsCardBrandName) {
        this.dedicatedGraphicsCardBrandName = dedicatedGraphicsCardBrandName;
    }

    public void test(){
        this.setBrandName("Razer");
        memorySize = 8000;
    }

    @Override
    public void bootUp(){
        //
    }
}
