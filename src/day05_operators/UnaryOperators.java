package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // pre increment / decrement
        int  x = 10;
        System.out.println(++x); // 11 // increment // the value of x increased by one
        System.out.println(x); // 11
        int y = 100;
        System.out.println(--y);// 99 // decrement // the value of x is decreased by one
        System.out.println(y); // 99
        System.out.println("--------------------------------");

        // post increment / decrement
        int a = 50;
        System.out.println(a++); // 50 // the value stays the same, and it will change by one
        System.out.println(a); // 51

        int b = 25;
        System.out.println(b--); // 25
        System.out.println(b); // 24
        System.out.println("____________________");

        int n = 30;
        int m = n++;
        System.out.println(m); // the result is 30
        System.out.println(n); // the value is increased by 1 // 31



    }


}
