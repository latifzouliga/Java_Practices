package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number:");
        double num2 = input.nextDouble();

        System.out.println(num1 + num2);


        while (num1 > 0 && num2 > 0) {

            System.out.println("Enter your first number");
            num1 = input.nextDouble();

            System.out.println("Enter your second number;");
            num2 = input.nextDouble();

            System.out.println(num1 + num2);

        }

        input.close();


    }
}
/*
5. Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user
until user enters a negative number.

 */
