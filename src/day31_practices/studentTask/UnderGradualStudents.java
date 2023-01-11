package day31_practices.studentTask;

public class UnderGradualStudents extends Student{


    public UnderGradualStudents(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+ " was not able to finish his study in "+ getFieldOfStudy());
    }
}
/*
  2. UndergraduateStudent

                        Override the study method

                        add any additional fields and methods if necessary

 */