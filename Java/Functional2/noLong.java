/*
Task:
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.

    noLong(["this", "not", "too", "long"]) → ["not", "too"]
    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    noLong(["cccc", "cccc", "cccc"]) → []
 */
package Java.Functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class noLong {
    public static void main(String[] args) {
        out.println(noLong(new ArrayList<>(Arrays.asList("this", "not", "too", "long"))));
        out.println(noLong(new ArrayList<>(Arrays.asList("a", "bbb", "cccc"))));
        out.println(noLong(new ArrayList<>(Arrays.asList("cccc", "cccc", "cccc"))));
    }

    public static List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() > 3);
        return strings;
    }
}
