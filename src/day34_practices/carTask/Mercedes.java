package day34_practices.carTask;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("touch the screen to star and say start "+getMake()+ " "+ getMake());
    }

    @Override
    public void drive(){
        System.out.println(getMake()+ " "+ getModel()+" is jumping");

    }

    public void autoPark(){
        System.out.println(getMake()+" "+ getModel()+ " getting ready for autoParking");
    }





}
