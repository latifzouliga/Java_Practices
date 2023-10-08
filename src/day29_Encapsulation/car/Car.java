package day29_Encapsulation.car;

public class Car {

    private String make, model;
    private int year;
    private String color;
    private double price;

    //---------------------------------- getters and setters -----------------------------

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year <= 0){
            System.err.println("the year can not be 0 or negative number");
            System.exit(1);
        }

        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0 ){
            System.err.println("This is not a toy. you need to pay what "+ getMake()+ " "+ getModel() +" worth");
            System.exit(1);
        }
        this.price = price;
    }

    //-----------------------------------------------------------------------------------------

    public void setInfo(String name, String model, int year, String color, double price) {
        setMake(name);
        setModel(model);
        setYear(year);
        setColor(color);
        setPrice(price);
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", color='" + getColor() + '\'' +
                ", price$=" + getPrice() +
                '}';
    }

    //===============================================================================================

    public static class Engine {

        private int numberOfPistons;
        private String fuelType;

        public Engine(int numberOfPistons, String fuelType) {
            this.numberOfPistons = numberOfPistons;
            this.fuelType = fuelType;
        }

        public int getNumberOfPistons() {
            return numberOfPistons;
        }

        public void setNumberOfPistons(int numberOfPistons) {

            if (numberOfPistons <= 0 || numberOfPistons >= 8) {
                System.err.println("Invalid number");
                System.exit(1);
            }
            this.numberOfPistons = numberOfPistons;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            switch (fuelType) {
                case "Diesel":
                case "Gasoline":
                    break;
                default:
                    System.err.println("Invalid fuel type");
                    System.exit(1);
            }

            this.fuelType = fuelType;
        }


        public String toString() {


                return  "Engine{" +
                        "numberOfPistons=" + numberOfPistons +
                        ", fuelType='" + fuelType + '\'' +
                        '}';


        }



    }

}
