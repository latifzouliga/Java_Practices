package randomPackage.java10_to_java21;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VarDemo {

    public static void main(String[] args) throws IOException {

        // var: also called LVTI: local variable type inference
        // it only works with local variables
        // it looks like dynamic typing but IT IS NOT
        // for var it is must to initialize
        var num = 9;
        var pi = 3.14;
        // pi = "Java" // compile error


        System.out.println("Enter names: ");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        List<String> names = new ArrayList<>();

        names.add(br.readLine());
        names.add(br.readLine());

        System.out.println(names);

        //===========================
        // easier to read


        System.out.println("Enter names: ");
        //var reader1 = new InputStreamReader(System.in);
        var br1 = new BufferedReader(new InputStreamReader(System.in));
        var names1 = new ArrayList<>();

        names1.add(br1.readLine());
        names1.add(br1.readLine());

        System.out.println(names1);


    }
}
