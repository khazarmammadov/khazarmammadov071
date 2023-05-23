package lesson11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListToHashSet {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(37);
        list.add(13);
        list.add(3);
        list.add(3);
        list.add(43);
        list.add(43);
        list.add(12);

        HashSet<Integer> hashSet = new HashSet<>(list);

        for (Integer value : hashSet) {
            System.out.print(value + " ");
        }

    }
}
