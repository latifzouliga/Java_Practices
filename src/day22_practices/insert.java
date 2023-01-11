package day22_practices;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int index = 2;
        int element = 44;
        int[] array = new int[arr.length + 1];





    }

    public static int[] insert(int[] array, int index, int element) {


        int[] first = Arrays.copyOfRange(array, 0, index + 1); // dividing the original array from index 0 to specified index
        first[index] = element; // inserting an element to a specified index
        int[] last = Arrays.copyOfRange(array, index, array.length);  // getting the last half of original array

        // merge two strings
        int[] newArray = new int[first.length + last.length]; // new array with an inserted an element to it

        // for each loop to combine two arrays
        int k = 0;

        for (int each : first) {
            newArray[k++] = each;
        }
        for (int each : last) {
            newArray[k++] = each;
        }

        return newArray;
    } // inset an element to a specific index and return new array

    public static double[] insert(double[] array, int index, double element) {

        double[] first = Arrays.copyOfRange(array, 0, index + 1); // dividing the original array from index 0 to specified index
        first[index] = element; // inserting an element to a specified index
        double[] last = Arrays.copyOfRange(array, index, array.length);  // getting the last half of original array

        // merge two strings
        double[] newArray = new double[first.length + last.length]; // new array with an inserted an element to it

        // for each loop to combine two arrays
        int k = 0;

        for (double each : first) {
            newArray[k++] = each;
        }
        for (double each : last) {
            newArray[k++] = each;
        }

        return newArray;
    } // inset an element to a specific index and return new array

    static char[] insert(char[] array, int index, char element) {

        char[] first = Arrays.copyOfRange(array, 0, index + 1); // dividing the original array from index 0 to specified index
        first[index] = element; // inserting an element to a specified index
        char[] last = Arrays.copyOfRange(array, index, array.length);  // getting the last half of original array

        // merge two strings
        char[] newArray = new char[first.length + last.length]; // new array with an inserted an element to it

        // for each loop to combine two arrays
        int k = 0;

        for (char each : first) {
            newArray[k++] = each;
        }
        for (char each : last) {
            newArray[k++] = each;
        }

        return newArray;
    } // inset an element to a specific index and return new array

    static String[] insert(String[] array, int index, String element) {

        String[] first = Arrays.copyOfRange(array, 0, index + 1); // dividing the original array from index 0 to specified index
        first[index] = element; // inserting an element to a specified index
        String[] last = Arrays.copyOfRange(array, index, array.length);  // getting the last half of original array

        // merge two strings
        String[] newArray = new String[first.length + last.length]; // new array with an inserted an element to it

        // for each loop to combine two arrays
        int k = 0;

        for (String each : first) {
            newArray[k++] = each;
        }
        for (String each : last) {
            newArray[k++] = each;
        }

        return newArray;
    } // inset an element to a specific index and return new array


}
/*
Insert Task:
        1.1 Create a method named insert that passes three parameters: integer array, integer index, integer
         element. the method inserts the given element to the given index of the array and returns the new array
                Ex:
                    arr = {10, 20, 30, 40, 50};

                    insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


        1.2 Create the same function for double array, char array and string array
 */