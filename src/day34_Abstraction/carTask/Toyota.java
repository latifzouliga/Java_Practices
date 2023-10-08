package day34_Abstraction.carTask;

public class Toyota extends Car{
    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " "+ getModel()+ " twist the ignition key");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " is in jumping drive mode");
    }
}
