package day15_whileLoop;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your gender");
        char gender = input.next().charAt(0);
        while (!(gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F')) {
            System.err.println("Invalid Entry. Please enter your gender M/F");
            gender = input.next().charAt(0);
        }
        System.out.println("Are you married?");
        String isMarried = input.next().toLowerCase();
        while (!(isMarried.equals("yes") || isMarried.equals("no"))) {
            System.err.println("Invalid entry. Please re-enter Yes/No");
            isMarried = input.next().toLowerCase();
        }
        System.out.println("Enter your age");
        int age = input.nextInt();
        while (!(age > 1 && age < 120)) {
            System.err.println("Invalid age. Re-enter your age");
            age = input.nextInt();
        }
        System.out.println("How many miles you drive a day?");
        int miles = input.nextInt();
        while (miles < 5) {
            System.err.println("Invalid milage");
            miles = input.nextInt();
        }
        System.out.println("Do you want full caverage?");
        String isFullCavarage = input.next().toLowerCase();
        while (!(isFullCavarage.equals("yes") || isFullCavarage.equals("no"))) {
            System.err.println("Invalid Entry. Do you want full caverage? Yes/No");
            isFullCavarage = input.next().toLowerCase();
        }
        System.out.println("Did you hava an accident in the past 5 years?");
        String accident = input.next().toLowerCase();
        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.err.println("Invalid entry. Did you have an accident in the last 5 years? Yes/No");
            accident = input.next().toLowerCase();
        }
        System.out.println("Do you have anti-theft device? Yes/No");
        String antiTheft = input.next().toLowerCase();
        while (!(antiTheft.equals("yes") || antiTheft.equals("no"))) {
            System.err.println("Invalid Entry. Do you have anti-theft device? Yes/No");
            antiTheft = input.next().toLowerCase();
        }

        // liability
        int total = 0;


        if (isFullCavarage.equalsIgnoreCase("yes")) {
            // full coverage price
            if (age < 25) {
                total += 160;
            } else {
                total += 120;
            }
            // mileage price
            if (miles <= 10) {
                total += 20;
            } else if (miles > 10 || miles <= 50) {
                total += 40;
            } else {
                total += 70;
            }

        } else {
            //liability price
            // age
            if (age < 25) {
                total += 90;
            } else {
                total += 50;
            }
            // mileage
            if (miles <= 10) {
                total += 10;
            } else if (miles > 10 || miles <= 50) {
                total += 30;
            } else {
                total += 50;
            }
        }

        if (antiTheft.equalsIgnoreCase("yes")) {
            total -= total * 0.05;
        }

        if (accident.equalsIgnoreCase("yes")) {
            total += total + (total * 0.15);
        } else {
            total -= total * 0.1;
        }

        if (isMarried.equalsIgnoreCase("yes")) {
            total -= total * 0.05;
        }

        System.out.println("The insurance quote total for "+name+ " is: $"+total);

    }
}
