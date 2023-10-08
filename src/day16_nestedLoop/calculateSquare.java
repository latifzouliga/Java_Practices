package day16_nestedLoop;

import java.util.Scanner;

public class calculateSquare {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side square of the square:");
        int sideSquare = input.nextInt();


        while (!(sideSquare > 0)) {  // if the entry is zero or the number is negative
            System.err.println("Invalid Entry for the side square of the circle");
            System.exit(1);

        }

        double area = sideSquare * sideSquare;
        double perimeter = 4 * sideSquare;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        System.out.println("Would you like to continue?");
        String yesOrNo = input.next();

        if (yesOrNo.equals("yes")) {

            while (yesOrNo.equals("yes")) {


                System.out.println("Enter the side of square");
                double side = input.nextInt();

                double area1 = side * side;
                double perimeter1 = 4 * side;

                while (!(side > 0)) {  // if the entry is zero or the number is negative
                    System.err.println("Invalid Entry for the side square of the circle");
                    System.exit(1);
                }
                System.out.println("area = " + area1);
                System.out.println("perimeter = " + perimeter1);

                System.out.println("Would you like to continue?");


                yesOrNo = input.next();

            }
        }
        if (yesOrNo.equals("no")){
            System.out.println("Thank you for using Cydeo Circle Calculator APP");

        }else {
            System.err.println("Invalid entry");
            System.exit(1);
        }
    }
}


/*
5. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the
                                error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"
 */