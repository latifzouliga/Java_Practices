package day24_practices;


import java.time.LocalDate;

public class LeapYear {


    public static void main(String[] args) {

        leapYear(2004);

    }


    public static void leapYear(int birthYear){

       LocalDate  year = LocalDate.of(birthYear,1,1);


       if (year.isLeapYear()){
           System.out.println(birthYear+ " is a leap year");
       }else {
           System.out.println(birthYear+ " is NOT a leap year");
       }

     }  // pass one int argument to check whether a year is a leap year or not
}
