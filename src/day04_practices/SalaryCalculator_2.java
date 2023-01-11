package day04_practices;
/*
7. Create a class named SalaryCalculator, and declare the following variables:
                hourlyRate
                weeklyHours
                stateTaxRate
                federalTaxRate

    7.1 Use the given info above to calculate the followings:
                salaryBeforeTax
                stateTax
                federalTax
                totalTax
                salaryAfterTax

    7.2 Display each of the above in the following format:
        Ex:
              hourlyRate = $50
              weeklyHours = 45
              stateTax = 6  (given as percentage)
              federalTax = 26 (given as percentage)

        output:
               Gross pay is: $117000
                    Federal tax is: $30420
                    State tax is: $7020
                    Total tax is: $37440
                     Net income is: $79560
 */

public class SalaryCalculator_2 {
    public static void main(String[] args ) {

        double hourlyRate = 50,
                weeklyHours = 45,
                grossPay = hourlyRate * weeklyHours * 52,
                statTaxPercentage = 6,
                federalTaxPercentage = 26,
                tatalTax = statTaxPercentage + federalTaxPercentage,
                salaryBeforeTax = grossPay * tatalTax / 100,
                salaryAfterTax = grossPay - tatalTax / 100,
                federal_tax = grossPay * federalTaxPercentage / 100,
                state_tax = grossPay * statTaxPercentage /100,
                netIncome = grossPay - federal_tax - state_tax;

        System.out.println("Gross pay is: = " + grossPay);
        System.out.println("Federal is tax: = " + federal_tax);
        System.out.println("State tax is : = " + state_tax);
        System.out.println("Net income is : = " + netIncome);




    }
}
