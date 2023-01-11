package day09_practices;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = input.nextInt();

        int centToDollar = cents / 100;
        int cents1 = cents - centToDollar * 100;

        System.out.println(cents + " cents equal " + centToDollar + " dollars and " + cents1 + " cents");

    }
}
/*
5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */