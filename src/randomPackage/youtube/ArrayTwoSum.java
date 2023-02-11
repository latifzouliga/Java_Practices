package randomPackage.youtube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayTwoSum {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 7, 35};

        int target = 10;

        int[] arr = twoSum(array,13);

        System.out.println(Arrays.toString(arr));

    }


    public static int[] twoSum(int[] array, int target){


        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int rm = target - array[i];

            if(map.containsKey(rm)){
                return new int[]{map.get(rm),i};
            }
            map.put(array[i],i);

        }
        return new int[]{};



    }

}
