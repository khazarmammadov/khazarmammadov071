package lesson12;

import java.util.HashMap;
import java.util.Map;

public class StringSame {
    public static void main(String[] args) {
        String str = "Now traverse frequencies.";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();

        for (char c : arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                        + " : "
                        + entry.getValue());
            }
        }
    }


    }

