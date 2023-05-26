/*
Task:
    Given an array of ints of odd length,
    return a new array length 3 containing the elements from the middle of the array.
    The array length will be at least 3.
Examples:
    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class midThree {
    public static void main(String[] args) {
        out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));
        out.println(Arrays.toString(midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        out.println(Arrays.toString(midThree(new int[]{1, 2, 3})));
    }

    public static int[] midThree(int[] nums) {
        int[] arr = new int[3];
        int mid = nums.length / 2;

        arr[0] = nums[mid - 1];
        arr[1] = nums[mid];
        arr[2] = nums[mid + 1];

        return arr;
    }
}
