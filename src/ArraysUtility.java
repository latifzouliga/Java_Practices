import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    // swap(), replace(), replaceAll(), insert(), insertAll(), remove(), removeDup(),


// -------------------------------------------swap()--------------------------------------------------

    // swapping two elements with each other

    public static int[] swap(int[] array, int number1, int number2) {

        int first = 0;   // for storing index number
        int second = 0;  // for storing index number


        // extracting index number and storing it in first and last variables
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number1) {
                first = i;
            }
            if (array[i] == number2) {
                second = i;
            }
        }

        // declaring new Array with the same length as the original array
        int[] newArray = Arrays.copyOf(array, array.length);

        // swapping element by using their index numbers
        newArray[first] = array[second];
        newArray[second] = array[first];


        return newArray;

    }

    public static double[] swap(double[] array, double num1, double num2) {

        int first = 0;   // for storing index number
        int second = 0;  // for storing index number


        // extracting index number and storing it in first variable
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                first = i;
            }
            if (array[i] == num2) {
                second = i;
            }
        }


        // declaring new Array with the same length as the original array
        double[] newArray = Arrays.copyOf(array, array.length);

        // swapping element by using their index numbers
        newArray[first] = array[second];
        newArray[second] = array[first];

        return newArray;

    }

    public static char[] swap(char[] array, char char1, char char2) {

        int first = 0;   // for storing index number
        int second = 0;  // for storing index number


        // extracting index number and storing it in first variable
        for (char i = 0; i < array.length; i++) {
            if (array[i] == char1) {
                first = i;
            }
            if (array[i] == char2) {
                second = i;
            }
        }


        // declaring new Array with the same length as the original array
        char[] newArray = Arrays.copyOf(array, array.length);

        // swapping element by using their index numbers
        newArray[first] = array[second];
        newArray[second] = array[first];

        return newArray;

    }

    public static String[] swap(String[] array, String String1, String String2) {

        int first = 0;   // for storing index number
        int second = 0;  // for storing index number


        // extracting index number and storing it in first variable
        for (int i = 0; i < array.length; i++) {
            if (array[i] == String1) {
                first = i;
            }
            if (array[i] == String2) {
                second = i;
            }
        }


        // declaring new Array with the same length as the original array
        String[] newArray = Arrays.copyOf(array, array.length);

        // swapping element by using their index numbers
        newArray[first] = array[second];
        newArray[second] = array[first];

        return newArray;

    }


// -------------------------------------------replace()--------------------------------------------------

    // replace an old element with new one

    public static int[] replace(int[] array, int index, int element) {

        int[] newArray = Arrays.copyOf(array, array.length);

        newArray[index] = element;

        return newArray;

    }

    public static double[] replace(double[] array, int index, double element) {

        double[] newArray = Arrays.copyOf(array, array.length);

        newArray[index] = element;

        return newArray;

    }

    public static char[] replace(char[] array, int index, char element) {

        char[] newArray = Arrays.copyOf(array, array.length);

        newArray[index] = element;

        return newArray;

    }

    public static String[] replace(String[] array, int index, String element) {

        String[] newArray = Arrays.copyOf(array, array.length);

        newArray[index] = element;

        return newArray;

    }


// -------------------------------------------replaceAll()--------------------------------------------------

    // replace all matching elements with new element

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
    }

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
    }

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
    }

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
    }

// -------------------------------------------insert()--------------------------------------------------

    public static int[] insert(int[] array, int index, int element) {


        // dividing the original array from index 0 to specified index
        int[] first = Arrays.copyOfRange(array, 0, index + 1);
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
    }

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
    }

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
    }

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
    }

