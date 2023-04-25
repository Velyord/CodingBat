/*
Task:
    Given three int values, a b c, return the largest.
 */
package Java.Warmup1;

import static java.lang.System.out;

public class intMax {
    public static void main(String[] args) {
        out.println(intMax(1, 2, 3));
        out.println(intMax(1, 3, 2));
        out.println(intMax(3, 2, 1));
    }

    public static int intMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
