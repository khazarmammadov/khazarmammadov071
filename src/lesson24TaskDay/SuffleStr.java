package lesson24TaskDay;

import java.util.Arrays;
import java.util.HashMap;

public class SuffleStr {
    public static void restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();

        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(indices[i], arr[i]);
        }
        Arrays.sort(indices);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(map.get(indices[i]));
        }
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        restoreString(s,indices);
    }
}
