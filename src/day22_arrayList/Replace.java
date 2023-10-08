package day22_arrayList;

import java.util.Arrays;

public class Replace {

    // replace an old element with new one
    public static int[] replace(int[] array, int index, int element){

        int[] newArray = Arrays.copyOf(array,array.length);

        newArray[index] = element;

        return newArray;

    } // replace an old int element with new one by its index

    public static double[] replace(double[] array, int index, double element){

        double[] newArray = Arrays.copyOf(array,array.length);

        newArray[index] = element;

        return newArray;

    } // replace an old double element with new one by its index

    public static char[] replace(char[] array, int index, char element){

        char[] newArray = Arrays.copyOf(array,array.length);

        newArray[index] =  element;

        return newArray;

    } // replace an old char element with new one by its index

    public static String[] replace(String[] array, int index, String element){

        String[] newArray = Arrays.copyOf(array,array.length);

        newArray[index] =  element;

        return newArray;

    } // replace an old string element with new one by its index




    /*

    public static void main(String[] args) {

        // ------------------------------------- test int replace() method ---------------------------------
        int[] arr = {1, 2, 3, 4, 5};

        int[] newArray1 = replace(arr, 3, 100);

        System.out.println(Arrays.toString(newArray1));

        // ------------------------------------- test double replace() method ---------------------------------

        double[] arra1 = {20.3, 4.5, 16.3, 10.0, 12.12, 100.5};

        double[] arra2 = replace(arra1, arra1.length - 1, 500.20);

        System.out.println(Arrays.toString(arra1));

        System.out.println(Arrays.toString(arra2));
        System.out.println("---------------------------------------------");

        // ------------------------------------- test char replace() method ---------------------------------

        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

         char[] ch1 = replace(ch,2,'@');

        System.out.println(Arrays.toString(ch1));
        System.out.println("---------------------------------------------");

        // ------------------------------------- test string replace() method ---------------------------------

        String[] str = {"Hello", "this", "is", "java","and", "java", "not", "bad"};

        String[] str1 = replace(str,5,"Python");

        System.out.println(Arrays.toString(str1));


    }



    //----------------------------------------- replace() methods ----------------------------------------------

    public static int[] replace(int[] array, int index, int element) {

        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {

            }
            newArray[i] = array[i];
            newArray[index] = element;
        }
        return newArray;


    } // replace an element by its index number


    public static double[] replace(double[] array, int index, double element) {

        double[] newArray = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {

            }
            newArray[i] = array[i];
            newArray[index] = element;
        }
        return newArray;


    } // replace double element

    public static char[] replace(char[] array, int index, char element) {

        char[] newArray = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {

            }
            newArray[i] = array[i];
            newArray[index] = element;
        }
        return newArray;


    } // replace char element


    public static String[] replace(String[] array, int index, String element) {

        String[] newArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(index)) {

            }
            newArray[i] = array[i];
            newArray[index] = element;
        }
        return newArray;


    } // replace string element

     */  // replace an old element with new one using loop

}

/*
1. Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer
         newElement. The method replaces the element of the array at given index with the new element,
         and returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String array
 */
