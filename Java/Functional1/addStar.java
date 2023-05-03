/*
Task:
    Given a list of strings, return a list where each string has "*" added at its end.

    addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
    addStar(["hello", "there"]) → ["hello*", "there*"]
    addStar(["*"]) → ["**"]
 */
package Java.Functional1;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class addStar {
    public static void main(String[] args) {
        out.println(addStar(Arrays.asList("a", "bb", "ccc")));
        out.println(addStar(Arrays.asList("hello", "there")));
        out.println(addStar(Arrays.asList("*")));
    }

    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");

        return strings;
    }
}
