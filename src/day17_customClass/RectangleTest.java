package day17_customClass;

public class RectangleTest {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------------------");

        Rectangle rectangle = new Rectangle();

        rectangle.setInfo(5,10);

        System.out.println("Area: "+rectangle.calculateArea());

        System.out.println("Perimeter: "+rectangle.calculatePerimeter());



    }
}
