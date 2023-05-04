/*
Task:
    Given a list of integers, return a list of those numbers squared and the product added to 10,
    omitting any of the resulting numbers that end in 5 or 6.

    square56([3, 1, 4]) → [19, 11]
    square56([1]) → [11]
    square56([2]) → [14]
 */
package Java.Functional2;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class square56 {
    public static void main(String[] args) {
        out.println(square56(new ArrayList<>(Arrays.asList(3, 1, 4))));
        out.println(square56(new ArrayList<>(Arrays.asList(1))));
        out.println(square56(new ArrayList<>(Arrays.asList(2))));
    }

    public static ArrayList<Integer> square56(ArrayList<Integer> nums) {
        nums.replaceAll(n -> n * n + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);

        return nums;
    }
}
