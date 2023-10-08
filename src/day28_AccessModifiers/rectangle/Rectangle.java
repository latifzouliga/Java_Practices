package day28_AccessModifiers.rectangle;

public class Rectangle {

    private double length, width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if(length < 0){
            System.err.println("Invalid number. Rectangle length should not negative: "+ length);
            System.exit(1);
        }

        this.length = length;
    }

    public double getWidth() {
        if(width == 0 ){
            System.err.println("With is not set");
            System.exit(1);
        }
        return width;
    }

    public void setWidth(double width) {

        if(width < 0){
            System.err.println("Invalid number. Rectangle length should not negative: "+ width);
            System.exit(1);
        }
        this.width = width;
    }

    public double calcArea(){
        return length * width;
    }

    public double calcPerimeter(){
        return (length * 2) + (width * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
