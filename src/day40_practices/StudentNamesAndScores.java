package day40_practices;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentNamesAndScores {

    public static void main(String[] args) {

        Map<String, int[]> studentScores = new LinkedHashMap<>();

        studentScores.put("Jalil", new int[]{57, 34, 34, 44, 3});
        studentScores.put("Murad", new int[]{55, 60, 70, 80, 90});
        studentScores.put("Dalila", new int[]{100, 1, 55, 78, 30});
        studentScores.put("Jamila", new int[]{99, 88, 87, 67, 95});
        studentScores.put("Halima", new int[]{98, 571, 23, 98, 12});

        System.out.println("----------update dalila scores------------------");

        studentScores.replace("Dalila", new int[]{99, 88, 33, 77, 99});

        System.out.println("Write a program that can display each student name and scores");

        studentScores.forEach((k, v) -> System.out.println(k + ": " + Arrays.toString(v)));

        System.out.println("-------------------Extra practice------------------------");
        // print each student and the scores in separate lines
        studentScores.forEach((k, v) -> {
            System.out.println(k);
            for (int each : v) {
                System.out.println(each);
            }
        });

        System.out.println("---------update the Jalil's second score-------------");

        studentScores.get("Jalil")[1] = 99;
        System.out.println(Arrays.toString(studentScores.get("Jalil")));

        System.out.println("---------------print the highest score-------------------");

        var ref = new Object() {
            int max = studentScores.get("Jalil")[0];
        };
        studentScores.forEach((k, v) -> {
            for (int each : v) {
                if (each > ref.max) {
                    ref.max = each;
                }
            }
        });
        System.out.println("The highest score is: " + ref.max);

        System.out.println("--------------------print the lowest score--------------------");
        int min = studentScores.get("Jalil")[0];

        for (Map.Entry<String, int[]> eachEntry : studentScores.entrySet()) {
            for (int each : eachEntry.getValue()) {
                if (each < min) {
                    min = each;
                }
            }
        }
        System.out.println("The lowest score is: " + min);


    }
}
/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair
 (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */