package lesson16;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        int[] revArr = Arrays.stream(arr).sorted((a, b) -> -Integer.compare(a, b)).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(revArr));
    }
}
