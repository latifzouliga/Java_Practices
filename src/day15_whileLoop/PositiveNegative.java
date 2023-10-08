package day15_whileLoop;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;



        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter your " + i + " number:");
            int number = input.nextInt();

            zero = (number > 0) ? positive++
                    : (number < 0) ? negative++
                    : 0;


        }
        System.out.println(positive + " positive and " + positive + " negative");


    }
}