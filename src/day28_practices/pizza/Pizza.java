package day28_practices.pizza;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        switch (size) {
            case "small":
            case "medium":
            case "large":
                break;
            default:
                System.out.println("Invalid pizza size: " + size);
                System.exit(1);
        }


        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {


        if(numberOfCheeseTopping >=0) {
            if (size.equals("small") && !(numberOfCheeseTopping < 3)) {
                System.err.println("Invalid number of toppings for small pizza: " + numberOfCheeseTopping);
                System.exit(1);
            } else if (size.equals("medium") && !(numberOfCheeseTopping < 4)) {
                System.err.println("Invalid number of toppings for medium pizza: " + numberOfCheeseTopping);
                System.exit(1);
            } else if (size.equals("large") && !(numberOfCheeseTopping <= 5)) {
                System.err.println("Invalid number of toppings for medium pizza: " + numberOfCheeseTopping);
                System.exit(1);
            }
        }else {
            System.err.println("Invalid number");
            System.exit(1);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }


    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if(numberOfPepperoniTopping >=0) {
            if (size.equals("small") && !(numberOfPepperoniTopping < 3)) {
                System.err.println("Invalid number of toppings for small pizza: " + numberOfPepperoniTopping);
                System.exit(1);
            } else if (size.equals("medium") && !(numberOfPepperoniTopping < 4)) {
                System.err.println("Invalid number of toppings for medium pizza: " + numberOfPepperoniTopping);
                System.exit(1);
            } else if (size.equals("large") && !(numberOfPepperoniTopping <= 5)) {
                System.err.println("Invalid number of toppings for medium pizza: " + numberOfPepperoniTopping);
                System.exit(1);
            }
        }else {
            System.err.println("Invalid number of toppings for "+ getSize() +" pizza: " + numberOfPepperoniTopping);
            System.exit(1);
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {
        double total = 0;
        switch (size) {
            case "small":
                total += 10 + (numberOfCheeseTopping * 2) + (numberOfPepperoniTopping * 2);
                break;
            case "medium":
                total += 12 + (numberOfCheeseTopping * 2) + (numberOfPepperoniTopping * 2);
                break;
            case "large":
                total += 14 + (numberOfCheeseTopping * 2) + (numberOfPepperoniTopping * 2);
                break;
        }
        return total;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + getSize() + '\'' +
                ", numberOfCheeseTopping=" + getNumberOfCheeseTopping() +
                ", numberOfPepperoniTopping=" + getNumberOfPepperoniTopping() +
                ", total =$" + calcCost() +
                '}';
    }
}
