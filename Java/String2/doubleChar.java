/*
Task:
    Given a string, return a string where for every char in the original,
    there are two chars.

Examples:
    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
 */
package Java.String2;

import static java.lang.System.out;

public class doubleChar {
    public static void main(String[] args) {
        out.println(doubleChar("The"));
        out.println(doubleChar("AAbb"));
        out.println(doubleChar("Hi-There"));
    }

    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i))
                  .append(str.charAt(i));
        }

        return result.toString();
    }
}
