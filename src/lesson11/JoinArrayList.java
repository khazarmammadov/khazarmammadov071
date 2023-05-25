package lesson11;

import java.util.ArrayList;

public class JoinArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        list1.add(5);
        list1.add(1);
        list1.add(3);

        list2.add(4);
        list2.add(2);
        list2.add(6);

        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        for (int i = 0; i < mergedList.size() - 1; i++) {
            for (int j = i + 1; j < mergedList.size(); j++) {
                if (mergedList.get(i) > mergedList.get(j)) {
                    int temp = mergedList.get(i);
                    mergedList.set(i, mergedList.get(j));
                    mergedList.set(j, temp);
                }
            }
        }

        for (int element : mergedList) {
            System.out.println(element);
        }

    }
}
