package randomPackage.compatible_vs_comparitor;

import java.util.Comparator;

public class Laptop implements Comparable {

    /**
     * The Comparable interface is used to compare an object of the same class with an instance of that class
     * The Comparable interface contains the method compareTo to decide the order of the elements
     * if an object can not sorted, it is better ot implement Compatible interface and the implementation
     * that is needed to sort the objects
     * EX: How to sort a laptop objects?
     *     Are we gonna sort them based on model?, price? or the ram size?
     * In this case implementing Compatible interface comes handy to decide on which implementation we need
     * to sort the object
     */

    private String brand;
    private int ram;
    private double price;


    public Laptop(String brand, int ram, double price) {
        setBrand(brand);
        setRam(ram);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Giving a different implementation to compareTo() method from Compatible interface
    // In this case we are comparing Laptop object based on ram size

    @Override
    public int compareTo(Object lap) {
        Laptop lap1 = (Laptop)lap;
        if (this.ram > lap1.ram){
            return 1;
        }else {
            return -1;
        }
    }


    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
