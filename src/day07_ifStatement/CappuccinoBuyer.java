package day07_ifStatement;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        int size = 3;
        String result = "";
        if (size >= 1 && size <= 3) {
            if (size == 1) {
                result = "tall:\n\tprice is $3.69\n\t90 calories";
            } else if (size == 2) {
                result = "grande:\n\tprice is $3.99\n\t120 calories";
            } else {
                result = "venti:\n\tprice is $4.29\n\t150 calories";
            }
        } else {
            result = "Invalid size";
        }
        System.out.println(result);
    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if
 */