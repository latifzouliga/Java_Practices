package day34_Abstraction.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("touch the screen to star "+getMake()+ " "+ getModel());

    }
    @Override
    public void drive(){
       System.out.println(getMake()+ " "+ getModel()+ " is in sport drive mode");
    }

    @Override
    public void autoPark(){
        System.out.println(getMake()+ " "+ getModel()+" has autoPark feature");
    }




}
