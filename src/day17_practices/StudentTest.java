package day17_practices;

public class StudentTest {

    public static void main(String[] args) {

        Student stdnt1 = new Student();

        stdnt1.setInfo("Abdellatif",'M',"A23",'M',true);


        System.out.println(stdnt1);

        System.out.println("--------------------------------------------------------");

        Student s2 = new Student();

        s2.setInfo("Ahmed",'M',"B23",'B',false);

        s2.studentId = "C13";

        System.out.println(s2);


    }
}
