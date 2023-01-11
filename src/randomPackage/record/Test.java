package randomPackage.record;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Latif",35,"A11");
        Employee employee2 = new Employee("Latif",35,"A11");

        Employee employee3 = new Employee("Zouliga",30,"B12");
        Employee allEmployees = new Employee("hhhh",33,"aaa");

        System.out.println(employee1.getEmployeeId());
        System.out.println(employee1.equals(employee2)); // always returns false if we don't override equals method
        System.out.println(employee3);

        System.out.println("------------------------  Testing Record like class ----------------------------");

        RecordEmployee emp1 = new RecordEmployee("Latif",33,"W11");
        RecordEmployee emp2 = new RecordEmployee("Latif",33,"W11");

        RecordEmployee emp3 = new RecordEmployee("Zoul",44,"R11");

        System.out.println(emp2);
        System.out.println(emp2.age());
        System.out.println(emp2.equals(emp1)); // no need to override the equals() method, it is capable of comparing two instances of the same class

        emp2.work();
        emp3.sayHi();
        System.out.println(RecordEmployee.hasJob);
        RecordEmployee.printHello();


    }

}
