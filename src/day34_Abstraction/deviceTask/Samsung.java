package day34_Abstraction.deviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps{
    public Samsung(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Say Hi to turn on "+getBrand()+ " "+ getBrand());
    }

    @Override
    public void turnOf() {
        System.out.println("Say good bye to turn off "+getBrand()+ " "+ getBrand());
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+ getBrand()+" is downloading "+OS+" updates ");
        System.out.println(getBrand()+" "+ getBrand()+ " is using "+appStoreName+ " to install instagram");
    }
}
/*
2. Samsung:
		extends Phone class and implements Downloadable & AndroidApps interfaces

 */