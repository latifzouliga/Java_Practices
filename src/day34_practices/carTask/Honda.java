package day34_practices.carTask;

public class Honda extends Car{

    public Honda(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println(getMake()+ " "+ getModel()+ " push the brake and twist the ignition key");
    }
    @Override
    public void drive(){
        System.out.println(getMake()+ " "+ getModel()+ " is in sport drive mode");
    }




}
