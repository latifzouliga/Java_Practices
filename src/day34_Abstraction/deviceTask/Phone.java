package day34_Abstraction.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long number){
        System.out.println(getBrand()+ " "+ getBrand()+ " is calling "+ number);
    }

    public void text(long number){
        System.out.println(getBrand()+ " "+ getBrand()+ " is texting "+ number);
    }


}
/*
2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()
 */
