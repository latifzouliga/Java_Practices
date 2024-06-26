package day28_AccessModifiers.candy;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand can not be empty or blank");
            System.exit(1);
        }

        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0){
            System.err.println("Candy quantity can not set to 0 or negative: "+ quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Invalid price: "+price);
            System.exit(1);
        }

        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }


    public String toString() {
        return "Candy{" +
                "brand='" + getBrand() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + ((getPrice() == 0)? "Free":"$"+getPrice()) +
                ", hasPeanuts=" + isHasPeanuts() +
                '}';
    }

}
/*
. Create a custom class named Candy
        private variables:
            brand (String), quantity (int), price (double), hasPeanuts (boolean)

        Encapsulate All the private fields
                (price of candy can not be set to negative)
                (quantity of candy can not be set to zero or negative)

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Extra methods:
            toString():
                if the price is zero, print "free" instead of 0

        5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */