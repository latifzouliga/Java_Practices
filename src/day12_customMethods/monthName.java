package day12_customMethods;

public class monthName {

    public static void main(String[] args) {

        int month = 31;

        monthName(month);

    }

    public static void monthName(int month){

        String result;

        switch (month){

            case 1: result = "January"; break;
            case 2: result = "Fabruary"; break;
            case 3: result = "March"; break;
            case 4: result = "April"; break;
            case 5: result = "may"; break;
            case 6: result = "June"; break;
            case 7: result = "July"; break;
            case 8: result = "August"; break;
            case 9: result = "September"; break;
            case 10: result = "October"; break;
            case 11: result = "November"; break;
            case 12: result = "December"; break;
            default: result = "Invalid number";

        }
        System.out.println(result);


    }

}
/*
3. Create a method named monthName that can display the name of the month based on the given number to the method,
   if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June

 */