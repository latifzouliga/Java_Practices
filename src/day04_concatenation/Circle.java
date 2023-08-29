package day04_concatenation;
/*
6. Create a class named Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
 */

public class Circle {
    public static void main(String[] args) {


        int radius = 5;
        double pi = 3.14f,
              area = pi * radius * radius,
              perimeter = 2 * pi * radius;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        System.out.println("----------------------------------------");
/*
        int radius= 5;
        double pi = 3.14;
        double = pi * radius * radius;


//First Approach Type Casting
        float perimeter =(float) (2 * pi * radius);
        System.out.println("Area of the circle is " + area + "\n"+ "Perimeter of the circle is " + perimeter);

//Second Approach Decimal Format Class
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("df.format(perimeter) = " + df.format(perimeter));

//Third Approach printf method
        System.out.printf("%.2f",perimeter);

//Forth Approach String Formatter
        System.out.println(String.format("%.2f",perimeter));

 */
    }
}
