/*
Task:
    Given 2 strings, a and b, return the number of the positions
    where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa",
    and "az" substrings appear in the same place in both strings.

    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
 */
package Java.Warmup2;

import static java.lang.System.out;

public class stringMatch {
    public static void main(String[] args) {
        out.println(stringMatch("xxcaazz", "xxbaaz"));
        out.println(stringMatch("abc", "abc"));
        out.println(stringMatch("abc", "axc"));
    }

    public static int stringMatch(String a, String b) {
        int count = 0;
        int smallerLength = Math.min(a.length(), b.length());

        for (int i = 0; i < smallerLength - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);

            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }
}
