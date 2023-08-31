package day07_ifStatement;

public class Grade {

    public static void main(String[] args) {

        char ch = 'A';
        String result = "";

        if (ch >= 'A' && ch <= 'F') {
            if (ch == 'A') {
                result = "Excellent";
            } else if (ch == 'B') {
                result = "Great job";
            } else if (ch == 'C') {
                result = "Good";
            } else if (ch == 'D') {
                result = "Passed";
            } else {
                result = "Failed";
            }

        } else {
            result = "Invalid";
        }
        System.out.println(result);

    }
}
/*
4. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */