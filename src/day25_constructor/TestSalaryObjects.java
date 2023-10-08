package day25_constructor;

public class TestSalaryObjects {

    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(50,40,13,10);

        System.out.println(salary1);

        System.out.println("Salary: "+salary1.salary());
        System.out.println( "State tax: "+salary1.federalTax());
        System.out.println("Federal tax: "+salary1.stateTax());
        System.out.println("Net salary: "+ salary1.salaryAfterTax());


    }
}
