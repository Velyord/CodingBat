/*
Task:
    Given a list of integers, return a list of the integers, omitting any that are less than 0.

    noNeg([1, -2]) → [1]
    noNeg([-3, -3, 3, 3]) → [3, 3]
    noNeg([-1, -1, -1]) → []
 */
package Java.Functional2;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class noNeg {
    public static void main(String[] args) {
        out.println(noNeg(new ArrayList<>(Arrays.asList(1, -2))));
        out.println(noNeg(new ArrayList<>(Arrays.asList(-3, -3, 3, 3))));
        out.println(noNeg(new ArrayList<>(Arrays.asList(-1, -1, -1))));
    }

    static ArrayList<Integer> noNeg(ArrayList<Integer> nums) {
        nums.removeIf(n -> n < 0);

        return nums;
    }
}