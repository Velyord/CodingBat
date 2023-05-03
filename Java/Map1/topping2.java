/*
Task:
    Given a map of food keys and their topping values,
    modify and return the map as follows:
    if the key "ice cream" has a value,
    set that as the value for the key "yogurt" also.
    If the key "spinach" has a value, change that value to "nuts".
 */
package Java.Map1;

import java.util.HashMap;

public class topping2 {
    public static void main(String[] args) {
        System.out.println(topping2(new HashMap<>(){{put("ice cream", "cherry"); put("spinach", "dirt");}}));
        System.out.println(topping2(new HashMap<>(){{put("spinach", "dirt");}}));
        System.out.println(topping2(new HashMap<>(){{put("yogurt", "salt");}}));
    }

    public static HashMap<String, String> topping2(HashMap<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }
}
