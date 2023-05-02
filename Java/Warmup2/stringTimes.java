/*
Task:
    Given a string and a non-negative int n,
    return a larger string that is n copies of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
 */
package Java.Warmup2;

import static java.lang.System.out;

public class stringTimes {
    public static void main(String[] args) {
        out.println(stringTimes("Hi", 2));
        out.println(stringTimes("Hi", 3));
        out.println(stringTimes("Hi", 1));
    }

    public static String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            result.append(str);
        }

        return result.toString();
    }
}
