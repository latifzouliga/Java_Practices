package day19_practices;

import java.util.Arrays;

public class MoveToEnd {

    public static void main(String[] args) {

        int[] array = {3,0,2,0,100, 0, 5, 0, 1, 0};
        int[] zeroToEnd = new int[array.length];


        for (int i = 0, j = 0; i < array.length; i++) {

            int temp = 0;
            if (array[i] == 0) {
                continue;
            }
            temp = array[i];
            zeroToEnd[j++] = temp;


        }
        System.out.println(Arrays.toString(zeroToEnd));



    }


}






/*
7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */