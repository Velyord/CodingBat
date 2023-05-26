/*
Task:
    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
Examples:
    makePi() → [3, 1, 4]
 */
package Java.Array1;

import java.util.Arrays;

import static java.lang.System.out;

public class makePi {
    public static void main(String[] args) {
        output(Arrays.toString(new int[]{3, 1, 4}), Arrays.toString(makePi()));
    }

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static void output(Object expected, Object actual) {
        out.println("Expected: " + expected
                + "\nActual: " + actual + "\n");
    }
}
