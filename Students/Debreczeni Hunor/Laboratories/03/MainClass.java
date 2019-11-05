import betterlaptop.GamingLaptop;
import laptop.Laptop;

public class MainClass {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.setBrandName("Dacia");

        Laptop newGamingLaptop = new GamingLaptop();
        GamingLaptop gamingLaptop = new GamingLaptop();

        gamingLaptop.setBrandName("ASUS");
        gamingLaptop.setDedicatedGraphicsCardBrandName("NVidia");

        ((GamingLaptop)newGamingLaptop).test();
        System.out.println(gamingLaptop instanceof GamingLaptop);
        System.out.println(gamingLaptop instanceof Laptop);
        System.out.println(gamingLaptop instanceof Object);

        System.out.println(laptop.getBrandName() + gamingLaptop.getDedicatedGraphicsCardBrandName() + gamingLaptop.getBrandName());
    }
}
