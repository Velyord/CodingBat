/*
Task:
    Given an array of ints, return the number of 9's in the array.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3
 */
package Java.Warmup2;

import static java.lang.System.out;

public class arrayCount9 {
    public static void main(String[] args) {
        out.println(arrayCount9(new int[]{1, 2, 9}));
        out.println(arrayCount9(new int[]{1, 9, 9}));
        out.println(arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }

    public static int arrayCount9(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }

        return count;
    }
}
