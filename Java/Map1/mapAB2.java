/*
Task:
    Modify and return the given map as follows:
    if the keys "a" and "b" are both in the map and have equal values,
    remove them both.
 */
package Java.Map1;

import java.util.HashMap;

public class mapAB2 {
    public static void main(String[] args) {
        System.out.println(mapAB2(new HashMap<>(){{put("a", "aaa"); put("b", "aaa"); put("c", "cake");}}));
        System.out.println(mapAB2(new HashMap<>(){{put("a", "aaa"); put("b", "bbb");}}));
        System.out.println(mapAB2(new HashMap<>(){{put("a", "aaa"); put("b", "bbb"); put("c", "aaa");}}));
    }

    public static HashMap<String, String> mapAB2(HashMap<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }

        return map;
    }
}
