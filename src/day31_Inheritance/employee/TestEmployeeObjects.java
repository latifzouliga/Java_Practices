package day31_Inheritance.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee = new Employee("omar", 33, 'M', "A23", "Emgineer", 80000, "Penn hill high school");

        Tester tester = new Tester("abdellatif", 35, 'm', "A11", "Test automation", 130000, "Software Co");

        Developer developer = new Developer("latifa", 36, 'F', "G12", "Java developer", 135000, "Soft tech", "Java programming language");

        Teacher teacher = new Teacher("jamila", 26, 'f', "K32", "Middle school teacher", 70000, "Pennhills middle school");

        Driver driver = new Driver("Adil", 32, 'm', "U34", "Uber driver", 60000, "Uber");

        // add all employees to an ArrayList
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(employee, tester, teacher, developer, driver));

        // add all employees to an Array
        Employee[] employees1 = {employee, tester, teacher, developer, driver};

        // playing with Object
        // an ArrayList Object
        ArrayList<Object> obj = new ArrayList<>(Arrays.asList(employee,tester,123,"hello",true));

        // an Array Object
        Object[] objc = {12,"Hello",teacher,tester,driver,developer,true,
                new Employee("Karim",23,'M',"A233","Hello java",344778,"Hi java")};

        System.out.println(employee);
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        System.out.println("-----------------------------------------------------------------------------------------");

        employee.work();
        teacher.work();
        developer.work();
        teacher.work();
        driver.work();

        System.out.println("---------------------------------------------------------------");

        // accessing ArrayList objects
        for (Employee each : employees) {
            System.out.println(each.getName() + " : " + each.getId() + " : $" + each.getSalary());
        }

        System.out.println("----------------------------------------------------------------------");

        // accessing Array objects
        for (Employee each : employees1) {
            System.out.println(each.getName()+" : "+each.getJobTitle());

        }

        System.out.println("--------------------------------------------------------------------");


        //



    }
}
