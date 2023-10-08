package day40_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExtraPractice {

    public static void main(String[] args) {

        Map<String, int[]> studentScores = new LinkedHashMap<>();

        studentScores.put("Jalil", new int[]{57, 34, 34, 44, 3});
        studentScores.put("Murad", new int[]{55, 60, 70, 80, 90});
        studentScores.put("Dalila", new int[]{100, 1, 55, 78, 30});
        studentScores.put("Jamila", new int[]{99, 88, 87, 67, 95});
        studentScores.put("Halima", new int[]{98, 571, 23, 98, 12});

        System.out.println("Write a program that can display each student name and scores");



    }
}
