/*
Task:
    We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
    Return true if the given non-negative number is special.
    Use the % "mod" operator

Examples:
    specialEleven(22) → true
    specialEleven(23) → true
    specialEleven(24) → false
 */
package Java.Logic1;

import static java.lang.System.out;

public class specialEleven {
    public static void main(String[] args) {
        out.println(specialEleven(22));
        out.println(specialEleven(23));
        out.println(specialEleven(24));
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }
}