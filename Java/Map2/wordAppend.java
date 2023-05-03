/*
Task:
    Loop over the given array of strings to build a result string like this:
    when a string appears the 2nd, 4th, 6th, etc. time in the array,
    append the string to the result. Return the empty string if no string
    appears a 2nd time.

    wordAppend(["a", "b", "a"]) → "a"
    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
    wordAppend(["a", "", "a"]) → "a"
 */
package Java.Map2;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class wordAppend {
    public static void main(String[] args) {
        out.println(wordAppend(new String[]{"a", "b", "a"}));
        out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        out.println(wordAppend(new String[]{"a", "", "a"}));
    }

    public static String wordAppend(String[] strings) {
        Map<String, String> map =new HashMap();
        StringBuilder str = new StringBuilder();

        for(String s : strings){
            if(!map.containsKey(s))
                map.put(s, s);
            else{
                str.append(s);
                map.remove(s);
            }
        }
        return str.toString();
    }
}
