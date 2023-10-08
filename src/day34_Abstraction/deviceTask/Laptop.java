package day34_Abstraction.deviceTask;

public class Laptop extends Computer {

    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, String OS, int ssdSize, int ramSize) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, OS, ssdSize, ramSize);
    }

    @Override
    public void showInfo() {
        System.out.println(getBrand()+ " info:\nOperating System: "+getOS()+"\nRam size: "+getRamSize()+"\nSSD size: "+getSsdSize());
        System.out.println("Size: "+ getSize());
        System.out.println("has a battery: "+ isHasBattery());

    }

    @Override
    public void turnOn() {
        System.out.println("Push finger print button to turn on "+getBrand() + getBrand());
    }

    @Override
    public void turnOf() {
        System.out.println("Push finger print button to turn "+getBrand() + getBrand()+ " off");
    }
}

    /*
8. Create the following sub classes of Computer and add any extra methods that are needed:
        1. PersonalComputer:
        1. Desktop
        2. Laptop

 */