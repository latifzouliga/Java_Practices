package day19_practices;

import java.util.Arrays;

public class ReverseInteger {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[]reverseArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i-- , j++) {
            reverseArray[j] = array[i];
        }
        System.out.println(Arrays.toString(reverseArray));


    }
}
/*
6.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */