package day22_practices;

import java.util.ArrayList;

public class combineTwoArraysToArrayList {

    public static void main(String[] args) {



        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();


        int k = 0;   // to keep track of string arr1 and string arr2 indexes

        for (String each : arr1) {    // accessing element of arr1
            list.add(each);
            k++;
        }

        for (String each : arr2) {  // accessing elements of arr2
            list.add(each);
            k++;
        }

        System.out.println(list);



    }
}
/*
7. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */