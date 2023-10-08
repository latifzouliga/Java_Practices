package day34_Abstraction.deviceTask;

public class PersonalComputer extends Computer {

    public PersonalComputer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, String OS, int ssdSize, int ramSize) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, OS, ssdSize, ramSize);
    }

    @Override
    public void showInfo() {
        System.out.println(getBrand()+ " info:\nOperating System: "+getOS()+"\nRam size: "+getRamSize()+"\nSSD size: "+getSsdSize());
    }

    @Override
    public void turnOn() {
        System.out.println("Push button to turn "+getBrand() + getBrand()+" on");
    }

    @Override
    public void turnOf() {
        System.out.println("Say 'Cortana turn computer off ' to turn "+getBrand() + getBrand()+" off");
    }
}
/*
8. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer:
				1. Desktop
				2. Laptop
 */