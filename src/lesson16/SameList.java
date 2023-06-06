package lesson16;

import java.util.Arrays;
import java.util.List;

public class SameList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        List<Integer> integerList = list1.stream().distinct().filter(list2::contains).toList();

        for (Integer i : integerList) {
            System.out.println(i);
        }
    }
}
