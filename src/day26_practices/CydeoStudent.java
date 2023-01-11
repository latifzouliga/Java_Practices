package day26_practices;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public String id;
    public char grade;
    public  String batchNumber;
    public int groupNumber;
    public static String schoolName = "Cydeo School";
    public static String magicWord = "Wooden Spoon";


    public CydeoStudent(String name, int age, char gender, String id, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){

    }

    public void attendClass(){

    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void proLanguage(){
        System.out.println("Java");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */