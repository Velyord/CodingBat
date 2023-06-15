/*
Task:
    Given two strings, return true if either of the strings appears at the very
    end of the other string, ignoring upper/lower case differences (in other
    words, the computation should not be "case sensitive"). Note:
    str.toLowerCase() returns the lowercase version of a string.

Examples:
    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
 */
package Java.String2;

import static java.lang.System.out;

public class endOther {
    public static void main(String[] args) {
        out.println(endOther("Hiabc", "abc"));
        out.println(endOther("AbC", "HiaBc"));
        out.println(endOther("abc", "abXabc"));
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() > b.length()) {
            return a.endsWith(b);
        } else {
            return b.endsWith(a);
        }
    }
}
