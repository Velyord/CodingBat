/*
Task:
    Given an array of non-empty strings, create and return a Map<String, String>
    as follows: for each string add its first character as a key with its last
    character as the value.

    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    pairs(["man", "moon", "main"]) → {"m": "n"}
    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */
package Java.Map2;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class pairs {
    public static void main(String[] args) {
        out.println(pairs(new String[]{"code", "bug"}));
        out.println(pairs(new String[]{"man", "moon", "main"}));
        out.println(pairs(new String[]{"man", "moon", "good", "night"}));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }

        return map;
    }
}
