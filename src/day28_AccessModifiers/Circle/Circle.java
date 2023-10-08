package day28_AccessModifiers.Circle;

public class Circle {
    private double radius;
    public static double pi;


    static {
        pi = 3.14;
    }
    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        if (radius == 0){
            System.err.println("Radius is not set");
            System.exit(1);
        }
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            System.err.println("Radius can not be zero or negative: "+ radius);
            System.exit(1);
        }

        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return radius * 2 * pi;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +" "+
                "area=" + calcArea() +" "+
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
1. Create a class named Circle

        private variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the radius of circle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perimeter of the circle when the circle object is passed
              in the print statement

 */