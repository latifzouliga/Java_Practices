package day31_Inheritance.studentTask;

public class Student extends Person {

    private String studentId, fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    // field of study conditions
    public void setFieldOfStudy(String fieldOfStudy) {

        boolean validFieldOfStudy = checkStrings(fieldOfStudy);

        if (!validFieldOfStudy) {
            System.err.println("Study of field is empty or blank");
            System.exit(1);
        }

        this.fieldOfStudy = fieldOfStudy;
    }

    // check if a string is empty or blank
    private boolean checkStrings(String string) {
        if (string.isBlank() || string.isBlank()) {
            return false;
        }
        return true;

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        boolean isValid = checkGrade(grade);
        if (!isValid) {
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    private boolean checkGrade(char grade) {
        switch (grade) {
            case 'A':
            case 'a':
            case 'B':
            case 'b':
            case 'C':
            case 'c':
            case 'D':
            case 'd':
            case 'F':
            case 'f':
                return true;
        }
        return false;
    }

    public String getSchoolName() {
        return schoolName;
    }

    // check school name
    public void setSchoolName(String schoolName) {

        boolean isValid = checkStrings(schoolName);
        if (!isValid) {
            System.err.println("Invalid school name");
            System.exit(1);
        }

        this.schoolName = schoolName;
    }

    public void study() {
        System.out.println(getName() + " is studying");
    }

    @Override
    public String toString() {
        return super.toString() +
                  " studentId: " + studentId + " | " + "fieldOfStudy: " + fieldOfStudy +
                " | " + "grade: " + grade + " | " + "schoolName: " + schoolName + " |";
    }
}
/*
2. Create a subclass of Person named Student:
                Extra variables:
                        studentId, fieldOfStudy, grade, schoolName

                Encapsulate all the fields

                Add a constructor that can set all the fields

                            Condition:
                                    1. filedOfStudy and schoolName should not be set to null
                                    2. filedOfStudy and schoolName should not be empty
                                    3. grade must be valid (A, B, C, D, F)


                Extra methods:
                    study()
                    toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included

 */
