package day31_practices.employee;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is teaching");
    }
}
/*
3. Teacher
                    work(): name + " is teaching"
 */