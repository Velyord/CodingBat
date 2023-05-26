/*
Task:
    Given an array of ints length 3, return the sum of all the elements.
Examples:
    sum3([1, 2, 3]) → 6
    sum3([5, 11, 2]) → 18
    sum3([7, 0, 0]) → 7
 */
package Java.Array1;

import static java.lang.System.out;

public class sum3 {
    public static void main(String[] args) {
        output(6, sum3(new int[] {1, 2, 3}));
        output(18, sum3(new int[] {5, 11, 2}));
        output(7, sum3(new int[] {7, 0, 0}));
    }
    public static int sum3(int[] nums) {
        return (nums[0] + nums[1] + nums[2]);
    }

    public static void output(Object expected, Object actual) {
        out.println(
                "Expected: " + expected + " | " + actual + " :Actual\n"
        );
    }
}
