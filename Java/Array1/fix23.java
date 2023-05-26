/*
Task:
    Given an int array length 3, if there is a 2 in the array immediately
    followed by a 3, set the 3 element to 0. Return the changed array.
Examples:
    fix23([1, 2, 3]) → [1, 2, 0]
    fix23([2, 3, 5]) → [2, 0, 5]
    fix23([1, 2, 1]) → [1, 2, 1]
 */
package Java.Array1;

import java.util.Arrays;
import static java.lang.System.out;

public class fix23 {
    public static void main(String[] args) {
        output(Arrays.toString(new int[] {1, 2, 0}), Arrays.toString(fix23(new int[] {1, 2, 3})));
        output(Arrays.toString(new int[] {2, 0, 5}), Arrays.toString(fix23(new int[] {2, 3, 5})));
        output(Arrays.toString(new int[] {1, 2, 1}), Arrays.toString(fix23(new int[] {1, 2, 1})));
    }

    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }

        return nums;
    }

    public static void output(Object expected, Object actual) {
        out.println(
                "Expected | Actual -> " + expected + " | " + actual + "\n"
        );
    }
}
