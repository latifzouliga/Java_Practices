package day07_ifStatement;

public class GradeReport {

    public static void main(String[] args) {
        int score = 77;
        String result = "Your Grad is: ";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result += "A";
            } else if (score >= 80) {
                result += "B";
            } else if (score >= 70) {
                result += "C";
            } else if (score >= 60) {
                result += "D";
            } else {
                result = "You Failed, try again";
            }

        } else {
            result = "Invalid Score";
        }
        System.out.println(result);
    }
}
