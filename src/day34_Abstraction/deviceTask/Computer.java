package day34_Abstraction.deviceTask;

public abstract class Computer extends Device{
    private final String OS;
    private int ssdSize;
    private int ramSize;

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton, String OS, int ssdSize, int ramSize) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
        this.OS = OS;
        this.ssdSize = ssdSize;
        this.ramSize = ramSize;
    }

    public abstract void showInfo();

    public String getOS() {
        return OS;
    }

    public int getSsdSize() {
        return ssdSize;
    }

    public void setSsdSize(int ssdSize) {
        if (ssdSize <= 0){
            System.err.println("Invalid number");
            System.exit(1);
        }
        this.ssdSize = ssdSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        if (ramSize <= 0){
            System.err.println("Invalid number");
            System.exit(1);
        }
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", OS: " + OS +
                ", ssdSize: " + ssdSize +
                ", ramSize: " + ramSize;
    }
}
/*
3. Create a child abstract class of Device named Computer:

					Add any extra methods if needed
 */