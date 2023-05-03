/*
Task:
    Modify and return the given map as follows:
    for this problem the map may or may not contain the "a" and "b" keys.
    If both keys are present, append their 2 string values together and store the result under the key "ab".

    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    mapAB({"a": "Hi"}) → {"a": "Hi"}
    mapAB({"b": "There"}) → {"b": "There"}
 */
package Java.Map1;

import java.util.HashMap;
import java.util.Map;

public class mapAB {
    public static void main(String[] args) {
        System.out.println(mapAB(new HashMap<>(){{put("a", "Hi"); put("b", "There");}}));
        System.out.println(mapAB(new HashMap<>(){{put("a", "Hi");}}));
        System.out.println(mapAB(new HashMap<>(){{put("b", "There");}}));
    }

    public static Map<String, String> mapAB(HashMap<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }
}
