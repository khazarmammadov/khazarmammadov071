package lesson15;

import java.util.ArrayList;
import java.util.List;

public class StrList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("A");
        list.add("b");
        list.add("R");

        StringList stringList = (List<String> strls) -> {
            StringBuilder sb = new StringBuilder();
            for (String strl : strls) {
                sb.append(strl.toUpperCase());
            }
            return sb.toString();
        };
        System.out.println(stringList.list(list));

    }
}

interface StringList {
    String list(List<String> list);
}
