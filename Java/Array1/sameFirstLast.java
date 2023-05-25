/*
Task:
    Given an array of ints,
    return true if the array is length 1 or more,
    and the first element and the last element are equal.
Examples:
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
 */
package Java.Array1;

public class sameFirstLast {
    public static void main(String[] args) {
        output(false, sameFirstLast(new int[]{1, 2, 3}));
        output(true, sameFirstLast(new int[]{1, 2, 3, 1}));
        output(true, sameFirstLast(new int[]{1, 2, 1}));
    }
    public static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }
    public static void output(Object expected, Object actual) {
        System.out.println("Expected: " + expected
                + "\nActual: " + actual + "\n");
    }
}
