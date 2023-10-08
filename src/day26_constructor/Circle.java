package day26_constructor;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter;
   public static double pi = 3.14;


    public Circle(double radius) {
        this.radius = radius;
    }
    public double calcArea(){
        return pi * radius * radius;

    }

    public double calcPerimeter(){
         return  2 * pi * radius;

    }

    public static void printPi(){
        System.out.println(pi);
    }

    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + df.format( radius )+
                ", diameter=" + df.format( radius*2) +
                ", pi=" + pi +
                ", area=" + df.format( calcArea() ) +
                ", perimeter=" + df.format( calcPerimeter() ) +
                '}';
    }


    public static void main(String[] args) {

        Circle c1 = new Circle(5);

        System.out.println(c1);

        printPi();
        System.out.println(c1.calcArea());

        System.out.println(c1.calcPerimeter());

    }
}
/*
2. Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object
					of circle is passed in the print statement
 */