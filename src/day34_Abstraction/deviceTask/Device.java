package day34_Abstraction.deviceTask;

public abstract class Device {

    private final String  brand, model;
    private double price;
    private String color;
    private final String size;
    private  boolean hasBattery, hasPowerButton;


    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {

        this.brand = brand;

        // model can not be null or empty
        if (model == null){
            System.err.println("Model can not be null");
            System.exit(1);
        }
        if (model.isEmpty()){
            System.err.println("Model can not be empty");
            System.exit(1);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        if (size == null){
            System.err.println("Size can not be null");
            System.exit(1);
        }
        if (size.isEmpty()){
            System.err.println("Size can not be empty");
            System.exit(1);
        }
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // price can not be negative or zero
        if (price <= 0){
            System.err.println("Price can not be zero or negative: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn(); // abstract method

    public abstract void turnOf(); // abstract method

    public String toString() {
        return brand + "| Model: " + model +  ", Color: " + color+ ", Size: " + size+ ", Price: $" + price+" |";
    }


}

/*
1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */

