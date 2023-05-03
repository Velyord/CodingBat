/*
Task:
    Given an array of non-empty strings, return a Map<String, String>
    with a key for every different first character seen, with the value
    of all the strings starting with that character appended together
    in the order they appear in the array.

    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    firstChar([]) → {}
 */
package Java.Map2;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class firstChar {
    public static void main(String[] args) {
        out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        out.println(firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        out.println(firstChar(new String[]{}));
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            String key = s.substring(0, 1);

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + s);
            } else {
                map.put(key, s);
            }
        }

        return map;
    }
}
