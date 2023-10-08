package day13_customMethods;

public class isOdd {

    public static void main(String[] args) {


        int number = 11;

        System.out.println(isOdd(number));


    }

    public static boolean isOdd(int number) {

 /*       if (number % 2 == 0){
            return true;
        }
       return false;
*/
        return (number % 2 == 0) ? true : false;


    }



}
/*
1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false
 */