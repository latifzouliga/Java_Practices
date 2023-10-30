package randomPackage.java10_to_java21;

sealed class Person permits Employee, Teacher{
    public void walk(){
        System.out.println("A person is walking");
    }
}

/*
any class extending sealed class must be declared as:
       non-sealed class : a class that can be inherited
       or
       final class: a class that can not be inherited
 */
non-sealed class Employee extends Person{
    public void work(){
        System.out.println("An employee working");
    }
}

final class Teacher extends Person{
    public void teach(){
        System.out.println("A teacher is teaching");
    }
}

// this class is extending a non-sealed class which also is extending a sealed class
// driver clas can not extend Person class
class Driver extends Employee{
    public void drive(){
        System.out.println("A driver is driving");
    }
}


public class SealedClassDemo {

    public static void main(String[] args) {

        Person person = new Person();
        person.walk();

        System.out.println();
        Employee employee = new Employee();
        employee.walk();
        employee.work();

        System.out.println();
        Teacher teacher = new Teacher();
        teacher.walk();
        teacher.teach();

        System.out.println();
        Driver driver = new Driver();
        driver.walk();
        driver.work();
        driver.drive();
    }
}