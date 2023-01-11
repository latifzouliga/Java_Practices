package day05_practices;

public class LogicalOperators {

    public static void main(String[] args) {

        // Logiclal 'AND &&' Operator

        double salary = 80000;
        int creditScore = 550;
        int age = 25;
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        //                         true           &&  false             &&  true

        System.out.println(eligibleForLoan); // false
        System.out.println("-------------------------------------");

        int age1 = 22;
        String country = "US";
        boolean eligibleToVote = age1 >= 18 && country == "US";

        System.out.println("Eligibale to vote: " + eligibleToVote);
        System.out.println("-------------------------------------");

        // Logiclal 'OR ||' Operator

        String answer = "maybe";  // always true as long as one condition is met
        boolean validAnswe = answer == "yes" || answer == "no"; // false, because the condition is not met

        System.out.println(validAnswe);
        char grade = 'B';
        boolean passedExam = grade == 'A' || grade == 'B' || grade == 'C'; // true, because the condition is met
        System.out.println(passedExam);

        System.out.println("-------------------------------------");

        // Logical NOT ! Operator

        System.out.println(!true);
        String a = "yes";
        boolean yes = a == "yes";
        boolean no = !yes;
        System.out.println("Yes is: "+ yes); // true
        System.out.println("No is: " + no); // false
        System.out.println("---------------------------------------");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("Passed = " + passed);
        System.out.println("Failed = " + failed);

        System.out.println("----------------------------------------");

        System.out.println(true == !false && false == !true && true != !true);
        //                    true        &&      true      &&     true







    }
}
