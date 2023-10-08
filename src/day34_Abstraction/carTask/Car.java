package day34_Abstraction.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    // constructor
    public Car(String model, String color ,int year, double price) {
	// can not set conditon for make since the class name is assigned to it    
        this.make = getClass().getSimpleName();

        // setting model conditions
        if (model == null) {
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (model.isEmpty()) {
            System.err.println("Model can not be empty");
            System.exit(1);
        }
        this.model = model;

        // setting year condition
        if (year < 1886) {
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;  
        setPrice(price); // conditon is set in setter
        setColor(color); // conditon is set in setter
    }

    // getters and setters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
	// setting conditons for price
        if (price <= 0) {
            System.err.println("We are selling cars not giving gifts: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        // setting color conditions
        if (color == null) {
            System.err.println("Color can not be null");
            System.exit(1);
        }
        if (color.isEmpty()) {
            System.err.println("Color can not empty");
            System.exit(1);
        }
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // abstract methods
    public abstract void start();  // must be called in sub classes

    public abstract void drive(); // must be called in sub classes

    // non-abstract method
    public void stop() {
        System.out.println(getMake() + " " + getModel() + " is stopping");
    }

    // toString method, inorder to avoid hash code
    @Override
    public String toString() {
        return make + " -->   Model: " + model + " | Year: " + year + " | Price: $" 
                + price + " | Color: " + color + "| ";
    }

    @Override
    public boolean equals(Object obj) {

        // if object is compared with itself
        if (obj == this){
            return true;
        }

        if (!(obj instanceof Car)){
            return false;
        }

        Car car = (Car)obj;

        return make.equals(car.make) &&
                model.equals(car.model)&&
                year == car.year;
    }
}
/*
Car Task:
	1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields

				Add a constructor that can set all the fields

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				abstract methods:
					start();
					drive();

				none abstract methods:
					stop()
					toString()
 */
