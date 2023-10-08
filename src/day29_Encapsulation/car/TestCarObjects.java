package day29_Encapsulation.car;

public class TestCarObjects {

    public static void main(String[] args) {

        Honda honda = new Honda();
        honda.setInfo("Honda", "Accord",2020,"Navy",35000);

        Mercedes mercedes = new Mercedes();
        mercedes.setInfo("Mercedes","BT203",2017,"Black",29000);

        Toyota toyota = new Toyota();
        toyota.setInfo("Toyota","SRV",2022,"White",32000);

        Volvo volvo = new Volvo();
        volvo.setInfo("Volvo","4DV",2016,"Grey",44000);

        BMW bmw = new BMW();
        bmw.setInfo("BMW","Touring",2019,"Blue",40000);

        Audi audi = new Audi();
        audi.setInfo("Audi","Tanang",2018,"Red",38000);


        System.out.println(honda);
        System.out.println(mercedes);
        System.out.println(toyota);
        System.out.println(volvo);
        System.out.println(audi);

        mercedes.setPrice(39000);
        System.out.println(mercedes.getPrice());

        System.out.println(honda.getYear());

        System.out.println("------------------------------------------------------------------");

        // Engine sub-class
        Toyota.Engine toyota_1 = new Toyota.Engine(6,"Gasolline");
        System.out.println(toyota_1.getFuelType());


        Toyota.Engine toyota_2 = new Toyota.Engine(4,"Diesel");

        System.out.println(toyota_2.getFuelType());

        toyota_2.setNumberOfPistons(6);
        System.out.println(toyota_2.getNumberOfPistons());
        System.out.println(toyota+ " "+toyota_2);  // printing car info and Engine info

        Car.Engine toyEng = new Car.Engine(4,"diesel");
        System.out.println(toyEng);



    }


}
