/*
Task:
    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false
 */
package Java.Warmup2;

import static java.lang.System.out;

public class arrayFront9 {
    public static void main(String[] args) {
        out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    public static boolean arrayFront9(int[] nums) {
        int numsLength = nums.length;

        if (numsLength > 4) numsLength = 4;

        for (int i = 0; i < numsLength; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }
}
