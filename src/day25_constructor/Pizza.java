package day25_constructor;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public double calCost(){

        double total = 0;
        if (size == 's'){
            total += 10 + (2 *numberOfCheeseTopping) + (2 * numberOfPepperoniTopping);
        } else if (size == 'm') {
            total += 12 + (2 *numberOfCheeseTopping) + (2 * numberOfPepperoniTopping);

        }else {
            total += 14 + (2 *numberOfCheeseTopping) + (2 * numberOfPepperoniTopping);
        }

        return total;
    }


    public String toString() {
        return "Pizza{" +
                " size=" + size +
                ", numberOfCheeseTopping: " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping: " + numberOfPepperoniTopping +
                ", total: " + calCost() +
                '}';
    }
}
/*
Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza
             cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */