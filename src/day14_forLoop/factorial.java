package day14_forLoop;

public class factorial {

    public static void main(String[] args) {


    }

    public static int factorial(int min, int max) {


        int num = 5;

        int f = 1;

        for (int i = 1; i <= num; ++i) {

            f = f * i;

        }
        return f;


    }


}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */