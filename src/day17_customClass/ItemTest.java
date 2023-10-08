package day17_customClass;

public class ItemTest {

    public static void main(String[] args) {

        Item potato = new Item();
        Item tomato = new Item();
        Item pepper = new Item();


        potato.SetInfo("Potato",10,2);
        tomato.SetInfo("tomato",13,4);
        pepper.SetInfo("Pepper",40,16);
        pepper.unitPrice = 5;

        double total = 0;
        for (int i = 0; i < 3; i++) {
            potato.SetInfo("Potato",10,2);
            total+=potato.calcCost();
            tomato.SetInfo("tomato",13,4);
            total+=tomato.calcCost();
            pepper.SetInfo("Pepper",40,16);
            pepper.unitPrice = 5; // update pepper price
            total+=potato.calcCost();

        }

        potato.showCost();
        tomato.showCost();
        pepper.showCost();

        System.out.println("Total price for all items is: $"+total);








    }
}
