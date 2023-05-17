package lesson8;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (r + l) / 2;

            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77};
        int x = sc.nextInt();
        System.out.println(binarySearch(arr, x));


    }
}
