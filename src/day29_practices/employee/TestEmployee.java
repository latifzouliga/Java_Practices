package day29_practices.employee;

public class TestEmployee {

    public static void main(String[] args) {

        Developer dev1 = new Developer();
        dev1.setInfo("Latif", 'm', 36, "Java Developer", "Java", 10);
        System.out.println(dev1);

        Tester tester1 = new Tester();
        tester1.setInfo("Abdellatif", 'M', 35, "Test Automation", 0);
        System.out.println(tester1);

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Omar", 'M', 37, "Java Expert", 160000);
        System.out.println(teacher1);

    }

}
