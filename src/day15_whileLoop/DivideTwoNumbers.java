package day15_whileLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int numeratr = 100;
        int denomeratr = 5;
        int result = 0;

        // two numbers can be divided without using '/', and anly by counting the number of iterations
        for (int i = 1; i <= numeratr; i += denomeratr) {

           if (i <= numeratr){
               result++; // the number of iterations will be increased each time by 1
           }

        }
        System.out.print(numeratr + " divided "+denomeratr+" is ~ "+ result);



    }



}


/*
4.  Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.


 */