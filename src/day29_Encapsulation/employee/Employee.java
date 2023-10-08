package day29_Encapsulation.employee;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private String jobTitle;
    private double salary;

    public void setInfo(String name, char gender, int age, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){

        switch (gender){
            case 'M': case 'm': case 'F': case 'f':
                break;
            default:
                System.err.println("Invalid Invalid gender");
                System.exit(1);
        }

        this.gender = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){

        if(age < 18 || age > 65){
            System.err.println("Age MUST be between 18 and 65");
            System.exit(1);
        }


        this.age = age;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){

        this.jobTitle = jobTitle;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){

        // Employee is crying
        if(salary < 0 ){
            System.err.println("I can't give you my money! you need to pay me.");
            System.exit(1);
        }

        // Employer is freaking out
        if (salary > 300000){
            System.err.println("We cant pay you this much of money!? And you're free to leave.");
            System.exit(1);
        }

        this.salary = salary;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }


}
