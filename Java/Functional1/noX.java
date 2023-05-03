/*
Task:
    Given a list of strings, return a list where each string has all its "x" removed.

    noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    noX(["x"]) → [""]
 */
package Java.Functional1;

import java.util.Arrays;

import static java.lang.System.out;

public class noX {
    public static void main(String[] args) {
        out.println(noX(Arrays.asList("ax", "bb", "cx")));
        out.println(noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
        out.println(noX(Arrays.asList("x")));
    }

    public static java.util.List<String> noX(java.util.List<String> strings) {
        strings.replaceAll(s -> s.replace("x", ""));

        return strings;
    }
}
