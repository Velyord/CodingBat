/*
Task:
    Given 2 strings, return their concatenation,
    except omit the first char of each. The strings will be at least length 1.
Examples:
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
 */
package Java.String1;

import static java.lang.System.out;

public class nonStart {
    public static void main(String[] args) {
        out.println(nonStart("Hello", "There"));
        out.println(nonStart("java", "code"));
        out.println(nonStart("shotl", "java"));
    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
