/*
Task:
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
    Use the % "mod" operator -- see Introduction to Mod
 */
package Java.Warmup1;

import static java.lang.System.out;

public class or35 {
    public static void main(String[] args) {
        out.println(or35(3));
        out.println(or35(10));
        out.println(or35(8));
    }

    private static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }
}
