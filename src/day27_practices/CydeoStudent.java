package day27_practices;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public String batchNumber;
    public String groupNumber;

    public static String schoolName;
    public static String fieldOfStudy;
    public static String  programmingLanguage;
    public static String magicWord;


    public CydeoStudent(String name, char gender, int age, String batchNumber, String groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName = "Cydeo School";
        fieldOfStudy = "IT";
        programmingLanguage = "Java";
        magicWord = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printSecretCode(){
        System.out.println(magicWord);
    }

    public void attendClass(){
        System.out.println(name + " Attended class");
    }
    public void study(){
        System.out.println(name+ " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */