/*
Task:
    Given a map of food keys and topping values, modify and return the map as follows:
    if the key "potato" has a value, set that as the value for the key "fries".
    If the key "salad" has a value, set that as the value for the key "spinach".

    topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
    topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
    topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 */
package Java.Map1;

import java.util.HashMap;

public class topping3 {
    public static void main(String[] args) {
        System.out.println(topping3(new HashMap<>(){{put("potato", "ketchup");}}));
        System.out.println(topping3(new HashMap<>(){{put("potato", "butter");}}));
        System.out.println(topping3(new HashMap<>(){{put("salad", "oil"); put("potato", "ketchup");}}));
    }

    public static HashMap<String, String> topping3(HashMap<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }
}
