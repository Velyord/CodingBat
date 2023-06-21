/*
Task:
    Return true if the given string contains an appearance of "xyz" where the
    xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz"
    does not.

Examples:
    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
 */
package Java.String2;

import static java.lang.System.out;

public class xyzThere {
public static void main(String[] args) {
        out.println(xyzThere("abcxyz"));
        out.println(xyzThere("abc.xyz"));
        out.println(xyzThere("xyz.abc"));
    }

    public static boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("xyz", i)) {
                if (i == 0) {
                    return true;
                } else if (str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }

        return false;
    }
}
