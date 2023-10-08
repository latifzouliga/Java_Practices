package day22_arrayList;

import java.util.Arrays;

public class ReplaceAll {


    public static void main(String[] args) {

        char[] ch = {'a', 'b', 'a', 'd', 'e', 'a', 'g','b','b'};

        char[] ab = replaceAll(ch,'b','@');

        System.out.println(Arrays.toString(ab));



    }
/*
        int[] newArray = new int[arr.length];
        int count= 0;
        int digit = 30;

        // getting the index of high frequency number
        for (int each : arr) {
            count = 0;
            for (int element : arr) {
                if (each == element){
                    count++;
                }
            }
            if (count >= 3){
                digit = each;
            }
        }



        // replacing
        for (int i = 0; i < newArray.length; i++) {
            if (digit == arr[i]){

                newArray[i] = num;
            }else {
                newArray[i] = arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArray));

    }

 */

    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length; i++) {
            if (oldElement == array[i]) {

                newArray[i] = newElement;
            } else {
                newArray[i] = array[i];
            }

        }

        return newArray;
    } // replace all matching elements with new element

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        double[] newArray = new double[array.length];

        for (int i = 0; i < newArray.length; i++) {
            if (oldElement == array[i]) {

                newArray[i] = newElement;
            } else {
                newArray[i] = array[i];
            }

        }

        return newArray;
    } // replace all matching elements with new element
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        char[] newArray = new char[array.length];

        for (int i = 0; i < newArray.length; i++) {
            if (oldElement == array[i]) {

                newArray[i] = newElement;
            } else {
                newArray[i] = array[i];
            }

        }

        return newArray;
    } // replace all matching elements with new element

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        String[] newArray = new String[array.length];

        for (int i = 0; i < newArray.length; i++) {
            if (oldElement == array[i]) {

                newArray[i] = newElement;
            } else {
                newArray[i] = array[i];
            }

        }

        return newArray;
    } // replace all matching elements with new elemen
    
    
    
    
    

}
/*
2. ReplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement,
         integer newElement. The method replaces all the element of the array that matching with the given old 
         element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays
 */