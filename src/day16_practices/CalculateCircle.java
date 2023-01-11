package day16_practices;

import java.util.Scanner;

public class CalculateCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int radius = input.nextInt();


        while (!(radius > 0) ) {  // if the entry is zero or the number is negative
            System.err.println("Invalid Entry for the radius of the circle");
            System.exit(1);

        }
        // circle formula
        double pi = 3.14f,
                area = pi * radius * radius,
                perimeter = 2 * pi * radius,
                diameter = 2 * radius;
        // the output
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
        System.out.println("diameter = " + diameter);
        System.out.println("Would you like to continue?");
        String yesOrNo = input.next();

        while (yesOrNo.equals("yes")) {  // if the entry is "yes"

            System.out.println("Enter the radius of the circle:");
            radius = input.nextInt();

            while (!(radius > 0)) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }
            // the output
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);
            System.out.println("diameter = " + diameter);

            System.out.println("Would you like to continue?");
            yesOrNo = input.next();

        }while (!yesOrNo.equals("yes ")&& !yesOrNo.equals("no")){  // if the entry is neither yes nor no
            System.err.println("Invalid entry. Please enter Yes/No");
            System.out.println("Would you like to continue?");
            yesOrNo = input.next();

            if (yesOrNo.equals("yes")){  // if the entry is yes

                System.out.println("Enter the radius of the circle:");
                radius = input.nextInt();

                while (!(radius > 0)) {  // if the radious is 0 or negative number
                    System.err.println("Invalid Entry for the radius of the circle");
                    System.exit(1);
                }

                System.out.println("area = " + area);
                System.out.println("perimeter = " + perimeter);
                System.out.println("diameter = " + diameter);

                System.out.println("Would you like to continue?");
                yesOrNo = input.next();


            }else if (yesOrNo.equals("no")){   // if the entry is no
                System.out.println("Thank you for using Cydeo Square Calculator APP");
            }

        }


    }
}
/*
4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the
                                 error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a
                                valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


 */