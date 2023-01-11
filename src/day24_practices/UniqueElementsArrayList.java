package day24_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElementsArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        if (list.indexOf(1) == list.lastIndexOf(1)) {
            System.out.print(1 + " ");
        }
        if (list.indexOf(2) == list.lastIndexOf(2)) {
            System.out.print(2 + " ");
        }
        if (list.indexOf(3) == list.lastIndexOf(3)) {
            System.out.print(3 + " ");
        }
        if (list.indexOf(4) == list.lastIndexOf(4)) {
            System.out.print(4 + " ");
        }
        if (list.indexOf(5) == list.lastIndexOf(5)) {
            System.out.print(5 + " ");
        }



    }
}
/*
1. Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops
 */