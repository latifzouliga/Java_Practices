package day34_Abstraction.carTask;

public class CydeoCar extends Car implements AutoPark,AutoPilot, Flyable{

    public CydeoCar(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say hello Java to start "+getMake()+ " "+ getModel());
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " "+ getModel()+ " driving student to a better future");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " "+getModel()+ " autoPark when students arrive to there destination");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " "+getModel()+ " has self drive feature for its students");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " "+getModel()+ " is flying t new horizons");
    }
}
