package day23_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            for (Integer each : list) {
                nums.add(each);
            }
        }

        System.out.println(nums);

    }


}
/*
4. Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

 */