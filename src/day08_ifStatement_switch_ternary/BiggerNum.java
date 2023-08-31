package day08_ifStatement_switch_ternary;

public class BiggerNum {

    public static void main(String[] args) {

        int num1 = 11;
        int num2 = 11;
        int num3 = 11;
        boolean num1IsBigger = num1 > num2 && num1 > num3,
                num2Isbigger = num2 > num1 && num2 > num3,
                num3Isbigger = !num2Isbigger && !num1IsBigger,
                equal = num1 == num2 && num2 == num3;


        String result = (num1IsBigger) ? "n1 is bigger" : (num2Isbigger) ? "n2 is bigger" : (equal) ? "All numbers are equal"
                : "n3 is bigger";

        System.out.println(result);


    }


}
/*
6. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */