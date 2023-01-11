package day09_practices;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your miles here:");

        int miles = input.nextInt();

         double  milesToKilo =  1.6*miles;

        System.out.println(miles + " miles equal to "+   milesToKilo+ " Kilometers");


    }
}
