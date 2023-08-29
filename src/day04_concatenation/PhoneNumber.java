package day04_concatenation;
/*
1. create a class named PhoneNumber and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625
 */

public class PhoneNumber {

    public static void main(String[] args) {

        String contryCode = "+1";
           int areaCode = 412,
                localNumber = 6261931;
        System.out.println(contryCode + "(" + areaCode + ")-" + localNumber);

    }
}
