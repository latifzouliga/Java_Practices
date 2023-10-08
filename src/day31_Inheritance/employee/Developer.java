package day31_Inheritance.employee;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    //  -------------- setter and getter ----------------------

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    // ------------------overridden methods------------------------


    @Override
    public void work() {
        System.out.println(getJobTitle() +" "+ getName() + " is coding in "+programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString()+  "programmingLanguage: " + programmingLanguage;
    }
}
/*
 2. Create the following subclasses and override the work method in each subclass:
 2. Developer
                    Extra variable:
                        programmingLanguage

                    work(): jobTitle + name + " is coding in "+programmingLanguage

 */