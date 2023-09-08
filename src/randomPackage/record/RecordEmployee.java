package randomPackage.record;
// Record is final
// With only one line of code, record is able to substitute the whole employee class
// Getters age given implicitly, they can ge access through an object
// No need to override toSting method as well equal method
// The fields of record are private and final by default
// Only supported by java 19
// Can not be extended by a class and can not extend classes
// Can implement interfaces

// Constructor that is generated automatically in record is called canonical constructor

public record RecordEmployee(String name, int age, String employeeId) { // this is canonical constructor
    // all the code down is optional this record can work with only one line of code
//------------------------------------------------------------------------------------------------------------

    // static fields can be passed her
    public static boolean hasJob;

    // accepts static blocks too
    static {
        hasJob = true;
    }

    // Constructor without parameter but the fields still can be passed to the body of constructor
    // Overriding default constructor

    public RecordEmployee {  // compact constructor
        if (name.isBlank() || name.isEmpty()) {
            throw new RuntimeException("Name can not be black or empty");
        }

        if (name.trim().length() != name.length()) {
            throw new RuntimeException("Name can not start or end with space ");
        }
        if (age <= 0) {
            throw new RuntimeException("Invalid age: " + age);
        }

    }


    public static void printHello() {  // static method
        System.out.println("Say hello");
    }

    public void sayHi() {  // instance method
        System.out.println("say hi to " + name);
    }

    public void work() {
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {  // no need to override toString method
        return "| Name: " + name + ", Age: " + age + ", Employee ID: " + employeeId + " |";
    }



}

