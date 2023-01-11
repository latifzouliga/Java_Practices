package day25_practices;

public class SalaryCalculator {
    public int HourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        HourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){

        double salary = weeklyHours * weeklyHours * 52;

        return salary;
    }

    public double stateTax(){
        double totalStateTax = (stateTaxRate/100) * salary();
        return totalStateTax;
    }

    public double federalTax(){
        double totalFederalTax = (federalTaxRate/100 )* salary();
        return totalFederalTax;
    }
    public double salaryAfterTax(){

        double salaryAfterTax = salary() - (stateTax()+federalTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "HourlyRate=" + HourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                '}';
    }
}
/*
Task02:
    Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */