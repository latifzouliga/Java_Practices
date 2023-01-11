package day20_practices;

public class CountEvenOddNum {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};


        int even = 0;
        int odd = 0;

        for (int each : nums) {
            if (each % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("There are: " + even + " even numbers");
        System.out.println("There are: " + odd + " odd numbers");


    }


}
/*
2.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */