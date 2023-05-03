/*
Task:
    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

    copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    copies3(["24", "a", ""]) → ["242424", "aaa", ""]
    copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 */
package Java.Functional1;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class copies3 {
    public static void main(String[] args) {
        out.println(copies3(Arrays.asList("a", "bb", "ccc")));
        out.println(copies3(Arrays.asList("24", "a", "")));
        out.println(copies3(Arrays.asList("hello", "there")));
    }

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);

        return strings;
    }
}
