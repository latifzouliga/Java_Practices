package day08_ifStatement_switch_ternary;

public class NumberToWord {

    public static void main(String[] args) {

        int num =22;

        String word = (num >= 1 && num <= 9) ?
                (num == 1) ? "One" : (num == 2) ? "Two" : (num == 3) ? "Three" : (num == 4) ? "Four" : (num == 5) ? "Five"
                        : (num == 6) ? "Six" : (num == 7) ? "Seven" : (num == 8) ? "Eight" : "Nine"

                        : "Invalid number";
        System.out.println(word);


    }
}
/*
1. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary
 */