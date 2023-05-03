/*
Task:
    Given a list of strings, return a list where each string is converted to lower case
    (Note: String toLowerCase() method).

    lower(["Hello", "Hi"]) → ["hello", "hi"]
    lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
    lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */
package Java.Functional1;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class lower {
    public static void main(String[] args) {
        out.println(lower(Arrays.asList("Hello", "Hi")));
        out.println(lower(Arrays.asList("AAA", "BBB", "ccc")));
        out.println(lower(Arrays.asList("KitteN", "ChocolaTE")));
    }

    public static List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);

        return strings;
    }
}
