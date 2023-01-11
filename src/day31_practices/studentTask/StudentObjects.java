package day31_practices.studentTask;

public class StudentObjects {

    public static void main(String[] args) {

        Person person = new Person("Abdellatif", 36, 'M');

        Student student = new Student("Latif", 37, 'm', "A11", "Computer Sience",
                'A', "Cydeo school");

        GraduateStudent gradStudent = new GraduateStudent("Ahlam", 25, 'F', "B22",
                "Nursing", 'B', "Hello school");

        UnderGradualStudents underGradualStudent = new UnderGradualStudents("Murad", 29, 'M',
                "F32", "Biology", 'C', "Ola School");

        CydeoStudents stdnt = new CydeoStudents("Nora", 33, 'F', "K23", "Computer Science",
                'D', "Cydeo school", 28, 6, "Java programming language");


        System.out.println(person);
        System.out.println(student);
        System.out.println(gradStudent);
        System.out.println(underGradualStudent);
        System.out.println(stdnt);

        System.out.println("----------------------------------------------------------------------------------------");

        stdnt.sleep();
        stdnt.eat("Burger");
        stdnt.drink("Soda");
        stdnt.study();

    }
}
