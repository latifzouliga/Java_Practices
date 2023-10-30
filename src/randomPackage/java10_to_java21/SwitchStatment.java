package randomPackage.java10_to_java21;

public class SwitchStatment {
    public static void main(String[] args) {

        // statement: works and do its job. It is like void
        // switch statement

        String day = "Sat";
        String time = "";


        switch (day) {
            case "Sat", "Sun" -> time = "6am";

            case "Wed" -> time = "8pm";

            default -> time = "7am";
        }
        System.out.println(time);


        // expression: works and returns something. it is like return method
        // instead of writing result variable in each case we are just going to turn statement to expression
        // switch expression

        String grade = "A";
        String result = switch (grade) {
            case "A", "B":
                yield "Great";

            case "C":
                yield "Not Bad";

            default:
                yield "Fail";
        };
        // in switch expression we need to add semicolon
        System.out.println(result);


    }
}
