package day06_ifStatement;

public class NetIncomeCalc {
    public static void main(String[] args) {

        char socialStatus = 's';  // Please ENTER 's' for single and 'm' for married
        double salary = 1300000;  // Enter Your desired salary to calculate salary after tax

        // Salary and tax rate for singles
        // To calculate the salary after tax change the socialStatus data type to 's'

        if (socialStatus == 's'){

            if (salary > 130000){
                System.out.println(salary - salary * 35/100);
            }
            if (salary <= 129000 && salary >= 10000){
                System.out.println(salary - salary * 30/100);
            }
            if (salary <= 99000 && salary >= 80000 ){
                System.out.println(salary - salary * 25/100);
            }
            if (salary < 79000){
                System.out.println(salary - salary * 20/100);
            }
        }

        // Salary and tax rate for married couples
        // To calculate the salary after tax change the socialSatus data type to 'm'

        if(socialStatus == 'm'){

            if (salary > 130000){
                System.out.println(salary - salary * 30/100);
            }
            if (salary <= 129000 && salary >= 10000){
                System.out.println(salary - salary * 25/100);
            }
            if (salary <= 99000 && salary >= 80000 ){
                System.out.println(salary - salary * 20/100);
            }
            if (salary < 79000){
                System.out.println(salary - salary * 15/100);
            }
        }


    }
}
/*
9. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following
   requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

 */