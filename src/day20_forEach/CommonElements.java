package day20_forEach;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 8, 11, 12, 14, 15};
        int[] arr2 = {4, 5, 6, 7, 12, 14, 8};

        String result = "";
        for (int each : arr1) {

            for (int each2 : arr2) {
                if (each == each2) {
                    result += each + " ";
                }

            }
        }
        System.out.println("Comon numbers are: "+result);

    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */