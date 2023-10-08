package day31_Inheritance.employee;

public class Tester extends Employee {


    public Tester(String name, int age, char gender, String id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " "+ getName()+ " is testing");
    }
}
/*
2. Create the following subclasses and override the work method in each subclass:

            1. Tester
                    work(): jobTitle + " " + name + " is testing"
 */