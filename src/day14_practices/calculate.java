package day14_practices;

public class calculate {

    public static void main(String[] args) {


        System.out.println(sum(1, 99));

    }

    public static int sum(int min, int max) {


        int sum = 0;  // storing final number

       // starting point     //condition    // increasing by one after each iteration
        for (int i = min;      min <= max;     min++) {

            sum += min; // adding each number to tha sum after each iteration

        }
        return sum;


    } // provide minimum and maximum numbers when calling this method


}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */