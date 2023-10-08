package day27_statics;

public class Iphone {
    public String brand, model, size, color;
    public double price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;


    public Iphone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        OS = "IOS";
        isSmartPhone = true;
        madeIn = "China";
        designedIn = "California USA";
    }
    public static void printOperatingSystem(){
        System.out.println(OS);
    }

    public void call(long phoneNumber){
        System.out.println("I'm calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("I'm texting "+phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println(" facetimming "+ phoneNumber);
    }
    public void facetime(String email){
        System.out.println(" emailing "+ email);
    }


    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */
