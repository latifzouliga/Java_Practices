package day34_Abstraction.deviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps{

    public Iphone(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+ " "+ getBrand()+ " is turning on");
    }

    @Override
    public void turnOf() {
        System.out.println("Push button and slide right to turn of "+getBrand()+ " "+ getBrand());
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+ getBrand()+" is downloading "+OS+" updates ");
        System.out.println(getBrand()+ " "+ getBrand()+ " is downloading facebook from "+AppStore);
    }
}
/*
1. Iphone :
	extends Phone class and implements Downloadable & AppleApps interfaces

 */