/*
Task:
    Given a list of strings, return a list of the strings, omitting any string that contains a "z".
    (Note: the str.contains(x) method returns a boolean)

    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    noZ(["hziz", "hzello", "hi"]) → ["hi"]
    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */
package Java.Functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class noZ {
    public static void main(String[] args) {
        out.println(noZ(new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"))));
        out.println(noZ(new ArrayList<>(Arrays.asList("hziz", "hzello", "hi"))));
        out.println(noZ(new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"))));
    }

    static List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));

        return strings;
    }
}
