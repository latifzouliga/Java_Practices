package day07_practices;

public class MonthName {
    public static void main(String[] args) {

        int month = 121;
        String result = "";

        if (month > 0 && month < 13) {
            if (month == 1) {
                result = "January";
            } else if (month == 2) {
                result = "Fabruary";
            } else if (month == 3) {
                result = "march";
            } else if (month == 4) {
                result = "April";
            } else if (month == 5) {
                result = "May";
            } else if (month == 6) {
                result = "June";
            } else if (month == 7) {
                result = "July";
            } else if (month == 8) {
                result = "August";
            } else if (month == 9) {
                result = "September";
            } else if (month == 10) {
                result = "October";
            } else if (month == 11) {
                result = "November";
            } else {
                result = "December";
            }
        } else {
            result = "Invalid month";
        }
        System.out.println(result);


    }
}
/*
1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a program that can print the name of the month that
 the number represents. (only if the given number is a valid number, then print the name of the month.
 Otherwise, print Invalid)

              Ex: Given:
                      number = 10

              output:
                      October
 */
