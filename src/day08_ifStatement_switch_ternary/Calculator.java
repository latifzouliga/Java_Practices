package day08_ifStatement_switch_ternary;


public class Calculator {

    public static void main(String[] args) {


        char ch = '%'; // change to the desired arithmetic operator
        double num1 = 20.5,  // Enter your first number here
                num2 = 12;  // enter your second number here

        String result = "The result is: ";


        switch (ch) {
            case '+':
                result += num1 + num2;
                break;
            case '-':
                result += num1 - num2;
                break;
            case '*':
                result += num1 * num2;
                break;
            case '/':
                result += num1 / num2;
                break;
            case '%':
                result += num1 % num2;
                break;
            default:
                result = "Invalid Operator";


        }
        System.out.println(result);

    }
}
/*
7. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator,
   write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement

 */