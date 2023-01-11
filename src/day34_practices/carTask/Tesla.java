package day34_practices.carTask;

public class Tesla extends Car implements AutoPark,AutoPilot{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("Say start babe to start "+getMake()+ " "+ getModel());
    }
    @Override
    public void drive(){
        System.out.println(getMake()+ " "+ getModel()+ " is driving and dancing");
    }

    @Override
    public void autoPark() {
        System.out.println("Say autoPark babe to make "+getMake()+" "+getModel()+" park");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+ getModel()+ " has a beautiful self drive mode ");
    }
}
