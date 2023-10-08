package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> numbers = new ArrayList<>();

        for (Integer each : list) {
            if (each % 2 != 0){
               numbers.add(each * 2);
            }else {
                numbers.add(each);
            }
        }
        System.out.println(numbers);

        System.out.println("--------------------------------------------------------");

        int[] nums = {1, 2, 3, 4, 5};

        int[] numbs = new int[nums.length];

        int k = 0;

        for (int each : nums) {
            if (each % 2 != 0){
                numbs[k++] = each * 2;
            }else {
                numbs[k++] = each;
            }
        }
        System.out.println(Arrays.toString(numbs));


    }
}
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

 */