package day17_practices;

public class SalaryCalculator {

    public double hourlyRate;
    public double stateTax;
    public double federalTax;
    public double weeklyHours;

    public void setInfo(double hourlyRate, double stateTax, double federalTax, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTax = stateTax;
        this.federalTax = federalTax;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary;
        salary = weeklyHours * hourlyRate * 52;
        return salary;

    }
    public double stateTax(){
        return (stateTax/100) * salary();
    }

    public double federalTax(){

        return federalTax = (federalTax/100)* salary();
    }

    public double salaryAfterTax(){
        double salaryWthoutTax = 0;
        salaryWthoutTax = salary()+(stateTax() + federalTax());
        return salaryWthoutTax;
    }



    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", weeklyHours=" + weeklyHours +
                '}';
    }
}
/*
4. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting
            them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object


 */