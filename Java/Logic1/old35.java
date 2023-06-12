/*
Task:
    Return true if the given non-negative number is a multiple of 3 or 5,
    but not both. Use the % "mod" operator

Examples:
    old35(3) → true
    old35(10) → true
    old35(15) → false
 */
package Java.Logic1;

import static java.lang.System.out;

public class old35 {
    public static void main(String[] args) {
        out.println(old35(3));
        out.println(old35(10));
        out.println(old35(15));
    }

    public static boolean old35(int n) {
        return n % 3 == 0 ^ n % 5 == 0;
    }
}
