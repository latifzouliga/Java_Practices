package day25_constructor;

public class TestPizzaObjects {

    public static void main(String[] args) {

        Pizza small = new Pizza('s',3,3);

        System.out.println(small);
        System.out.println("---------------------------------------------------------------");

        Pizza medium = new Pizza('m',2,2);

        System.out.println(medium);
        System.out.println("---------------------------------------------------------------");

        Pizza large = new Pizza('l',3,2);

        System.out.println(large);

        double totalPrice = 0;

        // calculating the price for 3 pizzas of each size
        for (int i = 0; i < 3; i++) {

            totalPrice += small.calCost();
            totalPrice += medium.calCost();
            totalPrice += large.calCost();

        }
        System.out.println(totalPrice);


    }
}
