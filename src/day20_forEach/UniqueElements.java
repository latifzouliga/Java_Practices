
package day20_forEach;

public class UniqueElements {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 2, 5, 1, 1, 1, 22, 3};
        int count = 0;
        String str = "";

        for (int each1 : numbers) {
            count = 0;
            for (int each2 : numbers) {
                if (each1 == each2){
                    count++;
                }
            }
            if (count == 1){
                str += each1 + " ";
            }
        }
        System.out.println(str);

    }
}
/*
5. Write a program that can display the unique elements of an array

			MUST use for each loops
 */