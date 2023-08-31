package day06_ifStatement;

public class PosNegZero {
    public static void main(String[] args) {

        int num = 0;
         boolean  isPositive = num > 0,
                 isNegative = num < 0;

         if (isPositive){
             System.out.println(num + " is positive number");
         }

         if (isNegative){
             System.out.println(num + " is negative number");
         }

         if(!isPositive && !isNegative)
             System.out.println(num + " is zero");



    }
}
/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a program can identify
   if the number is positive, negative or zero
        Ex:
             number = 20

        output:
              Positive
 */