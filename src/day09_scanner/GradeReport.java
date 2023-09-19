package day09_scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade");

        String result = "Invalid grade";

        int grade = input.nextInt();
        if (grade >= 0 && grade <= 100){
            result = (grade >= 90) ? "A" : (grade >= 80) ? "B" : (grade >= 70) ? "C" : (grade >= 60) ? "D" : "Failed";
        }
        System.out.println(result);


    }
}
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */
