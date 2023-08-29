package day04_concatenation;
/*
8. Create a class named SwapTwoVariables1 and declare the following variables:
            x
            y
            z

    8.1 Write a program that swap variables x & y’ values by using a temporary variable z
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 20


9. Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 20
 */

public class SwapTwoVariables1 {

    public static void main(String[] args) {

        int x = 10,
            y = 15,
            z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);






    }
}
