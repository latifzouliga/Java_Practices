package day20_forEach;

public class Palindromes {

    public static void main(String[] args) {

        String[] names = {"anna", "level", "Java", "hello", "leel"};


        int count = 0;

        for (String each : names) {

            String reversed = ""; // store reversed words each at time

            String result = ""; // store each word at a time
            result = each;

            for (int i = result.length() - 1; i >= 0; i--) {
                char ch = result.charAt(i); //
                reversed += ch;
            }
            if (result.equals(reversed)) {
                count++;
            }
        }

        System.out.println(count);


    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */