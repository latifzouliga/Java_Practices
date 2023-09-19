package day09_scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");

        double first_number = input.nextDouble();

        System.out.println("Enter the Math Operator");

        char ch = input.next().charAt(0);

        System.out.println("Enter the second number");

        double second_number = input.nextDouble();

        double resutl = 0;


        switch (ch){
            case '+':
                resutl = first_number + second_number;
                break;
            case '-':
                resutl = first_number - second_number;
                break;
            case '*':
                resutl = first_number * second_number;
                break;
            case '/':
                resutl = first_number / second_number;
                break;
            case '%':
                resutl = first_number % second_number;
                break;
            default:
                System.out.println("Invalid Entry");

        }
        System.out.println(resutl);

    }
}
/*
Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
 */