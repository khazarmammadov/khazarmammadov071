package lesson9;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {11, 4, 1, 0, 2, 10, 5, 3, 8, 9};

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min]) {
                    min = j;
                }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }


    System.out.println(Arrays.toString(arr));
}
}

