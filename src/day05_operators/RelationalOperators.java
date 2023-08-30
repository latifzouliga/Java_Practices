package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

    // Greater than Relational operator
        int a = 1000;
        int b = 200;
      //  System.out.println(a > b);
        boolean aIsGreaterThan = a > b;
        System.out.println(aIsGreaterThan);

        System.out.println("----------------------------");

    // Greater or equal than Relational operator
        int score = 60;
        boolean passed = score >= 60;
        System.out.println(passed);

        System.out.println("----------------------------");

        int  age = 21;
        boolean eligibleToBuyAlcohol = age >= 21;
        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote);

        System.out.println("-----------------------------");

        System.out.println(100 > 100 ); // false
        System.out.println(100 >= 100); // true
        System.out.println(100 >= 85); // true

        System.out.println("--------------------------------");

    // less or equal than Relational operator
        System.out.println(100 < 2000); // true
        System.out.println(100 < 20); // false

        System.out.println("-----------------------------------");

        System.out.println(95 <= 100); //true
        System.out.println(100 <= 100); // true
        System.out.println(10 <= 5); // false

        System.out.println("------------------------------");
        System.out.println('a' > 'b');
          //               65 > 66
        System.out.println('a' > 55); // true
           //              65  > 55

        // System.out.println("Java" >= "C#"); // Compilor error because Relational Operators are only applicable to numbers

    }

}
