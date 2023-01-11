package day11_practices;

import java.util.Scanner;

public class WebsiteAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your website:");

        String website = input.nextLine();

        if (website.startsWith("www.")&& website.endsWith(".com")){
            System.out.println("Valid Website address");
        } else if (website.startsWith("www.")&& website.endsWith(".edu")) {
            System.out.println("Valid Website address");
        } else if (website.startsWith("www.")&& website.endsWith(".gov")) {
            System.out.println("Valid Website address");
        }else {
            System.out.println("Invalid Website address");
        }


    }
}
/*
1. Create a class named day11_practices.WebsiteAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */