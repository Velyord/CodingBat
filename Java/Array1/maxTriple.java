/*
Task:
    Given an array of ints of odd length,
    look at the first, last, and middle values in the array
    and return the largest.
    The array length will be a least 1.
Examples:
    maxTriple([1, 2, 3]) → 3
    maxTriple([1, 5, 3]) → 5
    maxTriple([5, 2, 3]) → 5
 */
package Java.Array1;

import static java.lang.System.out;

public class maxTriple {
    public static void main(String[] args) {
        out.println(maxTriple(new int[] {1, 2, 3}));
        out.println(maxTriple(new int[] {1, 5, 3}));
        out.println(maxTriple(new int[] {5, 2, 3}));
    }

    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int mid = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        return Math.max(first, Math.max(mid, last));
    }
}
