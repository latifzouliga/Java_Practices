package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        for (int i = 0 ; i < numbers.size(); i++) {

            Integer zero = 0;
            Integer temp;
            if (numbers.get(i).equals(zero)){
                temp = numbers.get(i);
                numbers.remove(i);
                numbers.add(temp);
            }


        }
        System.out.println(numbers);



    }


}
/*
6. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */