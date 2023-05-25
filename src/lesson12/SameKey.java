package lesson12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SameKey {
    public static void main(String[] args) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        map1.put('a',1);
        map1.put('b',2);
        map1.put('c',3);
        map1.put('d',4);
        map1.put('e',5);
        HashMap<Character,Integer> map2 = new HashMap<>();
        map2.put('a',1);
        map2.put('b',2);
        map2.put('w',3);
        map2.put('d',4);
        map2.put('q',5);
        Set<Character> sameKey = new HashSet<>(map1.keySet());
        sameKey.retainAll(map2.keySet());

        for (Character ch : sameKey) {
            System.out.println(ch);
        }
    }
}
