package lesson5;

public class MinMaxArray {


    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,7,8,1,3,9,4,3,2,5,7,8};
        System.out.println("Max: " + max(arr));
        System.out.println("Min: " + min(arr));

    }
}
