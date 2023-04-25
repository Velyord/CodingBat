/*
Task:
    Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z',
    so "ozymandias" yields "oz".
 */
package Java.Warmup1;

import static java.lang.System.out;

public class startOz {
    public static void main(String[] args) {
        out.println(startOz("ozymandias"));
        out.println(startOz("bzoo"));
        out.println(startOz("oxx"));
    }

    public static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += 'o';
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += 'z';
        }

        return result;
    }
}
