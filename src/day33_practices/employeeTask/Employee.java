package day33_practices.employeeTask;

public abstract class Employee {

    private String name;
    private int age;
    private final char gender;
    private String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        this.gender = gender;
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();  // abstract method is a method without a body

    @Override
    public String toString() {
        return getClass().getSimpleName()+"-->|" +
                "name: " + name +
                ", age: " + age +
                ", gender: " + gender +
                ", id: " + id +
                ", jobTitle: " + jobTitle +
                ", salary: " + salary +
                '|';
    }
}
