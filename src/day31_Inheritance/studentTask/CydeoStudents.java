package day31_Inheritance.studentTask;

public class CydeoStudents extends Student {

    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudents(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0){
            System.err.println("Batch number cannot be zero or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {

        if (groupNumber <= 0){
            System.err.println("Group number can not be zero or negative");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {

        boolean isValid = checkString(programmingLanguage);

        if (!isValid){
            System.err.println("Programming language can not be blank or empty");
            System.exit(1);
        }
        return programmingLanguage;
    }

    private boolean checkString(String str) {
        if (str.isEmpty() || str.isBlank()){
            return false;
        }
        return true;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName()+ " is eating food with wooden spoon and reviewing "+getProgrammingLanguage());
    }

    @Override
    public void drink(String drink) {
        System.out.println(getName()+ " can not study "+ getProgrammingLanguage()+ " without drinking "+drink);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is dreaming about wooden spoon and "+ getProgrammingLanguage() + " while he is sleeping");
    }

    @Override
    public String toString() {
        return super.toString()+" batchNumber: " + batchNumber + " | " + "groupNumber: " + groupNumber +
                " | " + "programmingLanguage: " + programmingLanguage + " |";
    }
}
/*
 3. CydeoStudent:

                        Extra Variables:
                            batchNumber, groupNumber, programmingLanguage

                        Encapsulate all the fields

                        Add a constructor that can set all the fields

                                Condition:
                                    1. batchNumber and groupNumber should not be set to zero or negative
                                    2. programmingLanguage should not be set to null
                                    3. programmingLanguage should not empty


                        Override the eat, drink and sleep methods (programmingLanguage need to be included)

                        Override the toString method:
                                name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included

 */