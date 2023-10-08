package day11_strings;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");

        String split = input.next();

        System.out.println("Enter the number of people");

        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount");

        double checkAmount = input.nextDouble();

        input.nextLine();

        System.out.println("Service Quality");

        String serviceQuality = input.nextLine();


        // split first char of yes & no
        String split_lower_case = split.toLowerCase();
        int yes_char = split_lower_case.indexOf(0) + 1;
        int yes_char1 = (split_lower_case.length() + 1) - split_lower_case.length();
        String yes_get_char = split_lower_case.substring(yes_char, yes_char1);
        System.out.println(yes_get_char.toUpperCase());

        // split last part of yes & no
        int lastPartOfSplit1 = split_lower_case.indexOf(0) + 2;
        int lastPartOfSplit2 = split_lower_case.length();
        String lastPartOfSplit3 = split_lower_case.substring(lastPartOfSplit1, lastPartOfSplit2);
        System.out.println(lastPartOfSplit3);

        //slice first char of any given word
        String good = serviceQuality.toLowerCase();
        int sliceFirstLetter = serviceQuality.indexOf(0) + 1;
        int sliceFirstLetter2 = (serviceQuality.length() + 1) - serviceQuality.length(); //
        String quality = serviceQuality.substring(sliceFirstLetter, sliceFirstLetter2);
        String quality_upperCase = quality.toUpperCase();

        // slice last part of any given word
        int lastPart1 = serviceQuality.indexOf(0) + 2;
        int lastPart2 = serviceQuality.length();
        String lastPart3 = serviceQuality.substring(lastPart1, lastPart2);
        String quality_final = quality_upperCase.concat(lastPart3);
        // ---------------------------------------------
        double amountWithTips = 0;
        double total = numberOfPeople * checkAmount;
        double yes_split = amountWithTips / numberOfPeople;
        double tips = 0;
        if (split.equals("no")) {
            if (serviceQuality.equals("poor")) {
                amountWithTips = total * 1.05;

            } else if (serviceQuality.equals("fair")) {
                amountWithTips = total * 1.1;

            } else if (serviceQuality.equals("good")) {
                amountWithTips = total * 1.15;

            } else if (serviceQuality.equals("great")) {
                amountWithTips = total * 1.2;

            } else if (serviceQuality.equals("excellent")){
                amountWithTips = total * 1.25;

            }else {
                System.out.println("Number of people " + numberOfPeople);
                System.out.println("Total pay per person: " + total / numberOfPeople);
                System.out.println(amountWithTips-total);
            }


        } else {


        }

        System.out.println("Number of people : " + numberOfPeople);
        System.out.println("total pay: " + amountWithTips);
        System.out.println("Total tips: " + tips);
        System.out.println("Tips per peson: " + tips / numberOfPeople);


    }
}
/*
10. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split
    of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - 10. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split
    of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
,
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75

 */