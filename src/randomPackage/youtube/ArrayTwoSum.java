package randomPackage.youtube;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayTwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6, 7, 35};

        System.out.println(Arrays.toString(twoSum(new int[]{12, 34, 10, 4, 4}, 22)));
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
