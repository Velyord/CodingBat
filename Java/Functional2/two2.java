/*
Task:
    Given a list of non-negative integers, return a list of those numbers multiplied by 2,
    omitting any of the resulting numbers that end in 2.

    two2([1, 2, 3]) → [4, 6]
    two2([2, 6, 11]) → [4]
    two2([0]) → [0]
 */
package Java.Functional2;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class two2 {
    public static void main(String[] args) {
        out.println(two2(new ArrayList<>(Arrays.asList(1, 2, 3))));
        out.println(two2(new ArrayList<>(Arrays.asList(2, 6, 11))));
        out.println(two2(new ArrayList<>(Arrays.asList(0))));
    }

    public static ArrayList<Integer> two2(ArrayList<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);

        return nums;
    }
}
