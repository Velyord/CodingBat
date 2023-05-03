/*
Task:
    Given a list of strings, return a list where each string has "y" added at its start and end.

    moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
    moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
    moreY(["yay"]) → ["yyayy"]
 */
package Java.Functional1;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class moreY {
    public static void main(String[] args) {
        out.println(moreY(Arrays.asList("a", "b", "c")));
        out.println(moreY(Arrays.asList("hello", "there")));
        out.println(moreY(Arrays.asList("yay")));
    }

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");

        return strings;
    }
}
