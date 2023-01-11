package day07_practices;

public class GradeLevel {
    public static void main(String[] args) {

        int gradelevel = 9;
        String result = "";

        if (gradelevel >= 1 && gradelevel <= 18) {

            if (gradelevel <= 5) {
                result = "Elementary";
            } else if (gradelevel <= 8) {
                result = "Middle school";
            } else if (gradelevel <= 12) {
                result = "High school";
            } else if (gradelevel <= 16) {
                result = "College";
            } else {
                result = "Grand School";
            }

        } else {
            result = "Invalid number";
        }
        System.out.println(result);


    }
}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
 program to determine and print which school type someone is in. (Only if the given number is a valid number,
 then print the school type. Otherwise, print Invalid)
             Ex:
                   gradeLevel = 2

              output:
                   Elementary School
 The grade level and types are:
    1 ~ 5: Elementary school
    6 ~ 8: Middle school
    9 ~ 12: High school
    13 ~ 16: College
    17 ~ 18: Grad School
 */