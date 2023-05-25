package lesson11;

import java.util.HashSet;
import java.util.LinkedList;

public class UnionElm {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);


        HashSet<Integer> set = new HashSet<>(list1);
        set.retainAll(list2);

        System.out.println("Cut:");
        for (int element : set) {
            System.out.println(element);
        }

        LinkedList<Integer> union = new LinkedList<>(list1);
        union.addAll(list2);

        System.out.println("Join:");
        for (int element : union) {
            System.out.println(element);
        }
    }
}
