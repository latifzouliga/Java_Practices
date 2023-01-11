package day40_practices;

import java.util.*;

public class Task5_JavaTopicsAndHours {

    public static void main(String[] args) {


        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 4.0);
        unit1.put("Escape Sequences", 2.0);
        unit1.put("Primitives", 4.0);
        unit1.put("Operators", 6.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 9.5);
        unit6.put("OOP Polymorphism", 7.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        System.out.println("------ 5.1 Create a List and store all the map objects given in above-----\n");

        List<Map<String, Double>> list = new ArrayList<>();

        list.addAll(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));

        System.out.println("-------5.2 Display each Java topic and its hours on the console-----------\n");

        for (Map<String, Double> eachTopic : list) {
            for (Map.Entry<String, Double> each : eachTopic.entrySet()) {
                System.out.println(each.getKey() + " : " + each.getValue());
            }
        }

        System.out.println("---5.3 Display the names of the java topics that we spend more than 7 hours--\n");

        list.forEach(v -> {
            v.forEach((key, value) -> {
                if (value > 7) {
                    System.out.println(key + " --> " + value + " hours");
                }
            });
        });

        System.out.println("-----------------------extra practice-------------------\n");

        for (Map<String, Double> eachTopic : list) {
            for (Map.Entry<String, Double> each : eachTopic.entrySet()) {
                if (each.getValue() > 7){
                    System.out.println(each.getKey()+" ---> "+each.getValue() + " hours");
                }
            }
        }


    }





}
/*
5. 	Given the following maps that contains the Java topics of each unit and the amount of hours that we spend on it:
		Map<String, Double> unit1 = new LinkedHashMap<>();
	        unit1.put("Print Statements", 4.0);
	        unit1.put("Escape Sequences", 2.0);
	        unit1.put("Primitives", 4.0);
	        unit1.put("Operators", 6.0);
	        unit1.put("If Statements", 9.0);
	        unit1.put("Switch Statement", 4.0);
	        unit1.put("Scanner", 6.0);

	         Map<String, Double> unit2 = new LinkedHashMap<>();
	        unit2.put("String Manipulation", 12.0);
	        unit2.put("Loops", 17.5);
	        unit2.put("Branching Statements", 1.5);
	        unit2.put("Arrays", 14.5);
	        unit2.put("Custom Methods", 16.5);
	        unit2.put("Wrapper Classes", 3.0);
	        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
	        unit3.put("Custom Methods", 16.5);
	        unit3.put("Wrapper Classes", 3.0);
	        unit3.put("ArrayList", 11.5);

	        Map<String, Double> unit4 = new LinkedHashMap<>();
	        unit4.put("Custom Class", 23.5);
	        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
	        unit5.put("OOP Encapsulation", 4.5);
	        unit5.put("OOP Inheritance", 13.5);
	        unit5.put("Final keyword", 2.5);
	        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
	        unit6.put("OOP Abstraction", 9.5);
	        unit6.put("OOP Polymorphism", 7.5);
	        unit6.put("Collection", 9.5);
	        unit6.put("Map", 7.5);


        5.1 Create a List and store all the map objects given in above

        5.2 Display each Java topic and its hours on the console

        5.3 Display the names of the java topics that we spend more than 7 hours

 */