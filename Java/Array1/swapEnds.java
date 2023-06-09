/*
Task:
    Given an array of ints, swap the first and last elements in the array.
    Return the modified array. The array length will be at least 1.
Examples:
    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    swapEnds([1, 2, 3]) → [3, 2, 1]
    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */
package Java.Array1;

import java.util.Arrays;

public class swapEnds {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(swapEnds(new int[]{8, 6, 7, 9, 5})));
    }

    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }
}
