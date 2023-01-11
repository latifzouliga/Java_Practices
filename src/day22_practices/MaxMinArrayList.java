package day22_practices;

import java.util.ArrayList;

public class MaxMinArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(2);
        list.add(-3);
        list.add(4);
        list.add(5);
        list.add(-600);

        int max = list.get(0); // assuming that the element in index 0 is the max number
        int min = list.get(0); // assuming that the element in index 0 in the min number

        for (Integer each : list) {
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);


    }


}
/*
8. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */