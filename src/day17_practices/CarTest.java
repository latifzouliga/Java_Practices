package day17_practices;

public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car();


        car1.make = "Nissan";
        car1.model = "Muranu";
        car1.color = "White";
        car1.year = 2015;
        car1.price = 20000;

        Car carHonda = new Car();
        carHonda.setInfo("Honda","Accord",2022,"Black",40000);


        System.out.println(car1);
        System.out.println(carHonda);



    }
}
