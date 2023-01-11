package day34_practices.carTask;

public class BMW extends Car{


    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println(getMake()+ " "+ getModel()+ " push the brake and push start button");
    }

    @Override
    public void drive(){
        System.out.println(getMake()+ " "+ getModel()+ " is driving in comfort mode");
    }



}
