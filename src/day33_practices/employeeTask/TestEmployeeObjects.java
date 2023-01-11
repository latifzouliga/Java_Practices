package day33_practices.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        //Employee employee = new Employee("Daniel", 33, 'M', "A23", "SDET", 145000);
        // can not create  Objects from abstract class

        Teacher teacher = new Teacher("James", 45,'M',"A23","Math teacher",75000);

        Developer developer = new Developer("Latif",37,'M',"A34","Java developer",98000,"Java");

        Driver driver = new Driver("Karim",34,'M',"C34","Truck Driver",90000);

        Tester tester = new Tester("Abdellatif",37,'M',"A11","Automation tester",150000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("--------------------------------------------------------------------");

        teacher.work();
        developer.work();
        driver.work();
        tester.work();


    }


}
