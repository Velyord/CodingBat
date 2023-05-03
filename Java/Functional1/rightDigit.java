/*
Task:
    Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

    rightDigit([1, 22, 93]) → [1, 2, 3]
    rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
    rightDigit([10, 0]) → [0, 0]
 */
package Java.Functional1;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class rightDigit {
    public static void main(String[] args) {
        out.println(rightDigit(Arrays.asList(1, 22, 93)));
        out.println(rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        out.println(rightDigit(Arrays.asList(10, 0)));
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);

        return nums;
    }
}
