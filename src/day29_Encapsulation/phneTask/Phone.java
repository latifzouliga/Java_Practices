package day29_Encapsulation.phneTask;

public class Phone {

    private String brand, model, size, color;
    private  double price;

    public void setInfo(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        if(brand == null){
            System.err.println("Brand is not set");
            System.exit(1);
        }
        return brand;
    }

    public void setBrand(String brand) {

        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand can not be empty or blank");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {

        if( model == null){
            System.err.println("Model is not set");
            System.exit(1);
        }
        return model;
    }

    public void setModel(String model) {

        if (model.isEmpty() || model.isBlank()){
            System.err.println("Model can not be empty or blank");
            System.exit(1);
        }

        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {

        if (color == null){
            System.err.println("Color is not set");
            System.exit(1);
        }

        return color;
    }

    public void setColor(String color) {
        if (color.isBlank() || color.isEmpty()){
            System.err.println("Color can not be empty or blank");
            System.exit(1);
        }

        this.color = color;
    }

    public void calling(long phoneNumber){
        System.out.println("calling "+ phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("texting "+ phoneNumber);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("Price can not be zero or less than zero");
            System.exit(1);
        }

        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }
}
/*
phoneTask
	1. Create a named IPhone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement

 */