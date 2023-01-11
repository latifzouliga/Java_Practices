package day22_practices;

import java.lang.module.FindException;
import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        String[] str = {"Hello", "this", "is", "java","and", "java", "not", "bad"};

        String[] s = swap(str,"Hello","java");


        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(s));





    }

    public static int[] swap(int[] array, int number1, int number2){

        int first = 0;   // for storing index number
        int second = 0;  // for storing index number
       

        // extracting index number and storing it in first and last variables
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number1){
                first = i;
            }
            if (array[i] == number2){
                second = i;
            }
        }
        
        // declaring new Array with the same length as the original array
        int[] newArray = Arrays.copyOf(array,array.length);

        // swapping element by using their index numbers
        newArray[first] = array[second];
        newArray[second] = array[first];
        

        return newArray;

    }  // swapping two int elements

    public static double[] swap(double[] array, double num1, double num2){

        int first = 0;   // for storing index number
        int second = 0;  // for storing index number


        // extracting index number and storing it in first variable
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1){
                first = i;
            }
            if (array[i] == num2){
                second = i;
            }
        }


        // declaring new Array with the same length as the original array
        double[] newArray = Arrays.copyOf(array,array.length);

        // swapping element by using their index numbers
        newArray[first] = array[second];
        newArray[second] = array[first];

        return newArray;

    } // swapping two double elements

    public static char[] swap(char[] array, char char1, char char2){

        int first = 0;   // for storing index number
        int second = 0;  // for storing index number
        

        // extracting index number and storing it in first variable
        for (char i = 0; i < array.length; i++) {
            if (array[i] == char1){
                first = i;
            }
            if (array[i] == char2){
                second = i;
            }
        }
        

        // declaring new Array with the same length as the original array
        char[] newArray = Arrays.copyOf(array,array.length); 

        // swapping element by using their index numbers
        newArray[first] = array[second];
        newArray[second] = array[first];
        
        return newArray;

    } // swapping two char elements
    public static String[] swap(String[] array, String String1, String String2){

        int first = 0;   // for storing index number
        int second = 0;  // for storing index number


        // extracting index number and storing it in first variable
        for (int i = 0; i < array.length; i++) {
            if (array[i] == String1){
                first = i;
            }
            if (array[i] == String2){
                second = i;
            }
        }


        // declaring new Array with the same length as the original array
        String[] newArray = Arrays.copyOf(array,array.length);

        // swapping element by using their index numbers
        newArray[first] = array[second];
        newArray[second] = array[first];

        return newArray;

    } // swapping two string elements

    


}
/*
4. Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
    the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array

 */