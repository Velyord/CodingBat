/*
Task:
    Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.
Examples:
    frontPiece([1, 2, 3]) → [1, 2]
    frontPiece([1, 2]) → [1, 2]
    frontPiece([1]) → [1]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class frontPiece {
    public static void main(String[] args) {
        out.println(Arrays.toString(frontPiece(new int[]{1, 2, 3})));
        out.println(Arrays.toString(frontPiece(new int[]{1, 2})));
        out.println(Arrays.toString(frontPiece(new int[]{1})));
    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }

        int[] arr = new int[2];
        arr[0] = nums[0];
        arr[1] = nums[1];

        return arr;
    }
}
