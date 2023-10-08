package day34_Abstraction.carTask;


import java.util.ArrayList;
import java.util.Arrays;

public class CarShop {

    public static void main(String[] args) {


        Audi audi = new Audi("X13", "White", 2020, 45000);
        Audi audi1 = new Audi("X13", "Black", 2020, 45000);
        BMW bmw = new BMW("GK11","Gray", 2019, 40000);
        Honda honda = new Honda("Accord","White", 2022, 30000 );
        Mercedes mercedes = new Mercedes("C200", "Blue",2017, 50000 );
        Toyota toyota = new Toyota("Camry", "Green",2016, 25000);
        Nio nio = new Nio("J19K", "Purple",2020, 33000);
        Tesla tesla = new Tesla("Model X","White" ,2020, 50000 );
        CydeoCar cydeoCar = new CydeoCar("Model Java", "Red",2020, 50000 );

        System.out.println(audi.equals(audi));

        // saving car objects in Array and converting them in ArrayList
        //Car[] cars = {audi, bmw, honda, mercedes, toyota, nio, tesla, cydeoCar};
        //ArrayList<Car> cars1 = new ArrayList<>(Arrays.asList(cars));

        // saving car objects in ArrayList
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(audi, bmw, honda, mercedes, toyota, nio, tesla, cydeoCar));
        //converting ArrayList to an array
        Car[] cars1 = cars.toArray(new Car[0]);

        System.out.println("Cars price based on make and model:");
        // accessing array objects
        for (Car each : cars1) {
            System.out.println(each.getMake()+" "+ each.getModel()+ " : $"+ each.getPrice());
        }

        System.out.println("-----------------------------------------------------------------");
        audi.drive();
        bmw.drive();
        honda.drive();
        mercedes.drive();
        toyota.drive();
        nio.drive();
        tesla.drive();
        cydeoCar.drive();

        System.out.println("-----------------------------------------------------------------");

        tesla.autoPark();
        tesla.selfDrive();
        nio.autoPark();
        nio.selfDrive();

        System.out.println("-----------------------------------------------------------------");

        cydeoCar.fly();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();

        System.out.println("-----------------------------------------------------------------");



    }
}
