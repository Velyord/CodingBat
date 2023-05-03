/*
Task:
    Modify and return the given map as follows:
    if the key "a" has a value, set the key "b" to have that value,
    and set the key "a" to have the value "".
    Basically "b" is a bully, taking the value and replacing it with the empty string.

    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
    mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
package Java.Map1;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class mapBully {
    public static void main(String[] args) {
        out.println(mapBully(new HashMap<>(){{put("a", "candy"); put("b", "dirt");}}));
        out.println(mapBully(new HashMap<>(){{put("a", "candy");}}));
        out.println(mapBully(new HashMap<>(){{put("a", "candy"); put("b", "carrot"); put("c", "meh");}}));
    }

    public static Map<String, String> mapBully(HashMap<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }
}
