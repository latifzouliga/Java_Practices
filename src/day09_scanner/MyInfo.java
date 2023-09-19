package day09_scanner;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter your gender:");
        String gender = input.next();
        input.nextLine();
        System.out.println("Enter your full name:");
        String full_name = input.nextLine();
        System.out.println("Enter your phone number");
        long phone_number = input.nextLong();
        System.out.println("Enter your zip code;");
        int zip_code = input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name:");
        String school_name = input.nextLine();
        System.out.println("Enter your city:");
        String city = input.nextLine();
        System.out.println("Enter your state");
        String state = input.next();
        System.out.println("Enter your building number:");
        int building = input.nextInt();
        input.nextLine();
        System.out.println("Enter your street name:");
        String street_name = input.nextLine();


    }
}
/*
11. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in seperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

 */