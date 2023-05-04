/*
Task:
    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

    no34(["a", "bb", "ccc"]) → ["a", "bb"]
    no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
    no34(["ccc", "dddd", "apple"]) → ["apple"]
 */
package Java.Functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class no34 {
    public static void main(String[] args) {
        out.println(no34(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        out.println(no34(new ArrayList<>(Arrays.asList("a", "bb", "ccc", "dddd"))));
        out.println(no34(new ArrayList<>(Arrays.asList("ccc", "dddd", "apple"))));
    }

    public static List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }
}
