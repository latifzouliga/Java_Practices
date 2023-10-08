package day34_Abstraction.carTask;

public class Nio extends Car implements AutoPark, AutoPilot{

    public Nio(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("you need to figue out how to start "+getMake()+ " "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Unplug power cable to force "+getMake()+" "+ getModel()+" to stop");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+ getModel()+ " autoParks quietly");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+ " "+ getModel()+ " autoPilot feature still not full featured");
    }
}
