package day34_practices.deviceTask;

public class Google extends Phone implements Downloadable,AndroidApps{

    public Google(String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Push button to turn on "+getBrand()+ " "+ getBrand());
    }

    @Override
    public void turnOf() {
        System.out.println("Push home button 10 seconds to turn off "+ getBrand()+ " "+ getBrand());
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+ " "+ getBrand()+ " is downloading system "+OS +" updates from "+ appStoreName);

    }
}
/*
4. Google:
		extends Phone class and implements Downloadable & AndroidApps interfaces

 */