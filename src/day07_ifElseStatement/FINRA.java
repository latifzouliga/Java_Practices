package day07_ifElseStatement;

public class FINRA {

    public static void main(String[] args) {

        int number = 1;
        String result;


        if (number % 3 == 0 && number % 5 == 0) {
            result = "FIRNA";

        } else if (number % 3 == 0) {
            result = "FIN";
        } else if (number % 5 == 0) {
            result = "RA";

        } else {
            result = "Number = " + number;
        }
        System.out.println(result);


    }
}
/*
6. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3,
print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number.
and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINRA
 */