package day34_Abstraction.deviceTask;

public class Desktop extends Computer{

    private boolean isUpGradable;

    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, String OS, int ssdSize, int ramSize, boolean isUpGradable) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, OS, ssdSize, ramSize);
        this.isUpGradable = isUpGradable;
    }

    public void setUpGradable(boolean isUpGradable){
        this.isUpGradable = isUpGradable;
    }

    public boolean getIsUpGradable(){
        return isUpGradable;
    }

    @Override
    public void showInfo() {
        System.out.println(getBrand()+ " info:\nOperating System: "+getOS()+"\nRam size: "+getRamSize()+"\nSSD size: "+getSsdSize());
        System.out.println("Upgradable: "+ isUpGradable);
    }

    @Override
    public void turnOn() {
        System.out.println("Plug "+getBrand() + getBrand()+" to turn it on");
    }

    @Override
    public void turnOf() {
        System.out.println("Unplug "+getBrand() + getBrand()+ " to turn it off");
    }
}
    /*
8. Create the following sub classes of Computer and add any extra methods that are needed:
        1. PersonalComputer:
        1. Desktop
        2. Laptop

 */