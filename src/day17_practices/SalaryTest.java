package day17_practices;

public class SalaryTest {

    public static void main(String[] args) {

        SalaryCalculator JohnSalary = new SalaryCalculator();

        JohnSalary.setInfo(50, 12, 15, 50);





        System.out.println("salary = $" + JohnSalary.salary());
        System.out.println(JohnSalary.federalTax());
        System.out.println(JohnSalary.stateTax());
        System.out.println("Salary "+JohnSalary.salaryAfterTax());



    }
}
