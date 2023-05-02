/*
Task:
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
 */
package Java.Warmup2;

import static java.lang.System.out;

public class array123 {
    public static void main(String[] args) {
        out.println(array123(new int[]{1, 1, 2, 3, 1}));
        out.println(array123(new int[]{1, 1, 2, 4, 1}));
        out.println(array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    public static boolean array123(int[] nums) {
        if (nums.length < 3) return false;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }

        return false;
    }
}
