/*
Task:
    Given a string of even length, return a string made of the middle two chars,
    so the string "string" yields "ri". The string length will be at least 2.
Example:
    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"
 */
package Java.String1;

import static java.lang.System.out;

public class middleTwo {
    public static void main(String[] args) {
        out.println(middleTwo("string"));
        out.println(middleTwo("code"));
        out.println(middleTwo("Practice"));
    }

    public static String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
    }
}
