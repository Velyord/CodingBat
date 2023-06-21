/*
Task:
    Return true if the given string contains a "bob" string,
    but where the middle 'o' char can be any char.

Examples:
    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
 */
package Java.String2;

import static java.lang.System.out;

public class bobThere {
    public static void main(String[] args) {
        out.println(bobThere("abcbob"));
        out.println(bobThere("b9b"));
        out.println(bobThere("bac"));
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }

        return false;
    }
}
