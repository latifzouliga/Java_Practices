package day09_practices;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is you hourly rate?");

        double hourly_rate = input.nextDouble();

        System.out.println("How many hours do you work a week?");

        double hours_per_week = input.nextDouble();

        System.out.println("Enter the state tax in percentage");

        double state_tax = input.nextDouble();
        // double State_tax_in_percentage = state_tax/100;

        System.out.println("Enter the federal tax in percentage");

        double federal_tax = input.nextDouble();

        double salary_before_tax = hourly_rate * hours_per_week * 52;
        double total_tax = state_tax + federal_tax;
        double net_income = salary_before_tax - total_tax;

        System.out.println(salary_before_tax);
        System.out.println(state_tax);
        System.out.println(federal_tax);
        System.out.println(total_tax);
        System.out.println(net_income);


    }
}
/*
10. Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */