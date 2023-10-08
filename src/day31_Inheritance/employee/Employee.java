package day31_Inheritance.employee;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;
    private String companyName;

    //--------------------------------------constructor -----------------------------------
    public Employee(String name, int age, char gender, String id, String jobTitle, double salary, String companyName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    // ------------------------------ setters and getters ------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {

        // if it has special characters
        boolean hasChars = hasChar(name);
        if (hasChars) {
            System.err.println("Name should not have special characters: " + name);
            System.exit(1);
        }
        // if there is a blank or empty name
        boolean isEmptyOrBlank = isEmptyOrBlank(name);
        if (isEmptyOrBlank) {
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }
        // if name start with digit
        boolean startWithDigit = startWithDigit(name);
        if (startWithDigit) {
            System.err.println("Name can not start with digit: " + name);
            System.exit(1);
        }
        // if name starts or ends with space
        boolean hasWhiteSpace = hasWhiteSpace(name);
        if (hasWhiteSpace) {
            System.err.println("Name should not starts or ends with space: \"" + name + "\"");
            System.exit(1);
        }
        // formatting name
        name = name.substring(0, 1).toUpperCase() + name.substring(1);

        this.name = name;
    }


    public int getAge() {
        return age;
    }

    // setting age conditions
    public void setAge(int age) {
        if (age < 18) {
            System.err.println("Invalid age. Employee age can not be less than 18 year old");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    // setting gender conditions
    public void setGender(char gender) {

        switch (gender) {
            case 'M':
            case 'm':
            case 'F':
            case 'f':
                break;
            default:
                System.err.println("Invalid gender: " + gender);
                System.exit(1);
        }
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        // check id length
        boolean idLength = idLenght(id);
        if (!idLength) {
            System.err.println("ID length should be between 3 and 5 characters: |" + id + " : " + id.length() + "|");
            System.exit(1);
        }
        // check if id starts with letter
        boolean startWithLetter = startWithLetter(id);
        if (!startWithLetter){
            System.err.println("ID number must start with letter: "+id);
            System.exit(1);
        }

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

    // setting salary conditions
    public void setSalary(double salary) {

        if (salary < 0) {
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    //-------------------------- custom methods and toString method---------------------------

    // check if id start with letter
    private boolean startWithLetter(String id) {
        if (Character.isLetter(id.charAt(0))){
            return true;
        }
        return false;
    }

    // check id length
    private boolean idLenght(String id) {
        int count = 0;
        for (char each : id.toCharArray()) {
            count++;
        }
        if (count >= 3 && count <= 5) {
            return true;
        }
        return false;
    }

    // check if string starts or ends with space
    private boolean hasWhiteSpace(String string) {
        if (string.length() == string.trim().length()) {
            return false;
        }
        return true;
    }

    // check if string start with digit
    private boolean startWithDigit(String string) {
        if (Character.isDigit(string.charAt(0))) {
            return true;
        }
        return false;
    }

    // check if string is empty or blank
    private boolean isEmptyOrBlank(String string) {
        if (string.isBlank() || string.isEmpty()) {
            return true;
        }
        return false;
    }

    // check if a string has special chars
    private boolean hasChar(String string) {
        int count = 0;
        for (char each : string.replace(" ", "").toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        }
        return false;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {

        return getClass().getSimpleName() + " ->" + " name: " + name + " | " + "age: " + age +
                " | " + "gender: " + gender + " id: " + id + " | " + "jobTitle: " + jobTitle +
                " | " + "salary: " + salary + " | " + "companyName: " + companyName +
                " |";
    }

}
/*
1. Create a class named Employee
            Variables:
                name, age, gender, id, jobTitle, salary, comapnyName

            Encapsulate all the fields
                condition:
                    1. Age can not be zero or negative
                    2. Age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    4. salary can not be negative

            Add a constructor to set all the fields

            Methods:
                work(): prints name + " is working"
                toString()

 */