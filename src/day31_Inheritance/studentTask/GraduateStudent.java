package day31_Inheritance.studentTask;

public class GraduateStudent  extends Student{

    public GraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+ " is studying "+getFieldOfStudy());
    }


}
/*
3. Create the following sub classes of Student class:

                1. GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary



 */