package day05_operators;

/*
1. Create a class called SalaryCalculator.java
			1.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560
 */

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50,
                weeklyHour = 45,
                stateTaxRate = 6, // implicit casting
                federalTaxRate = 26,
                salaryBeforeTax = hourlyRate * weeklyHour * 52,
                stateTax = salaryBeforeTax * stateTaxRate / 100,
                federalTax = salaryBeforeTax * federalTaxRate / 100,
                totalTax = stateTax + federalTax,
                salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay is: " + salaryBeforeTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("State tax is: $" + stateTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);
        System.out.println("-------------------");
        System.out.println("Gross pay is: " + salaryBeforeTax +
                "\nFederal Tax is: $" + federalTax +
                "\nState tax is: $" + stateTax +
                "\nTotal tax is: $" + totalTax +
                "\nNet income is: $" + salaryAfterTax);



    }
}
