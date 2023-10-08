package day16_nestedLoop;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = input.nextInt();

        while (score < 0 || score > 100) {
            System.err.println("Invalid score");
            System.exit(1);
        }

        String result =  (score >= 90) ? "A" : ((score >= 80)) ? "B" : (score >= 70) ? "C" : ((score >= 60)) ? "D" : "F";

        System.out.println(result);

        System.out.println("Would you like to continue?");
        String yesOrNo = input.next().toLowerCase();

        if (yesOrNo.equals("yes")) {

            while (yesOrNo.equals("yes")) {

                System.out.println("Enter your score");
                int score1 = input.nextInt();
                String res = (score1 >= 90) ? "A" : ((score1 >= 80)) ? "B" : (score1 >= 70) ? "C" : ((score1 >= 60)) ? "D" : "F";
                System.out.println(res);
                System.out.println("Would you?");
                yesOrNo = input.next();

                while (score1 < 0 || score1 > 100 ){
                    System.err.println("Invalid score");
                    System.exit(1);
                }

            }
        }
        if (yesOrNo.equals("no")) {
            System.out.println("Thank you for using Cydeo Grade Calculator APP ");
        } else {
            System.err.println("Invalid entry");
            System.exit(1);
        }
    }

}


/*
7. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error
                                 message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error
                                message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program


 */