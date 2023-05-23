/*
Task:
    Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.
Example:
    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
 */
package Java.String1;

import static java.lang.System.out;

public class middleThree {
    public static void main(String[] args) {
        out.println(middleThree("Candy"));
        out.println(middleThree("and"));
        out.println(middleThree("solving"));
    }

    public static String middleThree(String str) {
        int middle = str.length() / 2;

        return str.substring(middle - 1, middle + 2);
    }
}
