package day32_practices.shape;


public class TestShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle);

        Square square = new Square(5);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(5,4);
        System.out.println(rectangle);


        circle.draw();
        System.out.println("---------------------------");
        square.draw();
        System.out.println("-------------------------------");
        rectangle.draw();

        System.out.println("-------------------------------");
        circle.setRadius(10);
        System.out.println("Circle area: "+circle.area());
        circle.draw();


    }
}
