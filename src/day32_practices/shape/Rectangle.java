package day32_practices.shape;

public class Rectangle extends Shapes{

    private double length, width;

    public Rectangle(double length, double width) {
        super();
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length <= 0){
            System.err.println("Invalid number: "+length+"\nLength can not be zero or negative");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if (width <= 0){
            System.err.println("Invalid number: "+width+"\nWidth can not be zero or negative");
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double perimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("\t*  *  *  *  *  *  *  *  *");
        for (int i = 0; i < 3; i++) {
            if (i == 2){
                System.out.println(getWidth()+" *                       *");
            }
            System.out.println("\t*                       *");

        }
        System.out.println("\t*  *  *  *  *  *  *  *  *");
        System.out.println("\t\t\t"+getLength());

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                "--> | length: " + length +
                "| width: " + width +
                super.toString();
    }
}
