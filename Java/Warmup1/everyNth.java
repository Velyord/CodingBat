/*
Task:
    Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on.
    N is 1 or more.

    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
 */
package Java.Warmup1;

import static java.lang.System.out;

public class everyNth {
    public static void main(String[] args) {
        out.println(everyNth("Miracle", 2));
        out.println(everyNth("abcdefg", 2));
        out.println(everyNth("abcdefg", 3));
    }

    public static String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
