package day09_scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");

        double radius = input.nextDouble(),
               pi = 3.14f,
               area = pi * radius * radius,
               perimeter = 2 * pi * radius;

        System.out.println("area = " + Math.round(area));
        System.out.println("perimeter = " + Math.round(perimeter));


    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */