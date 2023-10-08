package day14_forLoop;

public class sumDigitsFromString {

    public static void main(String[] args) {

        String str = "as4@1jh2";

        int sum = 0;

        for (int i = 1; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 48 && ch <= 57) {
                sum += (ch == 48) ? 0
                        : (ch == 49) ? 1
                        : (ch == 50) ? 2
                        : (ch == 51) ? 3
                        : (ch == 52) ? 4
                        : (ch == 53) ? 5
                        : (ch == 54) ? 6
                        : (ch == 55) ? 7
                        : (ch == 56) ? 8
                        : 9;
            }
        }
        System.out.println(sum);


    }
}

/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */