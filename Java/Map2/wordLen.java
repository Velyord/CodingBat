/*
Task:
    Given an array of strings, return a Map<String, Integer>
    containing a key for every different string in the array,
    and the value is that string's length.

    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */
package Java.Map2;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class wordLen {
    public static void main(String[] args) {
        out.println(wordLen(new String[]{"a", "bb", "a", "bb"}));
        out.println(wordLen(new String[]{"this", "and", "that", "and"}));
        out.println(wordLen(new String[]{"code", "code", "code", "bug"}));
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, s.length());
        }

        return map;
    }
}
