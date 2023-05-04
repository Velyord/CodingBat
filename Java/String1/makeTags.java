/*
Task:
    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i"
    tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with
    tags around the word, e.g. "<i>Yay</i>".

    makeTags("i", "Yay") → "<i>Yay</i>"
    makeTags("i", "Hello") → "<i>Hello</i>"
    makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
package Java.String1;

import static java.lang.System.out;

public class makeTags {
    public static void main(String[] args) {
        out.println(makeTags("i", "Yay"));
        out.println(makeTags("i", "Hello"));
        out.println(makeTags("cite", "Yay"));
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
