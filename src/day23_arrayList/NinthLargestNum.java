package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class NinthLargestNum {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        int n = 8;

        int one = list.indexOf(Integer.valueOf(n));

        System.out.println("one = " + one);





    }

}
/*
5. write a program that can return the nth largest number from an arraylist
        ex:
        arraylist = {1,2,3,4,5,6,7,7,8,8}
        n = 5

        output:
        4


 */