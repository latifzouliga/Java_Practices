package day09_scanner;

import java.util.Scanner;

public class NUmberOfPeople {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people live with you?");
        System.out.println("===============================");

        int numOfPeople = input.nextInt();

        String result;

        if (numOfPeople >= 1 && numOfPeople <= 2) {
            result = "Lives with less than 3 people\n=========================";
        } else if (numOfPeople >= 3 && numOfPeople <= 6) { // pre-condition for else if statement

            if (numOfPeople == 3) {
                result = "live with " + numOfPeople + " people\n===============================";
            } else if (numOfPeople == 4) {
                result = "Live with " + numOfPeople + " people\n===============================";
            } else {
                result = "========================\nLive with " + numOfPeople + " people\n==========================";
            }

        } else if (numOfPeople>=6){
            result = "live with more than 6 people\n============================";
        }else {
            result = "=======================\nInvalid\n======================";
        }
        System.out.println(result);

    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


 */