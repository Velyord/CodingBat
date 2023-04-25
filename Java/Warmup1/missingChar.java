/*
Task:
    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).
 */
package Java.Warmup1;

import static java.lang.System.out;

public class missingChar {
    public static void main(String[] args) {
        out.println(missingChar("kitten", 1));
        out.println(missingChar("kitten", 0));
        out.println(missingChar("kitten", 4));
    }

    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}
