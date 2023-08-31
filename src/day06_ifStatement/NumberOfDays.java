package day06_ifStatement;

public class NumberOfDays {

    public static void main(String[] args) {
        int number = 9;

        /* the months that has 30 days:
                4, 6, 9, 11
         */
        if (number == 4){
            System.out.println("This month has 30 day");
        }

        if (number == 6){
            System.out.println("This month has 30 day");
        }

        if (number == 9){
            System.out.println("This month has 30 day");
        }

        if (number == 11){
            System.out.println("This month has 30 day");
        }

        /* The months that has 31 days;
        1, 3, 5, 7, 8, 10, 12
         */
        if (number == 1){
            System.out.println("This month has 31 day");
        }

        if (number == 3){
            System.out.println("This month has 31 day");
        }

        if (number == 5){
            System.out.println("This month has 31 day");
        }

        if (number == 7){
            System.out.println("This month has 31 day");
        }

        if (number == 8){
            System.out.println("This month has 31 day");
        }

        if (number == 10){
            System.out.println("This month has 31 day");
        }

        if (number == 12){
            System.out.println("This month has 31 day");
        }

        // The month that has 28 days

        if (number == 2){
            System.out.println("This month has 28 day");
        }



    }
}




/*
1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a program that can print the number of days
   in the given month
           Ex:
              Given:
                   number = 1

         output:
                31 days
       Hints:
            Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
            Months that has 30 days are: 4, 6, 9, 11
            Month that has 28 days: 2
 */
