package day13_practices;

public class maxAndMinNumber {

    public static void main(String[] args) {

        System.out.println("The maximum number is: " + max(12, 20));
        System.out.println("The minimum number is: " + min(12, 20));


    }

    public static double max(double num1, double num2) {

        return (num1 > num2) ? num1 : num2;

    }

    public static double min(double num1, double num2) {

        return (num1 > num2) ? num2 : num1;

    }


}
/*
3. Create a method named max, that can return the maximum number between two numbers
 */