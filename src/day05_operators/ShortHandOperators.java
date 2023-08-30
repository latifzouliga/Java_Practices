package day05_operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(a); // 20
        System.out.println();

        a = 40; // updating the value of a
        System.out.println(a);

        a = 90; // updating the value of a
        System.out.println(a);
        System.out.println("----------------------");

        // addition assignment operator
        double balance = 100; // implicit casting
        balance += 1000; // balance = 100 = 1000
        System.out.println("Balance: "+ balance);

        balance += 500; // balance = 1100 + 500
        System.out.println("balance = " + balance);

        // subtraction assignment operator

        balance -= 500; // balance = 1600 - 500
        System.out.println("balance = " + balance);

        balance -= 200;
        System.out.println("balance = " + balance);
        System.out.println("-------------------------------");

        // Multiplication assignment operator
        double salary = 1600;
        salary *= 2;
        System.out.println("salary = " + salary);

        salary *= 3;
        System.out.println("salary = " + salary);
        System.out.println("--------------------------");

        double eth = 4;
        eth *= 250;
        System.out.println("eth: " + eth);
        System.out.println("--------------------------");

        // Division assignment operator

        eth /= 2;
        System.out.println("Eth price is; " + eth);
        System.out.println("salary = " + salary);
        salary /= 2;
        System.out.println("balance = " + balance);
        System.out.println("------------------------------");

        // Remainder assignment operator

        int b = 39;
        b %= 7; // b = 39 % 7 // the remainder will be reassigned to the variable b
        System.out.println(b);








    }
}