// -------------------------------------------insertAll()--------------------------------------------------

    // insert an array into another array with a specific index

    public static int[] insertAll(int[] array, int index, int[] insertArray) {


        int[] first = Arrays.copyOfRange(array, 0, index); // dividing the original array from index 0 to specified index

        int[] last = Arrays.copyOfRange(array, index, array.length);  // getting the last half of original array

        // merge 3 arrays
        int[] newArray = new int[first.length + last.length + insertArray.length]; // new array with an inserted an element to it

        // for each loop to combine two arrays
        int k = 0;

        for (int each : first) {
            newArray[k++] = each;
        }
        for (int each : insertArray) {
            newArray[k++] = each;
        }

        for (int each : last) {
            newArray[k++] = each;
        }

        return newArray;
    }

    public static double[] insertAll(double[] array, int index, double[] insertArray) {


        double[] first = Arrays.copyOfRange(array, 0, index); // dividing the original array from index 0 to specified index
        //first[index] = element; // inserting an element to a specified index
        double[] last = Arrays.copyOfRange(array, index, array.length);  // getting the last half of original array

        // merge two strings
        double[] newArray = new double[first.length + last.length + insertArray.length]; // new array with an inserted an element to it

        // for each loop to combine two arrays
        int k = 0;

        for (double each : first) {
            newArray[k++] = each;
        }
        for (double each : insertArray) {
            newArray[k++] = each;
        }

        for (double each : last) {
            newArray[k++] = each;
        }

        return newArray;
    }

    public static String[] insertAll(String[] array, int index, String[] insertArray) {


        String[] first = Arrays.copyOfRange(array, 0, index); // dividing the original array from index 0 to specified index
        //first[index] = element; // inserting an element to a specified index
        String[] last = Arrays.copyOfRange(array, index, array.length);  // getting the last half of original array

        // merge two strings
        String[] newArray = new String[first.length + last.length + insertArray.length]; // new array with an inserted an element to it

        // for each loop to combine two arrays
        int k = 0;

        for (String each : first) {
            newArray[k++] = each;
        }
        for (String each : insertArray) {
            newArray[k++] = each;
        }

        for (String each : last) {
            newArray[k++] = each;
        }

        return newArray;
    }

    public static char[] insertAll(char[] array, int index, char[] insertArray) {


        char[] first = Arrays.copyOfRange(array, 0, index); // dividing the original array from index 0 to specified index
        //first[index] = element; // inserting an element to a specified index
        char[] last = Arrays.copyOfRange(array, index, array.length);  // getting the last half of original array

        // merge two strings
        char[] newArray = new char[first.length + last.length + insertArray.length]; // new array with an inserted an element to it

        // for each loop to combine two arrays
        int k = 0;

        for (char each : first) {
            newArray[k++] = each;
        }
        for (char each : insertArray) {
            newArray[k++] = each;
        }

        for (char each : last) {
            newArray[k++] = each;
        }

        return newArray;
    }

    //---------------------------------------removeDup()-----------------------------------------------

    // remove duplicates and returns a wrapper classes  type

    public static Integer[] removeDup(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();


        for (int element : array) {
            int count = 0;
            for (int each : array) {

                if (list.contains(element)) {
                    continue;
                }
                list.add(element);
            }

        }
        Integer[] result = list.toArray(new Integer[0]);


        return result;
    }

    public static Double[] removeDup(double[] array) {

        ArrayList<Double> list = new ArrayList<>();


        for (double element : array) {
            int count = 0;
            for (double each : array) {
                if (list.contains(element)) {
                    continue;
                }
                list.add(element);
            }

        }

        Double[] result = list.toArray(new Double[0]);


        return result;
    }

    public static Character[] removeDup(char[] array) {

        ArrayList<Character> list = new ArrayList<>();


        for (char element : array) {
            int count = 0;
            for (char each : array) {
                if (each == element) {

                    if (list.contains(element)) {
                        continue;
                    }
                    list.add(element);
                }

            }

        }
        Character[] result = list.toArray(new Character[0]);


        return result;
    }

    public static String[] removeDup(String[] array) {

        ArrayList<String> list = new ArrayList<>();


        for (String element : array) {
            int count = 0;
            for (String each : array) {

                if (list.contains(element)) {
                    continue;
                }
                list.add(element);
            }

        }

        String[] result = list.toArray(new String[0]);


        return result;
    }

    //----------------------------------------remove()----------------------------------------------------

    // removes one element and return new array

    public static int[] remove(int[] array, int index) {

        int[] newArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {

            int elements = 0;
            if (i == index) {
                continue;
            }
            elements = array[i];
            newArray[j++] = elements;


        }

        return newArray;


    }

    public static double[] remove(double[] array, int index) {

        double[] newArray = new double[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {

            double elements = 0;
            if (i == index) {
                continue;
            }
            elements = array[i];
            newArray[j++] = elements;

        }

        return newArray;


    }

    public static char[] remove(char[] array, int index) {

        char[] newArray = new char[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {

            char elements = 0;
            if (i == index) {
                continue;
            }
            elements = array[i];
            newArray[j++] = elements;

        }

        return newArray;


    }

    public static String[] remove(String[] array, int index) {

        String[] newArray = new String[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {

            String elements = "";
            if (i == index) {
                continue;
            }
            elements = array[i];
            newArray[j++] = elements;

        }

        return newArray;


    }


    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {10, 20, 30, 40};

        int[] newArray1 = swap(array1, 1, 2);
        System.out.println(Arrays.toString(newArray1));


        int index = 3;
        int[] first = Arrays.copyOfRange(array1, 0, index);
        int[] last = Arrays.copyOfRange(array1, index, array1.length);

        int[] newArray = new int[array1.length + array2.length];

        int k = 0; // 4, 8

        for (int each : first) {
            newArray[k++] = each;
        }
        System.out.println(k);
        for (int each : array2) {
            newArray[k++] = each;
        }
        System.out.println(k);
        for (int each : last) {
            newArray[k++] = each;
        }
        System.out.println(Arrays.toString(newArray));


    }


}
