/*
Task:
    Given a string, consider the prefix string made of the first N chars of the
    string. Does that prefix string appear somewhere else in the string? Assume
    that the string is not empty and that N is in the range 1..str.length().

Examples:
    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
 */
package Java.String2;

import static java.lang.System.out;

public class prefixAgain {
    public static void main(String[] args) {
        out.println(prefixAgain("abXYabc", 1));
        out.println(prefixAgain("abXYabc", 2));
        out.println(prefixAgain("abXYabc", 3));
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);

        for (int i = n; i < str.length() - n + 1; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }

        return false;
    }
}
