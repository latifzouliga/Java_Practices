package day07_practices;

public class GradeLevel2 {

    public static void main(String[] args) {

        byte gradeLevel = -33;
        String result = "";
        boolean years = gradeLevel > 0 && gradeLevel < 19;

        if (years){
            if (gradeLevel <= 5){
                result = "Elementary School";
            } else if (gradeLevel <=8) {
                result = "Middle School";
            } else if (gradeLevel <= 12) {
                result = "High School";
            } else if (gradeLevel<= 16) {
                result = "College";
            }else {
                result = "Grand School";
            }
        }else {
            result = "Invalid grade level";
        }
        System.out.println(result);



    }
}
/*
7. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type
   someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */