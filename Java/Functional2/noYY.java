/*
Task:
    Given a list of strings, return a list where each string has "y" added at its end,
    omitting any resulting strings that contain "yy" as a substring anywhere.

    noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
    noYY(["a", "b", "cy"]) → ["ay", "by"]
    noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */
package Java.Functional2;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class noYY {
    public static void main(String[] args) {
        out.println(noYY(new ArrayList<>(Arrays.asList("a", "b", "c"))));
        out.println(noYY(new ArrayList<>(Arrays.asList("a", "b", "cy"))));
        out.println(noYY(new ArrayList<>(Arrays.asList("xx", "ya", "zz"))));
    }

    public static ArrayList<String> noYY(ArrayList<String> strings) {
        strings.replaceAll(s -> s + "y");
        strings.removeIf(s -> s.contains("yy"));

        return strings;
    }
}
