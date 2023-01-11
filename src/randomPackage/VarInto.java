package randomPackage;

import day17_practices.Student;

import java.util.ArrayList;
import java.util.List;

public class VarInto {

    public static void main(String[] args) {

        /** java 10 introduced a new way to declare variables using the var keyword.

         The following is an example of variable declaration using var

         */
        // Int
        var x = 10;

        // Double
        var y = 2.10;

        // Char
        var z = 'a';

        // String
        var p = "John";

        // Boolean
        var q = false;

        // Type inference is used in the var keyword in
        // which it automatically detects the data type
        // of a variable
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);

        /** One good thing about the var keyword is that it removes the duplication of the type of a variable,
         *  as shown below:
         */

        // Without var
        Student stu = new Student();
        // With var
        var student = new Student();
        student.name = "Abdellatif";
        System.out.println(student.name);

        /** We cannot use it to declare local variables inside methods.
         *  We cannot use it to declare method parameters or instance fields.
         *  We cannot use it to specify the return type of a method.
         *  We cannot use it with a generic type. */

        // var<String> names = new ArrayList<String>(); // ERROR
    }
}
