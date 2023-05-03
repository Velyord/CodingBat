/*
Task:
    We'll say that 2 strings "match" if they are non-empty and their first
    chars are the same. Loop over and then return the given array of non-empty
    strings as follows: if a string matches an earlier string in the array,
    swap the 2 strings in the array. When a position in the array has been
    swapped, it no longer matches anything. Using a map, this can be solved
    making just one pass over the array. More difficult than it looks.

    allSwap(["ab", "ac"]) → ["ac", "ab"]
    allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) →
        ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
    allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) →
        ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
 */
package Java.Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class allSwap {
    public static void main(String[] args) {
        out.println(Arrays.toString(allSwap(new String[]{"ab", "ac"})));
        out.println(Arrays.toString(allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        out.println(Arrays.toString(allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < strings.length; i++){
            String key = strings[i].substring(0, 1);

            if(map.containsKey(key)){
                String temp = strings[i];
                strings[i] = strings[map.get(key)];
                strings[map.get(key)] = temp;

                map.remove(key);
            } else{
                map.put(key, i);
            }
        }

        return strings;
    }
}
