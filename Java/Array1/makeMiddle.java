/*
Task:
    Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
    The original array will be length 2 or more.
Examples:
    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class makeMiddle {
    public static void main(String[] args) {
        out.println(Arrays.toString(makeMiddle(new int[] {1, 2, 3, 4})));
        out.println(Arrays.toString(makeMiddle(new int[] {7, 1, 2, 3, 4, 9})));
        out.println(Arrays.toString(makeMiddle(new int[] {1, 2})));
    }

    public static int[] makeMiddle(int[] nums) {
        int[] a = new int[2];
        a[0] = nums[nums.length / 2 - 1];
        a[1] = nums[nums.length / 2];

        return a;
    }
}
